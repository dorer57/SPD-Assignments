import java.util.ArrayList;
import java.util.List;

public class InOrder implements PlayOrder {
    public List<Song> arrange(List<Song> songs) {
        return new ArrayList<>(songs);
    }
}
