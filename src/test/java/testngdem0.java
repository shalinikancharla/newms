import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testngdem0 {
    WebDriver driver;

    @Test
    public void loginbrowser() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
    driver=new FirefoxDriver();
        driver.get("https://stock.amolujagare.com/");

}

}
