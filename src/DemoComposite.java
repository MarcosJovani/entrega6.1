public class DemoComposite {
    public static void main(String[] args) {
// Make "Sabina's hits" playlist and add 2 songs to it
        PlayList sabinaPlaylist = new PlayList("Sabina's hits");
        sabinaPlaylist.add(new Song("Princesa", "Joaquín Sabina"));
        sabinaPlaylist.add(new Song("Calle melancolía", "Joaquín Sabina"));
// Make "Manolo García's hits" playlist and add 3 song to it
        PlayList garciaPlaylist = new PlayList("Manolo Garcia's hits");
        garciaPlaylist.add(new Song("Pájaros de barro", "Manolo García"));
        garciaPlaylist.add(new Song("Zapatero", "Manolo García"));
        garciaPlaylist.add(new Song("A San Fernando, un ratito a pie y otro caminando", "Manolo García"));
// Make "my songs" playlist; add the two playlists and one single song
        PlayList mySongs = new PlayList("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);
        mySongs.add(new Song("Penso positivo", "Lorenzo Jovanotti"));
// Play all songs of each playlist
        mySongs.play();
    }
}