package departmentstorepos;

/**
 *
 * @author vekivulic
 */
public class PosTerminal {

   private Receipt receipt;

    public final void startNewSale(String customerId, OutputStrategy 
            receiptOutput, ReceiptFormatStrategy 
            receiptFormat, 
            DataAccessStrategy
            dataAccess) {

        Receipt newReceipt = new Receipt(customerId, receiptOutput,
                receiptFormat, dataAccess);
        setReceipt(newReceipt);
    }

    public final void addProductToSale(String productId, int productQty,
            DataAccessStrategy dataAccess) {
        receipt.addLineItem(productId, productQty, dataAccess);

    }

    public final void completeSale() {
        receipt.doOutput();
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
}
