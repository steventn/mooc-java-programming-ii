
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
        System.out.println("START - outside of empty - " + product);
        if (cartProducts.isEmpty()) {
            System.out.println("");
            Item tempItem = new Item(product, 1, price);
            cartProducts.add(tempItem);
            return;
        }
        
        System.out.println("outside for loop after if statement " + product);
        for (Item productInCart: cartProducts) {
            System.out.println("inside for loop");
            if (productInCart.getProductName().equals(product)) {
                System.out.println("inside if statement");
                productInCart.increaseQuantity();
                return;
            } else {
                System.out.println("inside else statement");
                Item tempItem = new Item(product, 1, price);
                cartProducts.add(tempItem);
                return;
            }
        }     
    }
    
    public int price() {
        int price = 0;
        for (Item item: cartProducts) {
            price += item.price();
        }
        
        return price;
    }
    
    public void print() {
        /*Set<Item> set = new HashSet<>();
        for (Item item: cartProducts) {
            set.add(item);
        }
    
        for (Item itemInSet: set) {
            System.out.println(itemInSet);
        } */
        
        for (Item itemInCart: cartProducts) {
            System.out.println(itemInCart);
        }
    }
}
