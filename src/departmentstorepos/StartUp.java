package departmentstorepos;

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DataAccessStrategy dataAccess = new InMemoryDataStorage();

        ReceiptFormatStrategy receiptFormat = new ConsoleReceiptFormat2();

       

        PosTerminal posTerminal = new PosTerminal();

       // posTerminal.startNewSale("C003", getreceiptOutput,
               // receiptFormat,  dataAccess);
        posTerminal.addProductToSale("P101", 500, dataAccess);
        posTerminal.addProductToSale("P102", 2, dataAccess);
        posTerminal.addProductToSale("P103", 14, dataAccess);
        posTerminal.addProductToSale("P104", 23, dataAccess);
        
        posTerminal.completeSale();

    }
    }
    

