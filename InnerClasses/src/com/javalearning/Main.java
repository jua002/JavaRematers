package com.javalearning;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("African Giant", "Burna Boy");
        album.addSong("African Giant", 3.05);
        album.addSong("Anybody", 3.09);
        album.addSong("Dangote", 3.46);
        album.addSong("Gum Body", 3.15);
        album.addSong("Killin Dem", 3.41);
        album.addSong("Collateral Damage", 4.15);
        album.addSong("Another Story", 4.16);
        album.addSong("Gbona", 3.08);
        album.addSong("On the Low", 3.06);
        albums.add(album);

        album = new Album("A Better Time", "Davido");
        album.addSong("FEM", 3.22);
        album.addSong("Jowo", 2.27);
        album.addSong("Something Fishy", 2.53);
        album.addSong("Holy Ground", 2.42);
        album.addSong("Heaven", 3.10);
        album.addSong("The Best", 2.52);
        album.addSong("So Crazy", 2.50);
        album.addSong("Focalistic", 4.20);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Anybody", playList);
        albums.get(0).addToPlayList("Dangote", playList);
        albums.get(0).addToPlayList("Killin Dem", playList);
        albums.get(0).addToPlayList("On the Low", playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(6, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(9, playList);

        play(playList);



    }

    public static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("playList Complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the List");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }


    }
    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("""
                0 - to quit
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - list songs in the playlist
                5 - print available actions.
                6 - delete current song from playlist""");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

}
