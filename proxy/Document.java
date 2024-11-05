package proxy;

public interface Document {
    String getContent(User user) throws AccessDeniedException;
    String getCreationDate();
    String getIdentifier();
}