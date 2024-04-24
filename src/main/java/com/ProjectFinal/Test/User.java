package com.ProjectFinal.Test;

import java.util.ArrayList;

public class User {

    private String userName;
    private boolean online;
    private ArrayList<Song> songList = new ArrayList<>();

    public User() {}

    public User(String u, ArrayList<Song> songs) {
        userName = u;
        online = false;
        songList = songs;
    }

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

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    // Various Users for test purposes
    public static User DiscoStew() {
        ArrayList<Song> sList = new ArrayList<>();
        User discoStew = new User("Disco Stew", sList);
        discoStew.addSong(new Song("Hey Jude", "The Beatles", 4, 35));
        discoStew.addSong(new Song("Barbie Girl", "Aqua", 3, 54));
        discoStew.addSong(new Song("Only You Can Rock Me", "UFO", 4, 59));
        discoStew.addSong(new Song("Paper Soup Cats", "Jaw", 4, 18));
        return discoStew;

    }

    public static User SleepingSam() {
        ArrayList<Song> sList = new ArrayList<>();
        User sleepingSam = new User("Sleeping Sam", sList);
        sleepingSam.addSong(new Song("Meadows", "Sleepfest", 7, 15));
        sleepingSam.addSong(new Song("Calm is Good", "Waterfall", 6, 22));
        return sleepingSam;

    }

    public static User RonnieRocker() {
        ArrayList<Song> sList = new ArrayList<>();
        User ronnieRocker = new User("Ronnie Rocker", sList);
        ronnieRocker.addSong(new Song("Rock is Cool", "Yeah", 4, 17));
        ronnieRocker.addSong(new Song("My Girl is Mean to Me", "Can't Stand Up", 3, 29));
        ronnieRocker.addSong(new Song("Only You Can Rock Me", "UFO", 4, 52));
        ronnieRocker.addSong(new Song("We're Not Gonna Take It", "Twisted Sister", 3, 9));
        return ronnieRocker;

    }

    public static User CountryCandy() {
        ArrayList<Song> sList = new ArrayList<>();
        User countryCandy = new User("Country Candy", sList);
        countryCandy.addSong(new Song("If I Had a Hammer", "Long Road", 4, 15));
        countryCandy.addSong(new Song("My Man is a 4x4 Driver", "Ms. Lonely", 3, 7));
        countryCandy.addSong(new Song("This Song is for Johnny", "Lone Wolf", 4, 22));
        return countryCandy;
    }

    public static User PeterPunk() {
        ArrayList<Song> sList = new ArrayList<>();
        User peterPunk = new User("Peter Punk", sList);
        peterPunk.addSong(new Song("Bite My Arms Off", "Jaw", 4, 12));
        peterPunk.addSong(new Song("Where's My Sweater", "The Knitters", 3, 41));
        peterPunk.addSong(new Song("Is that My Toenail ?", "Clip", 4, 47));
        peterPunk.addSong(new Song("Anvil Headache", "Clip", 4, 34));
        peterPunk.addSong(new Song("My Hair is on Fire", "Jaw", 3, 55));
        return peterPunk;

    }

    public void addSong(Song s) {
        this.songList.add(s);
    }

    public int totalSongTime() {
        int time = 0;
        for (Song s : songList) {
            time += s.getDuration();
        }

        return time;

    }

    public void register(MusicExchangeCenter m) {
        User u = new User();
        u.userName = this.userName;
        u.songList = this.songList;
        u.online = this.online;
        m.registerUser(u);
    }

    public void logon(MusicExchangeCenter m) {
        User u = m.usersWithName(this.getUserName());
        if (u != null) {
            u.online = true;
        }

    }

    public void logoff(MusicExchangeCenter m) {
        User u = m.usersWithName(this.getUserName());
        if (u != null && u.isOnline()) {
            u.online = false;
        }
    }
}