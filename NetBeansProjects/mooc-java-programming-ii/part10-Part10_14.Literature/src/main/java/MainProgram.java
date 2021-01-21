
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Books> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            String ageRecommendation = scanner.nextLine();
            books.add(new Books(bookName, Integer.valueOf(ageRecommendation)));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        Comparator<Books> comparator = Comparator
                .comparing(Books::getAgeRecommendation)
                .thenComparing(Books::getName);
        
        Collections.sort(books, comparator);
        
        for (Books b : books) {
            System.out.println(b);
        }
    }
}
