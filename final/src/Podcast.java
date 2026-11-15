public class Podcast implements MediaItem {
    private final String title;
    private final String host;
    private final int durationSeconds;

    public Podcast(String title, String host, int durationSeconds) {
        this.title = title;
        this.host = host;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getHost() {
        return host;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void accept(LibraryVisitor visitor) {
        visitor.visitPodcast(this);
    }
}
