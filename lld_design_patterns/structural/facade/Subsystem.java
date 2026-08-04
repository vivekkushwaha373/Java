package lld_design_patterns.structural.facade;

// --- Subsystem Classes ---
// Imagine these are from a complex 3rd party video processing library.

public class VideoFile {
    private String name;
    public VideoFile(String name) {
        this.name = name;
    }
    public String getName() { return name; }
}

class CodecFactory {
    public static String extract(VideoFile file) {
        System.out.println("CodecFactory: extracting audio/video from " + file.getName());
        return "mp4";
    }
}

class AudioMixer {
    public void fixAudio() {
        System.out.println("AudioMixer: fixing audio sync...");
    }
}
