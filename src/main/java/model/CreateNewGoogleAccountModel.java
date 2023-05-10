package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewGoogleAccountModel extends BaseModel{


    public CreateNewGoogleAccountModel(WebDriver d){
        super(d);

    }

    public WebElement getFirstName() throws InterruptedException {
       // Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@id='firstName']"));
        return a;
    }

    public WebElement getLastName() throws InterruptedException {
      //  Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@id='lastName']"));
        return a;
    }
    public WebElement getEmail() throws InterruptedException {
      //  Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@id='username']"));
        return a;
    }


    public WebElement getPassword() throws InterruptedException {
      //  Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@name='Passwd']"));
        return a;
    }



    public WebElement getrePassword() throws InterruptedException {
        //Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
        return a;
    }


    public WebElement getCheckBox() throws InterruptedException {
      //  Thread.sleep(3000);
        WebElement a =driver.findElement(By.xpath("//input[@type='checkbox']"));
        return a;
    }

    public  WebElement getClickNext(){
        WebElement a=driver.findElement(By.xpath("//span[text()='Next']"));
        return a;

    }


    public WebElement getPhone() throws InterruptedException {
        Thread.sleep(3000);
        WebElement s=driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
        return s;
    }

    public WebElement getNext1(){
        WebElement e=driver.findElement(By.xpath("//span[text()='Next']"));
        return e;
    }





}
