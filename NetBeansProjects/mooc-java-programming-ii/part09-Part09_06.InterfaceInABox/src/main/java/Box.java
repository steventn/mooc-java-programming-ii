
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
public class Box implements Packable {
    private ArrayList<Packable> boxItems;
    private double capacity;
    
    public Box(double capacity) {
        boxItems = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable item) {
        if (this.capacity >= weight() + item.weight()) {
            boxItems.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable: boxItems) {
            weight += packable.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.boxItems.size() + " items, total weight " + weight() + " kg";
    }
    
}
