import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlecheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://gmail.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println("title:"+driver.getTitle());
    }
}
