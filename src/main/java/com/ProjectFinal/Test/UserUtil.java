package com.ProjectFinal.Test;

import java.util.ArrayList;

public class UserUtil {

    private String userName;
    private boolean online;
    private ArrayList<String> songList = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public boolean isOnline() {
        return online;
    }

    public String toString() {
        String s = "" + userName + ": " + this.songList.size() + "songs (";
        if (!online)
            s += "not ";
        return s + "online)";
    }

    public ArrayList<String> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<String> songList) {
        this.songList = songList;
    }

    public void ajouterSong(String song) {
        songList.add(song);
    }

    public void removeSong (String song) {
        songList.remove(song);
    }

    public String getSong(String song) {
        return songList.get(songList.indexOf(song));
    }

    public boolean listEmpty () {
        return songList.isEmpty();
    }

    public int songListSize() {
        return songList.size();
    }

    public boolean listContainsSong (String song) {
        return songList.contains(song);
    }
}
