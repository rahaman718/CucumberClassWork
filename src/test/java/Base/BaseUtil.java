package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

    //the codes to handle the  multiple browser
    // clear the cookies
    //Maximize the window
    //Implicit wait

    public static WebDriver driver;

    public static WebDriver initDriver (String driverType) {
        choseBrowser(driverType);
        driver.getTitle();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        return driver;
    }


    public static void choseBrowser(String driverType) {
        if (driverType.equalsIgnoreCase("ch")) {
            WebDriverManager.chromedriver().setup();
            driver  = new ChromeDriver();
        }
        else if(driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();


    }
}
}
