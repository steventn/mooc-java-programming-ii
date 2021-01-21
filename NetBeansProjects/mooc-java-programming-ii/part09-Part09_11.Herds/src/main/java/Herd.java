
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
public class Herd implements Movable {
    private ArrayList<Movable> groupOfMovable; 
    
    public Herd () {
        groupOfMovable = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Movable movableObject: groupOfMovable) {
            output += movableObject.toString() + "\n";
        }
        return output;
    }
    
    public void addToHerd(Movable movable) {
        groupOfMovable.add(movable);
    }
     
    @Override
    public void move(int dx, int dy) {
        for (Movable movableObject : groupOfMovable) {
            movableObject.move(dx, dy);
        } 
    }
}
