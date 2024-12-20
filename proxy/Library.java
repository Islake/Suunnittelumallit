package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document) {
        documents.put(document.getIdentifier(), document);
    }

    public Document getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void addProtectedDocument(String identifier, String creationDate, String content) {
        RealDocument realDocument = new RealDocument(identifier, creationDate, content);
        DocumentProxy proxy = new DocumentProxy(realDocument);
        addDocument(proxy);
    }
}