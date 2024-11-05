package visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchCriterion;
    private List<File> matchingFiles;

    public SearchVisitor(String searchCriterion) {
        this.searchCriterion = searchCriterion;
        this.matchingFiles = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriterion)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}