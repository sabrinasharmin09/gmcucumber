package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class codeverifyModel extends BaseModel{

    public codeverifyModel(WebDriver d){
        super(d);
    }


    public WebElement getcode() throws InterruptedException {
        Thread.sleep(3000);
        WebElement e=driver.findElement(By.xpath("//span[@dir='ltr']"));
        return e;
    }







}
