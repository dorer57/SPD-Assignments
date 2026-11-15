public class KaraokeScreen implements PlayerObserver {
    public void update(String line) {
        System.out.println("   [Karaoke] " + line.toUpperCase());
    }
}
