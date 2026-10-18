public class HomeTheaterFacade {
    private Amplifier amp = new Amplifier();
    private DvdPlayer dvd = new DvdPlayer();
    private Projector projector = new Projector();
    private TheaterLights lights = new TheaterLights();

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        try {
            lights.dim(10);
            projector.on();
            projector.wideScreenMode();
            amp.on();
            amp.setDvd(dvd);
            amp.setVolume(5);
            dvd.on();
            dvd.play(movie);
        } catch (RuntimeException e) {
            endMovie();
            throw new HomeTheaterException("Could not start the movie: " + e.getMessage());
        }
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.stop();
        dvd.off();
        amp.off();
        projector.off();
        lights.on();
    }
}