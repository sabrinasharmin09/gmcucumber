package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeGoogleModel extends BaseModel{
    public HomeGoogleModel(WebDriver d){
        super(d);
    }

    public WebElement getCreateAccount(){
        WebElement a= driver.findElement(By.xpath("//input[@name='firstName']"));
        return  a;

    }
}
