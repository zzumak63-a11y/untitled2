import java.util.Objects;

public class Song {
    private String title;
    private String genre;
    private int duration; // in seconds

    public Song(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song: " + title + ", Genre: " + genre + ", Duration: " + duration + " seconds";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return duration == song.duration && title.equals(song.title) && genre.equals(song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, duration);
    }
}
