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
public class Customer {
    private String customerId;
    private String lastName;
    private String firstName;

    public Customer(String customerId, String lastName, String firstName) {
     
        setCustomerId(customerId);
        setLastName(lastName);
        setFirstName(firstName);
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) throws 
            IllegalArgumentException {
      
        if(customerId.length() < 4 ){
            throw new IllegalArgumentException("Message Output");
        }
        this.customerId = customerId;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName)throws 
            IllegalArgumentException {
    
        if(lastName.length() < 2 ){
            throw new IllegalArgumentException("Message Ouput");
        }
        
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws 
            IllegalArgumentException {
 
        if(firstName.length() < 2 ){
            throw new IllegalArgumentException("Message Output");
        }
        this.firstName = firstName;
    }
    
}
