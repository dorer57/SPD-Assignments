public class Speakers implements AudioOutput {
    public void send(String sound) {
        System.out.println("[Speakers] " + sound);
    }
}
