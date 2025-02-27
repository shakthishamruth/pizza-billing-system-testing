package pizzaBillOrderV2;

import javax.swing.JTextField;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pizzaBillOrderV2NGTest {

    String orderno = "1";
    String customerName = "customername";
    int[] vegqty = {1, 0, 0, 0, 0, 0};
    int[] nonvegqty = {1, 0, 0, 0, 0, 0};
    String expectedResult;
    String amt;

    public pizzaBillOrderV2NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    public pizzaBillOrderV2 assignvalues(String ordernumber, String custname, String email, String phone, int[] veg, int[] nonveg, int pizzabase, boolean[] top, double dis) {
        pizzaBillOrderV2 newinstance = new pizzaBillOrderV2();
        JTextField orderNumberTxtf = new JTextField(ordernumber);
        JTextField customerNameTxtf = new JTextField(custname);
        JTextField emailidTxtf = new JTextField(email);
        JTextField phoneNoTxtf = new JTextField(phone);
        newinstance.setvegqty(veg);
        newinstance.setnonvegqty(nonveg);
        newinstance.settoppings(top);
        newinstance.setpizzabasetype(pizzabase);
        newinstance.setdiscount(dis);
        newinstance.setOrderNumberTxtf(orderNumberTxtf);
        newinstance.setCustomerNameTxtf(customerNameTxtf);
        newinstance.setEmailidtxtf(emailidTxtf);
        newinstance.setPhoneNoTxtf(phoneNoTxtf);
        return newinstance;
    }

    @Test
    public void testID1() {
        System.out.println("Test 1");

        // Test Inputs
        String emailid = "abcd@gmail.com"; // -@gmail.com
        String phoneNo = "9999999999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 2; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + "abcd@gmail.com"
                + "\nPhone number: " + "9999999999"
                + "\nAMOUNT PAYABLE IS: " + "505.0"
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID2() {
        System.out.println("Test 2");

        // Test Inputs
        String emailid = "abcd@gmail.com"; // -@gmail.com
        String phoneNo = "9999999999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 4; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + "abcd@gmail.com"
                + "\nPhone number: " + "9999999999"
                + "\nAMOUNT PAYABLE IS: " + "505.0"
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID3() {
        System.out.println("Test 3");

        /// Test Inputs
        String emailid = "abcd@gmail.com"; // -@gmail.com
        String phoneNo = "99999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 2; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Bill Not Generated";

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID4() {
        System.out.println("Test 4");

        /// Test Inputs
        String emailid = "abcd@gmail.com"; // -@gmail.com
        String phoneNo = "99999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 4; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Bill Not Generated";

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID5() {
        System.out.println("Test 5");

        /// Test Inputs
        String emailid = "wrong email"; // -@gmail.com
        String phoneNo = "9999999999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 2; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + "**InvalidEmailId"
                + "\nPhone number: " + "9999999999"
                + "\nAMOUNT PAYABLE IS: " + "505.0"
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID6() {
        System.out.println("Test 6");

        /// Test Inputs
        String emailid = "wrong email"; // -@gmail.com
        String phoneNo = "9999999999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 4; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + "**InvalidEmailId"
                + "\nPhone number: " + "9999999999"
                + "\nAMOUNT PAYABLE IS: " + "505.0"
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID7() {
        System.out.println("Test 7");

        /// Test Inputs
        String emailid = "wrong email"; // -@gmail.com
        String phoneNo = "99999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 2; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Bill Not Generated";

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID8() {
        System.out.println("Test 8");

        /// Test Inputs
        String emailid = "wrong email"; // -@gmail.com
        String phoneNo = "99999"; // all chars should 0-9 of length 10
        boolean[] toppings = {false, false, false, false}; // {boolean,boolean,boolean,boolean}
        int pizzabasetype = 4; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        // Test Inputs
        amt = "505.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Bill Not Generated";

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }
}
