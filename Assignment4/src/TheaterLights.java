public class TheaterLights {
    public void on() {
        System.out.println("Lights on");
    }

    public void dim(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Brightness must be between 0 and 100, but was " + level);
        }
        System.out.println("Lights dimmed to " + level + "%");
    }
}