public class BasicStream implements AudioStream {
    private final Song song;

    public BasicStream(Song song) {
        this.song = song;
    }

    public String getSound() {
        return song.getTitle() + " by " + song.getArtist();
    }
}
