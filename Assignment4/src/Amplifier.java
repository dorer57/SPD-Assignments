public class Amplifier {
    private boolean on;
    private DvdPlayer source;

    public void on() {
        on = true;
        System.out.println("Amplifier on");
    }

    public void off() {
        on = false;
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        source = dvd;
        System.out.println("Amplifier input set to DVD player");
    }

    public void setVolume(int level) {
        if (!on) {
            throw new IllegalStateException("Amplifier is off, cannot set volume");
        }
        if (level < 0 || level > 10) {
            throw new IllegalArgumentException("Volume must be between 0 and 10, but was " + level);
        }
        System.out.println("Amplifier volume set to " + level);
    }
}