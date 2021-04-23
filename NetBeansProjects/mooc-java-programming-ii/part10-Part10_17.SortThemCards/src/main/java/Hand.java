
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> list = new ArrayList<>(); 

    public void add(Card card) {
        list.add(card); 
    }
    
    public void print() {
        for (Card card: list) {
            System.out.println(card); 
        }
    }
    
    public void sort() {
        Collections.sort(list);
        list.stream().forEach(m -> System.out.println(m));
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sortbySuitSorter = new BySuitInValueOrder();
        Collections.sort(list, sortbySuitSorter);
    }

    @Override
    public int compareTo(Hand o) {
        int cardValue = 0; 
        int comapareValue = 0; 
        for (Card card: list) {
            cardValue += card.getValue(); 
        }
        
        for (Card card : o.list) {
            comapareValue += card.getValue(); 
        }
        
        if (cardValue == comapareValue) {
            return 0;
        } else if (cardValue > comapareValue) {
            return 1;
        } else {
            return -1;
        }
    }
}
