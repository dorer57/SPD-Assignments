import java.util.ArrayList;
import java.util.List;

public class ShortestFirst implements PlayOrder {
    public List<Song> arrange(List<Song> songs) {
        List<Song> result = new ArrayList<>(songs);
        result.sort((a, b) -> a.getDurationSeconds() - b.getDurationSeconds());
        return result;
    }
}
