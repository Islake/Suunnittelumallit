package chain_of_responsibility;

public class FeedbackProcessor {
    public static void main(String[] args) {
        // Create handlers
        Handler compensationHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler developmentHandler = new DevelopmentSuggestionHandler();
        Handler generalHandler = new GeneralFeedbackHandler();

        // Set up chain of responsibility
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);

        // Create messages
        Message[] messages = {
            new Message(MessageType.COMPENSATION_CLAIM, "I want a refund", "customer1@example.com"),
            new Message(MessageType.CONTACT_REQUEST, "Please contact me", "customer2@example.com"),
            new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add a new feature", "customer3@example.com"),
            new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "customer4@example.com")
        };

        // Process messages
        for (Message message : messages) {
            compensationHandler.handleMessage(message);
        }
    }
}