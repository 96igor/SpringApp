package ru.alishev.springcourse2;

import org.springframework.beans.factory.annotation.Qualifier;
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

    private Music music1;
    private Music music2;
    private Music music3;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;

    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong() + ", " + music3.getSong();
    }
}
