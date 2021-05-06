
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
public class Pipe<T> {
    private ArrayList<T> t = new ArrayList<T>();
    private T element; 
    
    public void putIntoPipe(T value) {
        t.add(value); 
    }
    
    public T takeFromPipe() {
        if (t.isEmpty()) {
            return null; 
        }
        
        element = t.get(0);
        t.remove(element);
        
        return element; 
    }
    
    public boolean isInPipe() {
        if (!t.isEmpty()) {
            return true; 
        } else {
            return false; 
        }
    }
}
