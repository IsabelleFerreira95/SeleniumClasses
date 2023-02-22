import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //create an instance of webDriver
        WebDriver driver=new ChromeDriver();
        //open the website google.com
        driver.get("https://www.google.com/");

        //get the current url that is there in the browser
        String URL=driver.getCurrentUrl();
        //print out the url
        System.out.println(URL);
        //get the title of the webpage
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);
        Thread.sleep(3000);
        //close the browser
        driver.quit();
    }
}
