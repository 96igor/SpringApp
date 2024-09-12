package ru.alishev.springcourse2;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        songs.add("Wind cries Mary");
        songs.add("Smoke on the Water");
        songs.add("Kashmir");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}

