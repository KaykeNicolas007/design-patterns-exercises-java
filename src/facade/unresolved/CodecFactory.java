package facade.unresolved;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        if (file.getFilename().endsWith(".mp4")) {
            return new MPEG4Codec();
        } else {
            return new OggCodec();
        }
    }
}
