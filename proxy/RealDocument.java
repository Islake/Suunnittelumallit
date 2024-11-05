package proxy;
import java.util.Date;

public class RealDocument implements Document {
    private String identifier;
    private String creationDate;
    private String content;

    public RealDocument(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}