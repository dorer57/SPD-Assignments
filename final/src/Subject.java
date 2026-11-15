public interface Subject {
    void addObserver(PlayerObserver observer);
    void removeObserver(PlayerObserver observer);
    void notifyObservers(String line);
}
