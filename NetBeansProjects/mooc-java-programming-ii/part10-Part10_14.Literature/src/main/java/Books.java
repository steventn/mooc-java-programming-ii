/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Books {
    
    private String bookName;
    private int ageRecommendation;
    
    public Books(String bookName, int ageRecommendation) {
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation; 
    }
    
    public String getName() {
        return this.bookName;
    }
    
    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }
    
    public String toString() {
        return this.getName() + " (" + this.getAgeRecommendation() + ")";
    }
}
