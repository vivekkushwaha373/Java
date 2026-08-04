package lld_design_patterns.structural.facade;

/**
 * GOOD EXAMPLE: The Facade class.
 * 
 * It provides a simple, clean method for the most common task.
 * The client only needs to call this one method and doesn't need to know 
 * about VideoFile, CodecFactory, or AudioMixer.
 */
public class VideoConversionFacade {
    
    public void convertVideo(String fileName, String format) {
        System.out.println("Facade: Starting conversion...");
        
        // The facade handles all the complex orchestration
        VideoFile file = new VideoFile(fileName);
        String codec = CodecFactory.extract(file);
        
        System.out.println("Facade: converting " + codec + " to " + format);
        
        AudioMixer mixer = new AudioMixer();
        mixer.fixAudio();
        
        System.out.println("Facade: Conversion completed!");
    }
}
