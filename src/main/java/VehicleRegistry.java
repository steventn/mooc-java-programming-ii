
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registryMap;
    
    public VehicleRegistry() {
        this.registryMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registryMap.containsKey(licensePlate)) {
            registryMap.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) { 
        return registryMap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (registryMap.containsKey(licensePlate)) {
            registryMap.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate vehicles: registryMap.keySet()) {
            System.out.println(vehicles);
        }
    }
    
    public void printOwners() { 
        ArrayList<String> owners = new ArrayList<>();
        String compareOwner = "";
        for (LicensePlate ownerList: registryMap.keySet()) {
            compareOwner = registryMap.get(ownerList);
            if (!owners.contains(compareOwner)) {
                owners.add(compareOwner);
            }
        }
        
        for (String ownerList: owners) {
            System.out.println(ownerList);
        }
    }
}
