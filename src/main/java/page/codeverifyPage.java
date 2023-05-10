package page;

import model.codeverifyModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class codeverifyPage extends codeverifyModel {

    public codeverifyPage(WebDriver d){
        super(d);
    }


    public String clickCode() throws InterruptedException {
        WebElement e=getcode();
        String ph=e.getText();
        return ph;
    }






}
