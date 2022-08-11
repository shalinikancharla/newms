import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwebpage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");
       // driver.manage().window().maximize();
        driver.navigate().to("https://support.mozzila.org");
       String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("google"))
        {
            System.out.println("the page is correct");

        }
        else
            System.out.println("the page is incorrect");
    }
}
