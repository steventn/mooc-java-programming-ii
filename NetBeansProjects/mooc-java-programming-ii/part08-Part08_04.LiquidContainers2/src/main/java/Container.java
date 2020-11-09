/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Container {
    private int containerAmount;
    
    public Container() {
        this.containerAmount = 0;
    }
    
    public int contains() {
        return this.containerAmount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.containerAmount += amount;
        if (this.containerAmount > 100) {
            this.containerAmount = 100; 
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.containerAmount -= amount;
        if (this.containerAmount < 0) {
            this.containerAmount = 0;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.containerAmount) + "/100";
    }
    
    
}
