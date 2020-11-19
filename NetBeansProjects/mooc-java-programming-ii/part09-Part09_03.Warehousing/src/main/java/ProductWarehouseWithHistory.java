/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        this.changeHistory = new ChangeHistory();  
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println(("Product: " + super.getName() + "\n"
                + "History: " + changeHistory + "\n"
                + "Largest amount of product: " + changeHistory.maxValue() + "\n"
                + "Smallest amount of product:" + changeHistory.minValue() + "\n"
                + "Average: " + changeHistory.average()));
    }
    
    public String history() {
        return changeHistory.toString();
    }
}
