import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private final List<Song> songs = new ArrayList<>();
    private final List<Podcast> podcasts = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addPodcast(Podcast podcast) {
        podcasts.add(podcast);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public void accept(LibraryVisitor visitor) {
        for (Song song : songs) {
            song.accept(visitor);
        }
        for (Podcast podcast : podcasts) {
            podcast.accept(visitor);
        }
    }
}
