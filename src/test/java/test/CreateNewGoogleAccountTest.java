package test;

import lib.ExcelRead;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.BaseTest;

import java.io.IOException;

public class CreateNewGoogleAccountTest extends BaseTest{

@Test(dataProvider = "GA")
    public void createnewgoogletest(String f,String lastname,String email,String password,String rePassword,String phone) throws InterruptedException {


    getHomePage();
    homepage.clickOnCreateGoogleAccount();
    getCreateNew();
    cngp.typefirstname(f);
    cngp.typeLastname(lastname);
    cngp.typeEmail(email);
    cngp.typePassword(password);
    cngp.typeRePassword(rePassword);
    cngp.typeCheckBox();
    cngp.typeClickNext();
   cngp.typePhone(phone);
    cngp.clickNext1();
    getVerifyCode();
    String actual=vap.clickCode();
    Assert.assertEquals(actual,phone);

    }


    @DataProvider(name = "GA")
    public Object[][]getdata() throws IOException {
    Object[][]t;
    String filename="Data/Google.xlsx";
    String sheetname="Sheet1";
        ExcelRead er =new ExcelRead(filename,sheetname);
        t= er.excelToArray();

    return t;

    }




}
