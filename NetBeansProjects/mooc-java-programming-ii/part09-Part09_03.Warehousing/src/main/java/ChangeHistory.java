
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ChangeHistory {
    private ArrayList<Double> historySet = new ArrayList<>();
    
    public ChangeHistory() {
      
    }
    
    public void add(double status) {
        historySet.add(status);
    }
    
    public void clear() {
        historySet.clear();
    }
    
    public double maxValue() {
        double max = 0;
        if (historySet.isEmpty()) {
            return 0;
        }
        for(Double historyValue: historySet) {
            if (historyValue > max) {
                max = historyValue;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = historySet.get(0);
        if (historySet.isEmpty()) {
            return 0;
        }
        for (Double historyValue : historySet) {
            if (historyValue < min) {
                min = historyValue;
            }
        }
        return min;
    } 
    
    public double average() {
        double sum = 0;
        if (historySet.isEmpty()) {
            return 0;
        }
        for (Double historyValue : historySet) {
            sum += historyValue;
        }
        return sum / historySet.size();
    }
    
    @Override
    public String toString() {
        return historySet.toString();
    }
}
