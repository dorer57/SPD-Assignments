public class TvDisplay implements PlayerObserver {
    public void update(String line) {
        System.out.println("   [TV] " + line);
    }
}
