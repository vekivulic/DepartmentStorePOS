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
public class QtyDiscount {
     private double discountRate = 0.10;
    private int minQty = 5;
    
    public QtyDiscount(double rate, int minQty) {
        setDiscountRate(rate);
        setMinQty(minQty);
    }
    
    @Override
    public final double getDiscountAmt(final double unitPrice, final int qty) throws IllegalArgumentException {
        if(unitPrice <= 0 || qty <=0)  {
            throw new IllegalArgumentException("unitPrice must be greater than 0 and qty must be greater than zero");
        }
        if(qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(final int minQty) {
        if(minQty <= 1) {
            throw new IllegalArgumentException("minimum qty must be greater than 1");
        }
        this.minQty = minQty;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(final double discountRate) {
        if(discountRate < .01 || discountRate > .99) {
            throw new IllegalArgumentException("discount rate must be between .01 and .99");
        }
         this.discountRate = discountRate;
    }
    
    
}

    
}
