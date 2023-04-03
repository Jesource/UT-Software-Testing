import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        String expectedURL = "http://localhost:3000/products";
        String actualURL = driver.getCurrentUrl();

        if (!actualURL.equals(expectedURL)) {
            Assert.fail("Wrong page appeared");
        }

        logout();
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
    public void admin_addAndDeleteProduct() {
        String productTitle = "3c6de1b7dd91465d437ef415f94f36afc1fbc8a8";
        String expectedNoticeText = "Product was successfully destroyed.";

        login(username, password);
        createProduct(productTitle, "decription", "Other", 15.0);
        deleteProduct(productTitle);
        String actualNoticeText = driver.findElement(By.id("notice")).getText();

        assertEquals(expectedNoticeText, actualNoticeText);
    }

    @Test
    public void admin_editProductTitleCannotBeEmpty() {
        String productTitle = "c43217d5453db839dd5b2c147621e73226e8e739";

        login(username, password);
        createProduct(productTitle, "decription", "Other", 15.0);
        WebElement productToDelete = driver.findElement(By.id(productTitle));
        productToDelete.findElement(By.linkText("Edit")).click();
        WebElement titleField = driver.findElement(By.id("product_title"));
        titleField.click();
        titleField.clear();
        driver.findElement(By.name("commit")).click();
        String errorText = driver.findElement(By.id("error_explanation")).getText();

//        Cleanup
        driver.findElement(By.linkText("Back")).click();
        deleteProduct(productTitle);

        assertEquals("1 error prohibited this product from being saved:\n" +
                "Title can't be blank", errorText);
    }


    @Test
    public void admin_editProductDescriptionCannotBeEmpty() {
        String productTitle = "c421312ao2ia3b3pb3fpi43b5pp5bfp290fhg57";

        login(username, password);
        createProduct(productTitle, "decription", "Other", 15.0);
        WebElement productToDelete = driver.findElement(By.id(productTitle));
        productToDelete.findElement(By.linkText("Edit")).click();
        WebElement description = driver.findElement(By.id("product_description"));
        description.clear();
        driver.findElement(By.name("commit")).click();
        String errorText = driver.findElement(By.id("error_explanation")).getText();

        // Cleanup
        driver.findElement(By.linkText("Back")).click();
        deleteProduct(productTitle);

        assertEquals("1 error prohibited this product from being saved:\n" +
                "Description can't be blank", errorText);
    }

    @Test
    public void admin_cannotSetNaNAsPrice() {
        String productTitle = "c43217d5453db839dd5123147621e73226e8e739";

        login(username, password);
        createProduct(productTitle, "decription", "Other", 15.0);
        WebElement productToDelete = driver.findElement(By.id(productTitle));
        productToDelete.findElement(By.linkText("Edit")).click();
        WebElement price = driver.findElement(By.id("product_price"));
        price.clear();
        price.sendKeys("Not a Number");
        driver.findElement(By.name("commit")).click();
        String errorText = driver.findElement(By.id("error_explanation")).getText();

        // Cleanup
        driver.findElement(By.linkText("Back")).click();
        deleteProduct(productTitle);

        assertEquals("1 error prohibited this product from being saved:\n" +
                "Price is not a number", errorText);
    }

    @Test
    public void admin_editProductCategory() {
        String productTitle = "546a17d5453db839dd5147621e73226e8e739";

        login(username, password);
        createProduct(productTitle, "decription", "Books", 15.0);
        WebElement productToDelete = driver.findElement(By.id(productTitle));
        productToDelete.findElement(By.linkText("Edit")).click();
        Select productCategorySelector = new Select(driver.findElement(By.id("product_prod_type")));
        String activeSelectedCategory = productCategorySelector.getFirstSelectedOption().getText();
        List<WebElement> categories = productCategorySelector.getOptions();
        if (categories.size() < 2) {
            throw new RuntimeException("Not enough categories to test category change");
        }
        String newCategory = activeSelectedCategory;
        for (WebElement category : categories) {
            if (!activeSelectedCategory.equals(category.getText())) {
                newCategory = category.getText();
                break;
            }
        }
        productCategorySelector.selectByValue(newCategory);
        driver.findElement(By.name("commit")).click();
        WebElement rowWithCategoryInfo = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/p[4]"));
        String categoryAfterUpdate = rowWithCategoryInfo.getText().replace(
                (driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/p[4]/strong")).getText()) + " ",
                "");

        // Cleanup
        driver.findElement(By.linkText("Back")).click();
        deleteProduct(productTitle);

        assertEquals("Category was not changed", newCategory, categoryAfterUpdate);
    }

    @Test
    public void admin_CannotCreateProductWithAlreadyTakenTitle() {
        String productTitle = "5461235453dba32das28e739";

        login(username, password);
        createProduct(productTitle, "decription", "Books", 15.0);
        createProduct(productTitle, "decription", "Books", 15.0);
        String errorText = driver.findElement(By.id("error_explanation")).getText();

        // Cleanup
        driver.findElement(By.linkText("Back")).click();
        deleteProduct(productTitle);

        assertEquals("1 error prohibited this product from being saved:\n" +
                "Title has already been taken", errorText);
    }

    @Test
    public void admin_CannotCreateProductWithoutSelectingCategory() {
        String productTitle = "5461235453dba32das28e739";

        login(username, password);
        WebElement product = driver.findElement(By.linkText("Products"));
        product.click();
        WebElement deleteAccountButton = driver.findElement(By.linkText("New product"));
        deleteAccountButton.click();
        driver.findElement(By.id("product_title")).sendKeys(productTitle);
        driver.findElement(By.id("product_description")).sendKeys("description");
        driver.findElement(By.id("product_price")).sendKeys("92076");
        String productCreationPageURL = driver.getCurrentUrl();
        driver.findElement(By.name("commit")).click();
        String URLAfterTryingToSaveProductWithoutSelectedCategory = driver.getCurrentUrl();

        // Cleanup
        deleteProduct(productTitle);

        assertEquals(productCreationPageURL, URLAfterTryingToSaveProductWithoutSelectedCategory);
    }
}
