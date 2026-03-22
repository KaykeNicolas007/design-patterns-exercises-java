package facade.resolved;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading file: " + file.getFilename());
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting file...");
        return buffer;
    }
}
