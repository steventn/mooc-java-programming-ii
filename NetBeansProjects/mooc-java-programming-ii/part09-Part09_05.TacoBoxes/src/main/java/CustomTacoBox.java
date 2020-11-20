/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class CustomTacoBox implements TacoBox {
    private int tacos; 
    
    public CustomTacoBox(int amount) {
        this.tacos = amount;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;
        }
    }
    
}
