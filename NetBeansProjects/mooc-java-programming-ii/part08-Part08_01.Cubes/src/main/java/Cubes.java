
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  cube = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            int numberInput = Integer.valueOf(input);
            cube = numberInput * numberInput * numberInput;
            System.out.println(cube);
        }
    }
}
