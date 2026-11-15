public class LyricsDisplay implements PlayerObserver {
    public void update(String line) {
        System.out.println("   [Lyrics] " + line);
    }
}
