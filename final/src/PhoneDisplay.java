public class PhoneDisplay implements PlayerObserver {
    public void update(String line) {
        System.out.println("   [Phone] " + line);
    }
}
