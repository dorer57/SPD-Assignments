public class TotalDuration implements LibraryVisitor {
    private int totalSeconds = 0;

    public void visitSong(Song song) {
        totalSeconds += song.getDurationSeconds();
    }

    public void visitPodcast(Podcast podcast) {
        totalSeconds += podcast.getDurationSeconds();
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }
}
