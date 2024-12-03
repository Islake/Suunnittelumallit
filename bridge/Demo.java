package bridge;

public class Demo {
    public static void main(String[] args) {
        SmartRadio smartRadio = new SmartRadio();
        AdvancedRemote advancedRemote = new AdvancedRemote(smartRadio);

        // Enable the device
        advancedRemote.power();

        // Test volume control with voice command
        advancedRemote.voiceControl("increase volume");

        // Test channel change with voice command
        advancedRemote.voiceControl("next channel");

        // Test podcast playing functionality
        smartRadio.playPodcast("Tech Trends Podcast");

        // Stop the podcast
        smartRadio.stopPodcast();
    }
}