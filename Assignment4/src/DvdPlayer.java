public class DvdPlayer {
    private boolean on;

    public void on() {
        on = true;
        System.out.println("DVD player on");
    }

    public void off() {
        on = false;
        System.out.println("DVD player off");
    }

    public void play(String movie) {
        if (!on) {
            throw new IllegalStateException("DVD player is off, cannot play the movie");
        }
        if (movie == null || movie.isEmpty()) {
            throw new IllegalArgumentException("Movie title is empty");
        }
        System.out.println("DVD player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("DVD player stopped");
    }
}