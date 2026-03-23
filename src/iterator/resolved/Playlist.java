package iterator.resolved;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Music> musics = new ArrayList<>();

    public void addMusic(Music music) {
        musics.add(music);
    }

    public Iterator<Music> createIterator() {
        return new MusicIterator(musics);
    }
}
