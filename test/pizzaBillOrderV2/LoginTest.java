/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pizzaBillOrderV2;

import static org.junit.Assert.assertEquals;
import javax.swing.JTextField;
import org.junit.Test;

/**
 *
 * @author shakthi
 */
public class LoginTest {

    public LoginTest() {
    }

    private Login setvalues(String username, String pws) {
        Login login = new Login();
        JTextField user = new JTextField(username);
        JTextField password = new JTextField(pws);
        login.setNametxtf(user);
        login.setPwstxtf(password);
        return login;
    }

    @Test
    public void testMain() {
        System.out.println("main");

        String u = "ADMIN";
        String p = "ADMIN";

        Login login = setvalues(u, p);

        // TODO review the generated test code and remove the default call to fail.
    }

}
