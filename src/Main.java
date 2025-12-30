public class Main {
    public static void main(String[] args) {
        // Create Songs
        Song song1 = new Song("Shape of You", "Pop", 240);
        Song song2 = new Song("Blinding Lights", "R&B", 200);
        Song song3 = new Song("Levitating", "Pop", 220);

        // Create Artist
        Artist artist = new Artist("Ed Sheeran", "Pop");

        // Create Playlist
        Playlist playlist = new Playlist("My Favorite Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        // Display Playlist Details
        System.out.println(playlist);

        // Display Artist and Song Details
        System.out.println(artist);
        System.out.println(song1);

        // Check if a song is in the playlist
        System.out.println("Is 'Shape of You' in the playlist? " + playlist.getSongs().contains(song1));

        // Remove a song and display the playlist again
        playlist.removeSong(song2);
        System.out.println("Updated Playlist: " + playlist);
    }
}
