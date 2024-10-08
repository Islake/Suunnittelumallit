package chain_of_responsibility;

public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Handling development suggestion: " + message.getMessageContent());
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}