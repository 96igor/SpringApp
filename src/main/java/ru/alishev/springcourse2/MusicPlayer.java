package ru.alishev.springcourse2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private final Music rockMusic;
    private final Music classicalMusic;
    private final Random random;

    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.random = new Random();
    }

    public String playMusic(MusicGenres genre) {
        List<String> songs;
        String song;

        // Определяем, какой жанр был передан и выбираем соответствующий список песен
        if (genre == MusicGenres.RockMusic) {
            songs = rockMusic.getSong();
            song = songs.get(random.nextInt(songs.size()));  // Случайная рок-песня
            return "Playing rock: " + song;
        } else if (genre == MusicGenres.ClassicalMusic) {
            songs = classicalMusic.getSong();
            song = songs.get(random.nextInt(songs.size()));  // Случайная классическая песня
            return "Playing classical: " + song;
        }

        return "Unknown genre!";
    }
}


