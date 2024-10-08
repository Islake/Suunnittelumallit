package chain_of_responsibility;

public class CompensationClaimHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim: " + message.getMessageContent());
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}