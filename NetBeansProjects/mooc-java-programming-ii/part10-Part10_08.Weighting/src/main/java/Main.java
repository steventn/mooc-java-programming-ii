

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase suitcaseItem = new Suitcase(100);
        Item itemOne = new Item("sock", 5);
        Item itemTwo = new Item("cow", 50);
        Item itemThree = new Item("cup", 10);
        
        suitcaseItem.addItem(itemTwo);
        suitcaseItem.addItem(itemOne);
        suitcaseItem.addItem(itemThree);
        
        suitcaseItem.printItems();
        
        
    }

}
