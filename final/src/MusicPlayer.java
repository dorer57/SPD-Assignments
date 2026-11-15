import java.util.ArrayList;
import java.util.List;

public abstract class MusicPlayer implements Subject {
    protected final AudioOutput output;
    private final List<PlayerObserver> observers = new ArrayList<>();

    public MusicPlayer(AudioOutput output) {
        this.output = output;
    }

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PlayerObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String line) {
        for (PlayerObserver observer : observers) {
            observer.update(line);
        }
    }

    public abstract void play(Song song, AudioStream stream);

    protected void playSong(Song song, AudioStream stream) {
        output.send(stream.getSound());
        for (String line : song.getLyrics()) {
            notifyObservers(line);
        }
    }
}
