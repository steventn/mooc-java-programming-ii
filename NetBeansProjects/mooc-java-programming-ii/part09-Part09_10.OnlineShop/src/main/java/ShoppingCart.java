
import java.util.ArrayList;
import java.util.List;

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
        if (cartProducts.isEmpty()) {
            Item tempItem = new Item(product, 1, price);
            cartProducts.add(tempItem);
            return;
        }
        
        for (Item productInCart: cartProducts) {
            if (productInCart.getProductName().equals(product)) {
                productInCart.increaseQuantity();
                return;
            }
        }
        
        Item tempItem = new Item(product, 1, price);
            cartProducts.add(tempItem);
    }
    
    public int price() {
        int price = 0;
        for (Item item: cartProducts) {
            price += item.price();
        }
        
        return price;
    }
    
    public void print() { 
        for (Item itemInCart: cartProducts) {
            System.out.println(itemInCart);
        }
    }
}
