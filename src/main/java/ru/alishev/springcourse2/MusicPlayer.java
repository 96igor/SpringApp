package ru.alishev.springcourse2;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> musicList;
    private Random random = new Random();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;

    }

    public String playMusic() {
        int randomIndex = random.nextInt(musicList.size());
        Music randomMusic = musicList.get(randomIndex);
        return "Playing: " + randomMusic.getSong();
    }
}
