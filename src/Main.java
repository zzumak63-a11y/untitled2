public class Song {
    private String title;
    private int duration; // seconds

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing song: " + title);
    }
}
public class Artist {
    private String name;
    private int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showArtist() {
        System.out.println("Artist: " + name + ", Age: " + age);
    }
}
public class Playlist {
    private String playlistName;
    private Song song;

    public Playlist(String playlistName, Song song) {
        this.playlistName = playlistName;
        this.song = song;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public Song getSong() {
        return song;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void showPlaylist() {
        System.out.println("Playlist: " + playlistName);
        System.out.println("Song: " + song.getTitle());
    }
}
public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Shape of You", 240);
        Song song2 = new Song("Believer", 210);

        Artist artist = new Artist("Ed Sheeran", 32);

        Playlist playlist1 = new Playlist("My Favorites", song1);
        Playlist playlist2 = new Playlist("My Favorites", song2);

        song1.play();
        artist.showArtist();
        playlist1.showPlaylist();

        // Comparing objects
        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " is longer than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " is longer than " + song1.getTitle());
        }
    }
}
