import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titlemozila {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://gmail.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println("title:"+driver.getTitle());
        if(driver.getTitle().equals("Gmail"))
        {
            System.out.println("title is correct");
        }
        else
            System.out.println("title is incorrect");
    }
}
