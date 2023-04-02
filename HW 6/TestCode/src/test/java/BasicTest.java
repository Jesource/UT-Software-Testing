import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class BasicTest extends TestHelper {


    private String username = "test";
    private String password = "test";

    @Test
    public void titleExistsTest() {
        String expectedTitle = "ST Online Store";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);
    }


    /*
    In class Exercise

    Fill in loginLogoutTest() and login method in TestHelper, so that the test passes correctly.

     */
    @Test
    public void loginLogoutTest() {

        login(username, password);

        // assert that correct page appeared
//        WebElement adminHeader = driver.findElement();
//        driver.getCurrentUrl();
//        System.out.println(adminHeader);
        // ...
        String expectedURL = "http://localhost:3000/products";
        String actualURL = driver.getCurrentUrl();

//        assertEquals(expectedURL, actualURL);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!actualURL.equals(expectedURL)) {
            Assert.fail("Wrong page appeared");
        }

        logout();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    In class Exercise

     Write a test case, where you make sure, that one can’t log in with a false password

     */
    @Test
    public void loginFalsePassword() {
        login(username, "falsePassword");
        String loginFailMessageActual = driver.findElement(By.id("notice")).getText();
        String loginFailMessageExpected = "Invalid user/password combination";

        assertEquals(loginFailMessageExpected, loginFailMessageActual);
    }

    @Test
    public void admin_registerAndDeleteNewAccount() {
        String testUsername = "testingAdminRegistration";
        String testPassword = "testPassword123";

        registerAdmin(testUsername, testPassword);

        // Cleanup
        logout();
        deleteAdmin(testUsername, testPassword);
    }

    @Test
    public void admin_addAndDeleteProduct() { // Also add test where I expect error coz price is NaN
        String productTitle = "3c6de1b7dd91465d437ef415f94f36afc1fbc8a8";
        String expectedNoticeText = "Product was successfully destroyed.";

        login(username, password);
        createProduct(productTitle, "decription", "Other", 15.0);
        deleteProduct(productTitle);
        String actualNoticeText = driver.findElement(By.id("notice")).getText();

        assertEquals(expectedNoticeText, actualNoticeText);
    }
}
