/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentstorepos;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vekivulic
 */
public class CustomerTest {
    
  private Customer instance;

    
    public CustomerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String customerId = "";
        Customer instance = null;
        instance.setCustomerId(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String[] lastNameToTest = 
            {null};
       // Customer instance = new Customer();
        for(int i=0; i < lastNameToTest.length; i++) {
            try {
                instance.setLastName(lastNameToTest[i]);
                assertTrue(lastNameToTest[i] != null 
                        && lastNameToTest[i].length() > 0);
                assertEquals(lastNameToTest[i], instance.getLastName());
            } catch(IllegalArgumentException iae) {
                assertTrue(lastNameToTest[i] == null 
                        || lastNameToTest[i].length() == 0);
            }
    }

    
   
    }
    @Test (expected=IllegalArgumentException.class)
    public void testCustomerIDCannotBeEmpty() {
        instance.setCustomerId("");
        instance.setCustomerId("");
       
    }
}
