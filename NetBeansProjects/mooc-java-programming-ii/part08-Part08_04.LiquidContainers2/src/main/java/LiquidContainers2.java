
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne + "\n" + 
                               "Second " + containerTwo);
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equalsIgnoreCase("add")) {
                containerOne.add(amount);
            }
            
            if (command.equalsIgnoreCase("move")) {
                if (amount > containerOne.contains()) {
                    amount = containerOne.contains();
                }
                containerOne.remove(amount);
                containerTwo.add(amount);
            }
            
            if (command.equalsIgnoreCase("remove")) {
                containerTwo.remove(amount);
            }
        }
    }
}
