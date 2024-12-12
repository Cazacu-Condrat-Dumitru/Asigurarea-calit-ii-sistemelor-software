import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ethics {
    private final List<String> ethicalPoints;

    public Ethics() {
        this.ethicalPoints = new ArrayList<>();
    }

    public void addEthicalPoint(String point) {
        ethicalPoints.add(point);
    }

    public List<String> getEthicalPoints() {
        return Collections.unmodifiableList(ethicalPoints);
    }

    public void displayEthics() {
        System.out.println("Ethical Points:");
        ethicalPoints.forEach(point -> System.out.println("- " + point));
    }
}
