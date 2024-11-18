package bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Executing voice command: " + command);
        if (command.equalsIgnoreCase("increase volume")) {
            device.setVolume(device.getVolume() + 10);
        } else if (command.equalsIgnoreCase("next channel")) {
            device.setChannel(device.getChannel() + 1);
        } else {
            System.out.println("Unknown command.");
        }
        device.printStatus();
    }
}