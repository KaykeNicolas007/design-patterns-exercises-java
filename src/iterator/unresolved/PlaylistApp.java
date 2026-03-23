package iterator.unresolved;

public class PlaylistApp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addMusic(new Music("Music A"));
        playlist.addMusic(new Music("Music B"));
        playlist.addMusic(new Music("Music C"));

        MusicPlayer player = new MusicPlayer();
        player.play(playlist);
    }
}
