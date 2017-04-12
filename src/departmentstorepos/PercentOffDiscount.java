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
public class PercentOffDiscount implements DiscountStrategy {

    private double percentageOff;
    private String promotionName;

    public PercentOffDiscount(double percentageOff, String promotionName) {
        setPercentageOff(percentageOff);
        setPromotionName(promotionName);
    }

    @Override
    public final double getDiscount(double unitPrice, int productQty) {
        // requires validation!
        return (unitPrice * percentageOff) * productQty;
    }

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) throws 
            IllegalArgumentException{
        //Requires validation
        if(percentageOff < 0 || percentageOff > 1.0){
            throw new IllegalArgumentException("Invalid percentage: Percentage "
                    + "must be greater than 0, and less than 1");
        }
        this.percentageOff = percentageOff;
    }

    @Override
    public final String getPromotionName() {
        return promotionName;
    }

    public final void setPromotionName(String promotionName) throws
            IllegalArgumentException{
       
        if(promotionName.length() < 5){
            throw new IllegalArgumentException("Promotion name must be "
                    + "greater than 5 characters");
        }
        this.promotionName = promotionName;
    }

}

