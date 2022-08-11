import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.findElement(By.xpath("//*[@id=\"user-name\"] ")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        if(driver.getTitle().equals("Swag Labs")) {
            System.out.println("the page  title is correct");
        }
        else
            System.out.println("incorrect");


        String txt=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        String txt1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getAttribute("products");
        System.out.println(txt1);




    }
}
