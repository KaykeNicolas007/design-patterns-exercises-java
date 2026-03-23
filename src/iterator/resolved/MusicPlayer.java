package iterator.resolved;

import java.util.List;

public class MusicPlayer {
    public void play(Playlist playlist) {
        Iterator<Music> iterator = playlist.createIterator();

        while (iterator.hasNext())
            System.out.println("Playing: " + iterator.next().getTitle());
    }
}
