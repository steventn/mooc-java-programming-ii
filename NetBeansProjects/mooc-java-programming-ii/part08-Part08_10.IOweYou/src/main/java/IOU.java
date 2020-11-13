
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
public class IOU {
    private HashMap<String, Double> oweMoney; 
    
    public IOU() {
        this.oweMoney = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        oweMoney.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (oweMoney.containsKey(toWhom)) {
            return oweMoney.get(toWhom);
        } else {
            return 0.0;
        }
    }
}
