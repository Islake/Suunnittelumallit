package chain_of_responsibility;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Handling general feedback: " + message.getMessageContent());
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}