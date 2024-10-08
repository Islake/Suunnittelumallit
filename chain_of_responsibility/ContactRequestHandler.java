package chain_of_responsibility;

public class ContactRequestHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Handling contact request: " + message.getMessageContent());
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}