package tests.day16.dy16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {



    //POM de farklı classlara farklı şekilde ulaşılması benimsenmiştir
    // Driver class ı için static yöntemi kullanıyoruz
    // Page calss ları için obje üzerinden kullanılması tercih edilmiştir

    @Test
    public void test01(){

        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //arama kutusuna Nutella yazıp aratalım

        AmazonPage amazonPage=new AmazonPage(); //istersem objeyi class levelde oluştururum her methodda yapmama gerek kalmaz
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"  + Keys.ENTER);

        //arama sonuclarının nutella oldugunu test edelim
        String actalSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actalSonucStr.contains("Nutella"));


        Driver.closeDriver();
    }


    @Test
    public void test02(){
        //amazona gidelim java için arama yapalım
        Driver.getDriver().get("https://www.amazon.com");

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);


        //sonucun java içerdiğini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Java"));
    }
}
