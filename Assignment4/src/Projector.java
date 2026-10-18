public class Projector {
    private boolean on;

    public void on() {
        on = true;
        System.out.println("Projector on");
    }

    public void off() {
        on = false;
        System.out.println("Projector off");
    }

    public void wideScreenMode() {
        if (!on) {
            throw new IllegalStateException("Projector is off, cannot switch to widescreen mode");
        }
        System.out.println("Projector in widescreen mode");
    }
}