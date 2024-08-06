
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = 1.0 * sum / counter;

            System.out.println(avg);
        }

    }

}
