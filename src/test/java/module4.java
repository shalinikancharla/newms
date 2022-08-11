import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("shalinikancharla92@gmail.com");
        driver.findElement(By.name("password")).sendKeys("08f91a0492");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.findElement(By.xpath("//inut[@class='btn btn-primary' or text()='Continue']")).click();
        driver.findElement(By.xpath("(//a[text()='Logout'])[1]"));
       String actual=driver.findElement(By.xpath("(")).getText();
        if(actual.equals("You have been logged off your account. It is now safe to leave the computer"))
        {
            System.out.println("successfully logout");
        }
        else
        {
        System.out.println("successfully not logout");
        }

       // driver.findElement(By.xpath("//inut[@class='btn btn-primary' or text()='Continue']")).click();


    }

}
