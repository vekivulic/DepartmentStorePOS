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
public class Receipt {

    private Customer customer;
    private LineItem[] lineItems;
    private OutputStrategy receiptOutput;
    private ReceiptFormatStrategy receiptFormat;
    private final DataAccessStrategy dataAccess;

   
    public Receipt(String customerId, OutputStrategy receiptOutput, ReceiptFormatStrategy receiptFormat,
            DataAccessStrategy dataAccess) {
        this.dataAccess = dataAccess;
        
        //customer = findCustomerById(customerId);

        setReceiptOutput(receiptOutput);
        setReceiptFormat(receiptFormat);

        LineItem[] newLineItems = new LineItem[0];
        this.lineItems = newLineItems;
    }

    private void addLineItemToArray(LineItem addedLineItem) {
        
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length - 1] = addedLineItem;
        lineItems = temp;
        temp = null;
    }

    public final double getSaleSubTotal() {
        double saleSubTotal = 0;
        for (LineItem lineItem : lineItems) {
            saleSubTotal += lineItem.getLineTotal();
        }
        return saleSubTotal;
    }

    public final double getSaleSavingsTotal() {
        double saleSavingsTotal = 0;
        for (LineItem lineItem : lineItems) {
            saleSavingsTotal += lineItem.getDiscountTotal();
        }
        return saleSavingsTotal;
    }

    public final double getSaleTaxTotal() {
        double saleTaxTotal = 0;

        return saleTaxTotal;
    }

    public final double getSaleGrandTotal() {
        return getSaleSubTotal() + getSaleTaxTotal();
    }

    public final int getTotalItemsSold() {
        int totalItemsSold = 0;
        for (LineItem lineItem : lineItems) {
            totalItemsSold += lineItem.getProductQty();
        }
        return totalItemsSold;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer){
              //Requires validation

            this.customer = customer;
        }
    
    

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        //Requires validation
        this.lineItems = lineItems;
    }

    public final OutputStrategy getReceiptOutput() {
        return receiptOutput;
    }

    public final void setReceiptOutput(OutputStrategy receiptOutput) {
        //Requires validation
        this.receiptOutput = receiptOutput;
    }

    public final ReceiptFormatStrategy getReceiptFormat() {
        return receiptFormat;
    }

    public final void setReceiptFormat(ReceiptFormatStrategy receiptFormat) {
       
        this.receiptFormat = receiptFormat;
    }

    public void addLineItem(String productId, int productQty, DataAccessStrategy dataAccess) {
        LineItem item = new LineItem(productId, productQty, dataAccess);
    }

    void doOutput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
