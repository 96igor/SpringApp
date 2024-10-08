package ru.alishev.springcourse2;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList = new ArrayList<>();




    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List musicList) { this.musicList = musicList; }

    public MusicPlayer() {}

    public void playMusic(){
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
