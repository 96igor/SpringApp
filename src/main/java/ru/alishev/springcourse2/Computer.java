package ru.alishev.springcourse2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private Random random;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
        this.random = new Random();
    }

    @Override
    public String toString() {

        MusicGenres randomGenre = getRandomGenre();
        return "Computer " + id + " " + musicPlayer.playMusic(randomGenre);
    }

    private MusicGenres getRandomGenre() {
        MusicGenres[] genres = MusicGenres.values();
        int randomIndex = random.nextInt(genres.length);
        return genres[randomIndex];
    }
}
