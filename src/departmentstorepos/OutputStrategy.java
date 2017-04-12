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
public interface OutputStrategy {
     //public abstract String getReceiptOutput();
    public abstract void produceOutput(String data);
}
