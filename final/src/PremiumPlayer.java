public class PremiumPlayer extends MusicPlayer {
    public PremiumPlayer(AudioOutput output) {
        super(output);
    }

    public void play(Song song, AudioStream stream) {
        playSong(song, stream);
    }
}
