
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();
        System.out.println("Enter integers, blank will end");
        while(true) {
            String input = scanner.nextLine();
            int numbers = Integer.valueOf(input);
            if (numbers < 0 ) {
                break;
            }
            
            inputList.add(numbers);
        }
        
        inputList.stream()
                .filter(value -> value > 0 && value < 6)
                .forEach(value -> System.out.println(value));
        
        
    }
}
