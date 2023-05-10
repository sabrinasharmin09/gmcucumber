package page;

import model.CreateNewGoogleAccountModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewGooglePage extends CreateNewGoogleAccountModel {

    public CreateNewGooglePage(WebDriver d){
        super(d);
    }

    public void typefirstname(String firstName) throws InterruptedException {

         WebElement a= getFirstName();
         a.clear();
         a.sendKeys(firstName);
    }

    public void typeLastname(String lastName) throws InterruptedException {

        WebElement a= getLastName();
        a.clear();
        a.sendKeys(lastName);
    }


    public void typeEmail(String email) throws InterruptedException {

        WebElement a= getEmail();
        a.clear();
        a.sendKeys(email);
    }



    public void typePassword(String password) throws InterruptedException {

        WebElement a= getPassword();
        a.clear();
        a.sendKeys(password);
    }

    public void typeRePassword(String repassword) throws InterruptedException {

        WebElement a= getrePassword();
        a.clear();
        a.sendKeys(repassword);
    }

    public void typeCheckBox() throws InterruptedException {

        WebElement a=getCheckBox();
       // a.clear();
        a.click();
    }


    public void typeClickNext() throws InterruptedException {

        WebElement a=getClickNext();
      //  a.clear();
        a.click();
    }

    public void typePhone(String phone) throws InterruptedException {
        WebElement s =getPhone();
       s.sendKeys(phone);
    }
    public void clickNext1(){
        WebElement e=getNext1();
        e.click();
    }




}
