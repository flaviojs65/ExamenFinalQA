package com.ProjectFinal.Test;

import java.util.ArrayList;

public class MusicExchangeCenter {
    private ArrayList<User> userList = new ArrayList<>();

    public MusicExchangeCenter() {
        // TODO Auto-generated constructor stub
    }

    public ArrayList<User> onlineUsers() {
        ArrayList<User> onlineUsersList = new ArrayList<>();
        for (User u : userList) {
            if (u.isOnline()) {
                onlineUsersList.add(u);
            }
        }
        return onlineUsersList;

    }

    public ArrayList<Song> allAvailableSongs() {
        ArrayList<Song> allSongList = new ArrayList<>();
        for (User u : userList) {
            if (u.isOnline()) {
                allSongList.addAll(u.getSongList());
            }
        }
        return allSongList;
    }

    public ArrayList<Song> availableSongsByArtist(String artist) {
        ArrayList<Song> allSongListArtist = new ArrayList<>();
        for (User u : userList) {
            if (u.isOnline()) {
                for (Song s : u.getSongList()) {
                    if (s.getArtist().equalsIgnoreCase(artist)) {
                        allSongListArtist.add(s);
                    }
                }
            }
        }
        return allSongListArtist;
    }

    public String toString() {
        return "Music Exchange Center(" + onlineUsers().size() + " clients on line," + allAvailableSongs().size()
                + " songs avaialble)";
    }

    public User usersWithName(String s) {
        User user = new User();
        for (User u : userList) {
            if (u.getUserName().equalsIgnoreCase(s)) {
                user = u;
                break;
            }
        }
        return user;
    }

    public void registerUser(User x) {
        User u = usersWithName(x.getUserName());
        if (u.getUserName() == null) {
            userList.add(x);
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

}
