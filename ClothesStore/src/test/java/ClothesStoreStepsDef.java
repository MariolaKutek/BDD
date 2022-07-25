import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClothesStoreStepsDef {
    WebDriver webDriver;

    @Before
    public void openGoogleChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        System.out.println("Open Google Chrome browser");
    }

    @And("I go to website")
    public void iGoToWebsite() {
        webDriver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        System.out.println("I go to website");
    }

    @When("I select {string} size")
    public void iSelectSize(String arg0) {
        webDriver.findElement(By.xpath(String.format("//span[text()='%s']",arg0))).click();
        System.out.println(String.format("I choose %s size", arg0));
    }

    @Then("I can see {int} products")
    public void iCanSeeProducts(int arg0) throws InterruptedException {
        Thread.sleep(3000);
        int size = webDriver.findElements(By.cssSelector(".sc-124al1g-2")).size();
        System.out.println(String.format("I can see %s product",size));
        System.out.println(String.format("But should be %s product",arg0));
        Assert.assertEquals(arg0,size);
    }


}
