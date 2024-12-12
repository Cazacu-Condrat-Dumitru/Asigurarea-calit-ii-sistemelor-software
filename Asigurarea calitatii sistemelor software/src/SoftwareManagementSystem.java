import java.util.ArrayList;
import java.util.List;

public class SoftwareManagementSystem {
    public static void main(String[] args) {
        List<Standard> standards = new ArrayList<>();
        standards.add(new Standard("ISO 9001", "Quality Management Systems"));
        standards.add(new Standard("IEEE 29119", "Software Testing Standards"));

        System.out.println("Standards:");
        standards.forEach(System.out::println);

        // Ethics Management
        Ethics ethics = new Ethics();
        ethics.addEthicalPoint("Ensure transparency in AI systems.");
        ethics.addEthicalPoint("Avoid development of harmful technologies.");
        ethics.displayEthics();

        // Metric Management
        List<Metric> metrics = new ArrayList<>();
        metrics.add(new Metric("Functional Testing", "Verify that all features work as expected."));
        metrics.add(new Metric("Performance Testing", "Ensure the system meets performance benchmarks."));

        System.out.println("\nMetrics:");
        metrics.forEach(System.out::println);

        // Documentation Management
        Documentation documentation = new Documentation();
        documentation.addDocument("Project Plan Document");
        documentation.addDocument("Test Case Specifications");
        documentation.displayDocuments();
    }
}