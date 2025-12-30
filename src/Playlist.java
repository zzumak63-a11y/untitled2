import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Get all songs in the playlist
    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", Songs: " + songs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Playlist playlist = (Playlist) obj;
        return name.equals(playlist.name) && songs.equals(playlist.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, songs);
    }
}
