package pizzaBillOrderV2;

import javax.swing.JTextField;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pizzaBillOrderV2NGNonVegTest {

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

    public pizzaBillOrderV2NGNonVegTest() {
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = -1;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 0;
        amt = "5459.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 1;
        amt = "5793.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6461.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 4;
        amt = "6794.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 5;
        amt = "7128.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 6;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = -1;
        nonvegqty[5] = 0;
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
    public void testID9() {
        System.out.println("Test 9");

        // Test Inputs
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 0;
        nonvegqty[5] = 3;
        amt = "5297.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 1;
        nonvegqty[5] = 3;
        amt = "5685.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 4;
        nonvegqty[5] = 3;
        amt = "6848.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 5;
        nonvegqty[5] = 3;
        amt = "7236.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 6;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = -1;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 0;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5297.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 1;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5685.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 4;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6848.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 5;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "7236.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 6;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        System.out.println("Test 20");

        // Test Inputs
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = -1;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 0;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5654.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 1;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5923.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 4;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6729.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 5;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6998.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 3;
        nonvegqty[2] = 6;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = -1;
        nonvegqty[2] = 0;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 0;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5297.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 1;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5685.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 4;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6848.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 5;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "7236.0";
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
        nonvegqty[0] = 3;
        nonvegqty[1] = 6;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = -1;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
        nonvegqty[0] = 0;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5297.0";
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
        nonvegqty[0] = 1;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "5685.0";
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
        nonvegqty[0] = 4;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "6848.0";
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
        nonvegqty[0] = 5;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
        amt = "7236.0";
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
        nonvegqty[0] = 0;
        nonvegqty[1] = 3;
        nonvegqty[2] = 3;
        nonvegqty[3] = 3;
        nonvegqty[4] = 3;
        nonvegqty[5] = 3;
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
