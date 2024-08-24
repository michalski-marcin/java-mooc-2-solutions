
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.printf("Print the average of the negative numbers or the positive numbers? (n/p)");
        String usersChoice = scanner.nextLine();

        if (usersChoice.equals("p")) {
            Double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(value -> value > 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (usersChoice.equals("n")) {
            Double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(value -> value < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }

        
        
        } 

    }
}
