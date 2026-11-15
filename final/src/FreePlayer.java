public class FreePlayer extends MusicPlayer {
    public FreePlayer(AudioOutput output) {
        super(output);
    }

    public void play(Song song, AudioStream stream) {
        output.send("Ad: upgrade to Premium to skip ads");
        playSong(song, stream);
    }
}
