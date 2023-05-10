package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import page.CreateNewGooglePage;
import page.Homepage;
import page.codeverifyPage;

public class BaseTest {
   static WebDriver driver;
   static Homepage homepage;
   static CreateNewGooglePage cngp;

   static codeverifyPage vap;


    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver1.exe");
        driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
    }

    public void getHomePage(){
        homepage=new Homepage(driver);
    }

    public void getCreateNew(){
        cngp=new CreateNewGooglePage(driver);

    }

    public void getVerifyCode(){
       vap=new codeverifyPage(driver);
    }


}
