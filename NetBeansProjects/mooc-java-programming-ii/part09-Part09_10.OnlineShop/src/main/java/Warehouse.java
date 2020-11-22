
import java.util.HashMap;
import java.util.HashSet;
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
public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        productPrice = new HashMap<>();
        productStock = new HashMap<>();
    }
          
    
    public void addProduct(String product, int price, int stock) {
       productPrice.put(product, price);
       productStock.put(product, stock);
    }
    
    public int price(String product) {
        if (!productPrice.keySet().contains(product)) {
            return -99;
        }
        
        return productPrice.get(product);
    }
    
    public int stock(String product) {
        if (!productStock.keySet().contains(product)) {
            return 0;
        }
        
        return productStock.get(product);
    }
    
    public boolean take(String product) {
        if (!productStock.keySet().contains(product)) {
            return false;
        }
        
        if (productStock.get(product) > 0) {
            productStock.replace(product, productStock.get(product), productStock.get(product)-1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> productSet = new HashSet<>();
        for (String productName: productPrice.keySet()) {
            productSet.add(productName);
        }
        
        return productSet;
    }
}
