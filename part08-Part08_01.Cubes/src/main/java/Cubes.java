
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            s
            if (input.equals("end")) {
                break;
            }
            int num = Integer.valueOf(input);

            System.out.println(num * num * num);
        }
    }
}
