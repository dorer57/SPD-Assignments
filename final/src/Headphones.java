public class Headphones implements AudioOutput {
    public void send(String sound) {
        System.out.println("[Headphones] " + sound);
    }
}
