import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {

            System.out.println("Command: ");
            String userCommand = scanner.nextLine();

            if (userCommand.equals("stop")) {
                break;

            } else if (userCommand.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();

                list.add(toAdd);

            } else if (userCommand.equals("list")) {
                list.print();

            } else if (userCommand.equals("remove")) {
                System.out.println("Which one is removed? ");
                int indexToRemove = Integer.parseInt(scanner.nextLine());
                list.remove(indexToRemove);

            }

        }
    }
}
