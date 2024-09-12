package ru.alishev.springcourse2;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private final List<String> songs;

    public ClassicalMusic() {
        songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Moonlight Sonata");
        songs.add("The Four Seasons");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
