package lld_design_patterns.structural.facade;

/**
 * BAD EXAMPLE: The client is forced to understand and orchestrate 
 * the entire complex subsystem.
 */
public class BadClient {
    
    public void convertVideo() {
        System.out.println("Client starts video conversion...");
        
        // Client has to know about all these internal classes!
        VideoFile file = new VideoFile("funny_cats.mp4");
        String codec = CodecFactory.extract(file);
        
        if (codec.equals("mp4")) {
            System.out.println("Applying MP4 compression...");
        }
        
        AudioMixer mixer = new AudioMixer();
        mixer.fixAudio();
        
        System.out.println("Client finished video conversion.");
    }
}
