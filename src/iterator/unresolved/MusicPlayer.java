package iterator.unresolved;

import java.util.List;

public class MusicPlayer {
    public void play(Playlist playlist) {
        List<Music> musics = playlist.getMusics();

        for (int i = 0; i < musics.size(); i++) {
            Music music = musics.get(i);
            System.out.println("Playing: " + music.getTitle());
        }
    }
}
