
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items; 
    
    public BoxWithMaxWeight (int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int boxWeight = 0;
        
        for (Item itemList: items) {
            boxWeight += itemList.getWeight();
        }
        
        if (item.getWeight() + boxWeight <= capacity) {
            boxWeight += item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemList: items) {
            if (!itemList.getName().equals(item.getName())) {
                continue;
            }
            return true;
        }
        return false;
    }
}
