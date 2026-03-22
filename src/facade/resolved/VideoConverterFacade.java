package facade.resolved;

public class VideoConverterFacade {
    public static void ConvertVideo() {
        VideoFile file = new VideoFile("my_video.mp4");

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec = new OggCodec();

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        AudioMixer audioMixer = new AudioMixer();
        VideoFile result = audioMixer.fix(intermediateResult);

        System.out.println("Converted file: " + result.getFilename());
    }
}
