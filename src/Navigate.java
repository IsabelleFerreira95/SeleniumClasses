import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //initiate the instance of webDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //slow down
        Thread.sleep(2000);
        //now navigate to facebook.com
        driver.navigate().to("http://www.facebook.com/");
        //slow down
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        //Slow down
        Thread.sleep(2000);
        //go to Facebook
        driver.navigate().forward();
        //slow down
        Thread.sleep(2000);
        //to refresh
        driver.navigate().refresh();
    }
}
