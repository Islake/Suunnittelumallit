package proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create users
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Create and add documents
        RealDocument doc1 = new RealDocument("doc1", "2024-01-01", "This is an unprotected document.");
        library.addDocument(doc1);

        library.addProtectedDocument("doc2", "2024-01-02", "This is a protected document.");

        // Set up access control
        AccessControlService accessControlService = AccessControlService.getInstance();
        accessControlService.allowAccess("doc2", "user1");

        // Access documents
        try {
            System.out.println("User1 accessing doc1: " + library.getDocument("doc1").getContent(user1));
            System.out.println("User1 accessing doc2: " + library.getDocument("doc2").getContent(user1));
            System.out.println("User2 accessing doc2: " + library.getDocument("doc2").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}