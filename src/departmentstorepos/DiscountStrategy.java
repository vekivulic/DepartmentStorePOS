/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentstorepos;

/**
 *
 * @author vekivulic
 */
public interface DiscountStrategy {
    
 public abstract double getDiscountAmt(double unitPrice, int qty) throws IllegalArgumentException;
    public abstract double getDiscountRate();
    public abstract void   setDiscountRate(double discountRate);
   
}
    

