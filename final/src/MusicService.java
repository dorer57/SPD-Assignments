public class MusicService {
    private final MusicLibrary library;
    private final MusicPlayer player;
    private PlayOrder playOrder = new InOrder();
    private boolean bassBoost = false;
    private boolean echo = false;

    public MusicService(MusicLibrary library, MusicPlayer player) {
        this.library = library;
        this.player = player;
    }

    public void play(String title) {
        Song song = library.findSong(title);
        if (song == null) {
            System.out.println("Song not found: " + title);
            return;
        }
        player.play(song, buildStream(song));
    }

    public void playAll() {
        for (Song song : playOrder.arrange(library.getSongs())) {
            player.play(song, buildStream(song));
        }
    }

    public void setPlayOrder(PlayOrder playOrder) {
        this.playOrder = playOrder;
    }

    public void enableBassBoost() {
        bassBoost = true;
    }

    public void enableEcho() {
        echo = true;
    }

    public void clearEffects() {
        bassBoost = false;
        echo = false;
    }

    public void subscribe(PlayerObserver observer) {
        player.addObserver(observer);
    }

    public void unsubscribe(PlayerObserver observer) {
        player.removeObserver(observer);
    }

    public void showLibraryStats() {
        TotalDuration totalDuration = new TotalDuration();
        library.accept(totalDuration);
        int seconds = totalDuration.getTotalSeconds();
        System.out.println("Total duration: " + seconds / 60 + " min " + seconds % 60 + " sec");

        PlaylistExport export = new PlaylistExport();
        library.accept(export);
        System.out.print(export.getResult());
    }

    private AudioStream buildStream(Song song) {
        AudioStream stream = new BasicStream(song);
        if (bassBoost) {
            stream = new BassBoost(stream);
        }
        if (echo) {
            stream = new Echo(stream);
        }
        return stream;
    }
}
