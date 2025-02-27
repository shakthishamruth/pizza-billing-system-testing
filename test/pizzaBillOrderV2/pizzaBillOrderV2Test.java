
package pizzaBillOrderV2;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class pizzaBillOrderV2Test {
    
    public pizzaBillOrderV2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of eventButtonClicked method, of class pizzaBillOrderV2.
     */
    @Test
    public void testEventButtonClicked() {
        System.out.println("eventButtonClicked");
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        String expResult = "";
        String result = instance.eventButtonClicked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class pizzaBillOrderV2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        pizzaBillOrderV2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setvegOrderList method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetvegOrderList() {
        System.out.println("setvegOrderList");
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        String expResult = "";
        String result = instance.setvegOrderList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnonvegOrderList method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetnonvegOrderList() {
        System.out.println("setnonvegOrderList");
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        String expResult = "";
        String result = instance.setnonvegOrderList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerNameTxtf method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetCustomerNameTxtf() {
        System.out.println("setCustomerNameTxtf");
        JTextField customerNameTxtf = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setCustomerNameTxtf(customerNameTxtf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailidtxtf method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetEmailidtxtf() {
        System.out.println("setEmailidtxtf");
        JTextField emailidtxtf = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setEmailidtxtf(emailidtxtf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderNumberTxtf method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetOrderNumberTxtf() {
        System.out.println("setOrderNumberTxtf");
        JTextField orderNumberTxtf = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setOrderNumberTxtf(orderNumberTxtf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNoTxtf method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetPhoneNoTxtf() {
        System.out.println("setPhoneNoTxtf");
        JTextField phoneNoTxtf = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setPhoneNoTxtf(phoneNoTxtf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setvegqty method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetvegqty() {
        System.out.println("setvegqty");
        int[] qty = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setvegqty(qty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnonvegqty method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetnonvegqty() {
        System.out.println("setnonvegqty");
        int[] qty = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setnonvegqty(qty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpizzabasetype method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetpizzabasetype() {
        System.out.println("setpizzabasetype");
        int n = 0;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setpizzabasetype(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdiscount method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSetdiscount() {
        System.out.println("setdiscount");
        double discount = 0.0;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.setdiscount(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBill method, of class pizzaBillOrderV2.
     */
    @Test
    public void testGetBill() {
        System.out.println("getBill");
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        String expResult = "";
        String result = instance.getBill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settoppings method, of class pizzaBillOrderV2.
     */
    @Test
    public void testSettoppings() {
        System.out.println("settoppings");
        boolean[] toppings = null;
        pizzaBillOrderV2 instance = new pizzaBillOrderV2();
        instance.settoppings(toppings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
