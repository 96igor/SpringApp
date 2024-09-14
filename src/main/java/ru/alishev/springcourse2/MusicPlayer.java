package ru.alishev.springcourse2;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;

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

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;

    }

    public String playMusic() {
        StringBuilder sb = new StringBuilder("Playing: ");
        for (Music music : musicList) {
            sb.append(music.getSong()).append(", ");
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}
