package pizzaBillOrderV2;

import static org.junit.Assert.assertEquals;
import javax.swing.JTextField;
import org.junit.Test;

public class pizzaBillOrderV2TestSys {

    public pizzaBillOrderV2TestSys() {
    }

    @Test
    public void testID1() {
        System.out.println("Test 1");

        // Test Inputs
        String orderno = "3"; // random postive integer
        String customerName = "abcd"; // random alphanumeric
        String emailid = "abcd@gmail.com"; // -@gmail.com
        String phoneNo = "9999999999"; // all chars should 0-9 of length 10
        String amt = "958.0"; // expected amt
        boolean[] toppings = {true, false, false, false}; // {boolean,boolean,boolean,boolean}
        int[] vegqty = {1, 0, 0, 0, 0, 0}; // {int(range0-10),int(range0-10),int(range0-10),int(range0-10),int(range0-10),int(range0-10)}
        int[] nonvegqty = {2, 0, 0, 0, 0, 0}; // {int(range0-10),int(range0-10),int(range0-10),int(range0-10),int(range0-10),int(range0-10)}
        int pizzabasetype = 2; // int(range0-2)
        double discount = 0.0; // double 0.0 or 0.08 or 0.10
        // End of Test Inputs

        JTextField orderNumberTxtf = new JTextField(orderno);
        JTextField customerNameTxtf = new JTextField(customerName);
        JTextField emailidTxtf = new JTextField(emailid);
        JTextField phoneNoTxtf = new JTextField(phoneNo);

        pizzaBillOrderV2 instance = new pizzaBillOrderV2();

        instance.setvegqty(vegqty);
        instance.setnonvegqty(nonvegqty);
        instance.settoppings(toppings);
        instance.setpizzabasetype(pizzabasetype);
        instance.setdiscount(discount);
        instance.setOrderNumberTxtf(orderNumberTxtf);
        instance.setCustomerNameTxtf(customerNameTxtf);
        instance.setEmailidtxtf(emailidTxtf);
        instance.setPhoneNoTxtf(phoneNoTxtf);

        String expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();
        assertEquals(expectedResult, instance.eventButtonClicked());
    }

    @Test
    public void testID2() {
        System.out.println("Test 2");

        // Test Inputs
        String orderno = "2";
        String customerName = "abc";
        String emailid = "abc@gmail.com";
        String phoneNo = "9999999999";
        String amt = "505.0";
        boolean[] toppings = {false, false, false, false};
        int[] vegqty = {1, 0, 0, 0, 0, 0};
        int[] nonvegqty = {1, 0, 0, 0, 0, 0};
        int pizzabasetype = 2;
        double discount = 0.0;
        // End of Test Inputs

        JTextField orderNumberTxtf = new JTextField(orderno);
        JTextField customerNameTxtf = new JTextField(customerName);
        JTextField emailidTxtf = new JTextField(emailid);
        JTextField phoneNoTxtf = new JTextField(phoneNo);

        pizzaBillOrderV2 instance = new pizzaBillOrderV2();

        instance.setvegqty(vegqty);
        instance.setnonvegqty(nonvegqty);
        instance.settoppings(toppings);
        instance.setpizzabasetype(pizzabasetype);
        instance.setdiscount(discount);
        instance.setOrderNumberTxtf(orderNumberTxtf);
        instance.setCustomerNameTxtf(customerNameTxtf);
        instance.setEmailidtxtf(emailidTxtf);
        instance.setPhoneNoTxtf(phoneNoTxtf);

        String expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();
        assertEquals(expectedResult, instance.eventButtonClicked());
    }

    @Test
    public void testID3() {
        System.out.println("Test 3");

        // Test Inputs
        String orderno = "1";
        String customerName = "abc";
        String emailid = "abc@gmail.com";
        String phoneNo = "9999999999";
        String amt = "646.0";
        boolean[] toppings = {true, true, true, false};
        int[] vegqty = {1, 0, 0, 0, 0, 0};
        int[] nonvegqty = {1, 0, 0, 0, 0, 0};
        int pizzabasetype = 2;
        double discount = 0.0;
        // End of Test Inputs

        JTextField orderNumberTxtf = new JTextField(orderno);
        JTextField customerNameTxtf = new JTextField(customerName);
        JTextField emailidTxtf = new JTextField(emailid);
        JTextField phoneNoTxtf = new JTextField(phoneNo);

        pizzaBillOrderV2 instance = new pizzaBillOrderV2();

        instance.setvegqty(vegqty);
        instance.setnonvegqty(nonvegqty);
        instance.settoppings(toppings);
        instance.setpizzabasetype(pizzabasetype);
        instance.setdiscount(discount);
        instance.setOrderNumberTxtf(orderNumberTxtf);
        instance.setCustomerNameTxtf(customerNameTxtf);
        instance.setEmailidtxtf(emailidTxtf);
        instance.setPhoneNoTxtf(phoneNoTxtf);

        String expectedResult = "Hello" + customerName + ", Your Order Id is: "
                + orderno
                + "\nEmail ID: " + emailid
                + "\nPhone number: " + phoneNo
                + "\nAMOUNT PAYABLE IS: " + amt
                + "\nThe list of items ordered are:"
                + instance.setnonvegOrderList() + instance.setvegOrderList();
        assertEquals(expectedResult, instance.eventButtonClicked());
    }
}
