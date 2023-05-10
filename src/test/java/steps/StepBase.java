package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBase {


    static WebDriver driver;


    @Before("@chrome")
    public void before(){
        driver =getDriver("Chrome");
        driver.manage().window().maximize();

    }
    public WebDriver getDriver(String browser){
        if (driver==null){
            if (browser.equals("Chrome")){
                System.setProperty("webdriver.chrome.driver","Driver/chromedriver1.exe");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }


}
