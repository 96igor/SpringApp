package ru.alishev.springcourse2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        List<String> rockSongs = music1.getSong();
        List<String> classicalSongs = music2.getSong();

        return "Playing rock: " + String.join(", ", rockSongs) +
                "\nPlaying classical: " + String.join(", ", classicalSongs);
    }
}
