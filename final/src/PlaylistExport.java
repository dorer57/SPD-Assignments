public class PlaylistExport implements LibraryVisitor {
    private final StringBuilder result = new StringBuilder();

    public void visitSong(Song song) {
        result.append("Song: " + song.getTitle() + " - " + song.getArtist() + "\n");
    }

    public void visitPodcast(Podcast podcast) {
        result.append("Podcast: " + podcast.getTitle() + " - hosted by " + podcast.getHost() + "\n");
    }

    public String getResult() {
        return result.toString();
    }
}
