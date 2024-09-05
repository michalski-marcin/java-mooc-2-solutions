
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Literacy> results = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(row -> new Literacy(row[3], row[4], row[2].replace("%", "").trim(),
                            Double.valueOf(row[5])))
                    .forEach(results::add);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        results.stream().sorted((p1, p2) -> {
            return p1.getPercent().compareTo(p2.getPercent());
        }).forEach(e -> System.out.println(e.toString()));

    }
}
