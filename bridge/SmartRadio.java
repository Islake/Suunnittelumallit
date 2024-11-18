package bridge;

public class SmartRadio extends Radio {
    private boolean playingPodcast = false;

    public void playPodcast(String podcastName) {
        if (isEnabled()) {
            playingPodcast = true;
            System.out.println("Playing podcast: " + podcastName);
        } else {
            System.out.println("Please enable the radio to play a podcast.");
        }
    }

    public void stopPodcast() {
        if (playingPodcast) {
            playingPodcast = false;
            System.out.println("Stopped playing podcast.");
        } else {
            System.out.println("No podcast is currently playing.");
        }
    }
}