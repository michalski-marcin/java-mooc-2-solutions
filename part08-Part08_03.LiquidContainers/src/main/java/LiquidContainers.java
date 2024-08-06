
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println(String.format("First: %s/100", container1));
            System.out.println(String.format("Second: %s/100", container2));

            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;

            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    container1 += amount;
                    if (container1 > 100) {
                        container1 = 100;
                    }
                }
            }
            if (command.equals("move")) {
                if (amount > 0) {
                    if (amount > container1) {
                        amount = container1; // Only move what's available
                    }
                    container1 -= amount;
                    container2 += amount;
                    if (container2 > 100) {
                        container2 = 100;
                    } else if (container1 < 0) {
                        container1 = 0;
                    }
                }
            }
            if (command.equals("remove")) {
                if (amount > 0) {
                    container2 -= amount;
                    if (container2 < 0) {
                        container2 = 0;
                    }

                }
            }

        }

        scan.close();
    }

}
