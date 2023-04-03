import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class TestHelper {

    static WebDriver driver;
    final int waitForResposeTime = 4;

    // here write a link to your admin website (e.g. http://my-app.herokuapp.com/admin)
    String baseUrlAdmin = "http://localhost:3000/admin";

    // here write a link to your website (e.g. http://my-app.herokuapp.com/)
    String baseUrl = "http://localhost:3000";

    @Before
    public void setUp() {

        // if you use Chrome:
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\chromedriver.exe");
        // driver = new ChromeDriver();

        // if you use Firefox:
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\...\\geckodriver.exe");
        //driver = new FirefoxDriver();

        // if you use Firefox:
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\aleks\\OneDrive\\Desktop\\ST\\UT-Software-Testing\\HW 6\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    void goToPage(String page) {
        WebElement elem = driver.findElement(By.linkText(page));
        elem.click();
        waitForElementById(page);
    }

    void waitForElementById(String id) {
        new WebDriverWait(driver, waitForResposeTime).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    void login(String username, String password) {

        driver.get(baseUrlAdmin);

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("name")).sendKeys(username);

        driver.findElement(By.id("password")).sendKeys(password);

        By loginButtonXpath = By.xpath("//input[@value='Login']");
        // click on the button
        driver.findElement(loginButtonXpath).click();
    }

    void logout() {
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();

        waitForElementById("Admin");
    }

    void deleteAdmin(String username, String password) {
        login(username, password);
        if (driver.getCurrentUrl().equals("http://localhost:3000/login") || !driver.getCurrentUrl().equals("http://localhost:3000/products")) {
            throw new RuntimeException("Invalid user/password combination");
        }
        WebElement admin = driver.findElement(By.linkText("Admin"));
        admin.click();
        WebElement deleteAccountButton = driver.findElement(By.linkText("Delete"));
        deleteAccountButton.click();
    }

    void registerAdmin(String username, String password) {
        driver.get(baseUrlAdmin);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("user_name")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.id("user_password_confirmation")).sendKeys(password);
        By loginButtonXpath = By.xpath("//input[@value='Create User']");
        driver.findElement(loginButtonXpath).click();
    }

    void createProduct(String title, String description, String productType, Double price) {
        WebElement product = driver.findElement(By.linkText("Products"));
        product.click();
        WebElement deleteAccountButton = driver.findElement(By.linkText("New product"));
        deleteAccountButton.click();
        driver.findElement(By.id("product_title")).sendKeys(title);
        driver.findElement(By.id("product_description")).sendKeys(description);
        driver.findElement(By.id("product_price")).sendKeys(price.toString());
        Select productTypeSelector = new Select(driver.findElement(By.id("product_prod_type")));
        List<WebElement> optionList = productTypeSelector.getOptions();
        productTypeSelector.selectByValue(productType);
        driver.findElement(By.name("commit")).click();
    }

    void deleteProduct(String productTitle) {
        WebElement productToDelete = driver.findElement(By.id(productTitle));
        productToDelete.findElement(By.linkText("Delete")).click();
    }

    void addProductToTheCart(String productTitle){
        WebElement productToAdd = driver.findElement(By.id(productTitle));
        productToAdd.findElement(By.className("button_to")).click();
    }

    void emptyTheCart(){
        WebElement form = driver.findElement(By.className("button_to"));
        form.findElement(By.cssSelector("input[type='submit'][value='Empty cart']")).click();
    }

    void checkCategory(String category){
        driver.get("http://localhost:3000/store/filter?sort="+category);
        WebElement parentDiv = driver.findElement(By.id("main"));
        List<WebElement> childDivs = parentDiv.findElements(By.className("entry"));
        for (WebElement div : childDivs) {
            WebElement categoryP = div.findElement(By.id("category"));
            String categoryText = categoryP.getText();
            String categoryValue = categoryText.substring(categoryText.indexOf("</strong>") + "</strong>".length());
            System.out.println(categoryValue);
            assertEquals (categoryText, "Category"+categoryValue);
        }
    }

    @After
    public void tearDown() {
        driver.close();
    }

}