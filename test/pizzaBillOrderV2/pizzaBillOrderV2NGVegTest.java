package pizzaBillOrderV2;

import javax.swing.JTextField;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pizzaBillOrderV2NGVegTest {

    String orderno = "1";
    String customerName = "test";
    String emailid = "test@gmail.com";
    String phoneNo = "9999999999";
    boolean[] toppings = {false, false, false, false};
    int[] vegqty = {0, 0, 0, 0, 0, 0};
    int[] nonvegqty = {0, 0, 0, 0, 0, 0};
    int pizzabasetype = 2; // regular
    double discount = 0.0;
    String expectedResult;
    String amt;

    public pizzaBillOrderV2NGVegTest() {
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

    @Test
    public void testID1() {
        System.out.println("Test 1");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = -1;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
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
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 0;
        amt = "3969.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID3() {
        System.out.println("Test 3");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 1;
        amt = "4292.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID4() {
        System.out.println("Test 4");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4938.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID5() {
        System.out.println("Test 5");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 4;
        amt = "5261.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID6() {
        System.out.println("Test 6");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 5;
        amt = "5584.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID7() {
        System.out.println("Test 7");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 6;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID8() {
        System.out.println("Test 8");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = -1;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID9() {
        System.out.println("Test 9");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 0;
        vegqty[5] = 3;
        amt = "4099.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID10() {
        System.out.println("Test 10");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 1;
        vegqty[5] = 3;
        amt = "4378.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID11() {
        System.out.println("Test 11");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 4;
        vegqty[5] = 3;
        amt = "5217.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID12() {
        System.out.println("Test 12");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 5;
        vegqty[5] = 3;
        amt = "5497.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID13() {
        System.out.println("Test 13");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 6;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID14() {
        System.out.println("Test 14");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = -1;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Input";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID15() {
        System.out.println("Test 15");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 0;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "3969.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID16() {
        System.out.println("Test 16");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 1;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4292.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID17() {
        System.out.println("Test 17");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 4;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5261.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID18() {
        System.out.println("Test 18");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 5;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5584.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID19() {
        System.out.println("Test 19");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 6;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID20() {
        System.out.println("Test 15");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = -1;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Input";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID21() {
        System.out.println("Test 21");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 0;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "3969.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID22() {
        System.out.println("Test 22");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 1;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4292.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID23() {
        System.out.println("Test 23");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 4;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5261.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID24() {
        System.out.println("Test 24");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 5;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5584.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID25() {
        System.out.println("Test 25");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 3;
        vegqty[2] = 6;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID26() {
        System.out.println("Test 26");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = -1;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Input";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID27() {
        System.out.println("Test 27");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 0;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4099.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID28() {
        System.out.println("Test 28");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 1;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4378.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID29() {
        System.out.println("Test 29");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 4;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5217.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID30() {
        System.out.println("Test 30");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 5;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5497.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID31() {
        System.out.println("Test 31");

        // Test Inputs
        vegqty[0] = 3;
        vegqty[1] = 6;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID32() {
        System.out.println("Test 32");

        // Test Inputs
        vegqty[0] = -1;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Input";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID33() {
        System.out.println("Test 33");

        // Test Inputs
        vegqty[0] = 0;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4585.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID34() {
        System.out.println("Test 34");

        // Test Inputs
        vegqty[0] = 1;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "4702.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID35() {
        System.out.println("Test 35");

        // Test Inputs
        vegqty[0] = 4;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5055.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID36() {
        System.out.println("Test 36");

        // Test Inputs
        vegqty[0] = 5;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "5173.0";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }

    @Test
    public void testID37() {
        System.out.println("Test 37");

        // Test Inputs
        vegqty[0] = 6;
        vegqty[1] = 3;
        vegqty[2] = 3;
        vegqty[3] = 3;
        vegqty[4] = 3;
        vegqty[5] = 3;
        amt = "Invalid Amount";
        // End of Test Inputs

        pizzaBillOrderV2 instance = assignvalues(orderno, customerName, emailid, phoneNo, vegqty, nonvegqty, pizzabasetype, toppings, discount);

        expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();

        if (!expectedResult.equals(instance.eventButtonClicked())) {
            fail("TestCase failed!");
        }
    }
}
