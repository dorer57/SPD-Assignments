public class Song implements MediaItem {
    private final String title;
    private final String artist;
    private final int durationSeconds;
    private final String[] lyrics;

    public Song(String title, String artist, int durationSeconds, String... lyrics) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public String[] getLyrics() {
        return lyrics;
    }

    public void accept(LibraryVisitor visitor) {
        visitor.visitSong(this);
    }
}
