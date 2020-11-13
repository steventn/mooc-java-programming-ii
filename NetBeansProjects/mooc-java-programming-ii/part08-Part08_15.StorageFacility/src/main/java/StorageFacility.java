
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> container; 
    
    public StorageFacility() {
        this.container = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        container.putIfAbsent(unit, new ArrayList<>());
        container.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return container.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        container.get(storageUnit).remove(item);
        if (container.get(storageUnit).isEmpty()) {
            container.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String unit: container.keySet()) {
            storageUnits.add(unit);
        }
        return storageUnits;
    }
}
