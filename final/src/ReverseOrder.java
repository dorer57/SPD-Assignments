import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder implements PlayOrder {
    public List<Song> arrange(List<Song> songs) {
        List<Song> result = new ArrayList<>(songs);
        Collections.reverse(result);
        return result;
    }
}
