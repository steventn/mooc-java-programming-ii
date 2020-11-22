
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ShoppingCart {
    private List<Item> cartProducts;
    
    public ShoppingCart() {
        cartProducts = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        Item tempItem = new Item(product, 1, price);
//        if (cartProducts.contains(tempItem)) {
//            tempItem.increaseQuantity();
//        } else {
            cartProducts.add(tempItem);
//        }
    }
    
    public int price() {
        int price = 0;
        for (Item item: cartProducts) {
            price += item.price();
        }
        
        return price;
    }
    
    public void print() {
        Set<Item> set = new HashSet<>();
        for (Item item: cartProducts) {
            set.add(item);
        }
    
        for (Item itemInSet: set) {
            System.out.println(itemInSet);
        }
    }
}
