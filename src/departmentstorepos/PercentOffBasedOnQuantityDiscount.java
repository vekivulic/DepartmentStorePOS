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
public class PercentOffBasedOnQuantityDiscount implements DiscountStrategy {

    public PercentOffBasedOnQuantityDiscount(int i, double d, String string) {
    }

    @Override
    public double getDiscount(double unitPrice, int productQty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPromotionName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
