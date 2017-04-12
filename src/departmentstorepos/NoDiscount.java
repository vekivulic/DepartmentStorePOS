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
public class NoDiscount implements DiscountStrategy {

    public NoDiscount() {
    }

    @Override
    public double getDiscount(double  unitPrice, int productQty) {
        return 0;
    }

    @Override
    public String getPromotionName() {
        return "";
    }
    
}
