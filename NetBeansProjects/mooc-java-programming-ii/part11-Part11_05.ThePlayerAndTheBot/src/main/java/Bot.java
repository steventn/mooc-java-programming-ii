/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Bot extends Player {
    
    
    @Override
    public void play() {
        System.out.println("Beep boop");
    }
    
    public void addMove(String move) {
        System.out.println(move);
    }
}
