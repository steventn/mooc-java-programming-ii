
public class Program {

    public static void main(String[] args) {
        int[] numbers = {8, 2, 9, 1, 1};
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int lowerBound = fromWhere; 
        int upperBound = toWhere; 
        int size = array.length - 1; 
        int sum = 0; 
        
        if (lowerBound < 0) {
            lowerBound = 0; 
        }
        
        if (upperBound > size) {
            upperBound = size;
        }
        
        for (int i = lowerBound; i <= upperBound; i++) {
            if (array[i] > smallest && array[i] < largest) {
                sum += array[i]; 
            }
        }
        
        return sum; 
    }

}
