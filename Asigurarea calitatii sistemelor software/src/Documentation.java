import java.util.ArrayList;
import java.util.List;

public class Documentation {
    private final List<String> documents;

    public Documentation() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(String document) {
        documents.add(document);
    }

    public void displayDocuments() {
        System.out.println("Documents:");
        documents.forEach(doc -> System.out.println("- " + doc));
    }
}
