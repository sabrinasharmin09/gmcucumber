package page;

import model.HomeGoogleModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends HomeGoogleModel {

    public Homepage(WebDriver d){
        super(d);
    }

    public void clickOnCreateGoogleAccount(){
        WebElement e=getCreateAccount();
        e.click();
    }
}
