package ru.alishev.springcourse2;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarian Rhapsody", "Moonlight Sonata", "The Four Seasons");
    }
}