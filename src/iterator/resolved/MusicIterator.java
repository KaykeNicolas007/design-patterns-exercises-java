package iterator.resolved;

import java.util.List;

public class MusicIterator implements Iterator {
    private final List<Music> musicList;
    private int index;

    public MusicIterator(List<Music> newMusicList) {
        musicList = newMusicList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < musicList.size();
    }

    @Override
    public Object next() {
        return musicList.get(index++);
    }
}
