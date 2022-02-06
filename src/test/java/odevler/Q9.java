package odevler;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q9 extends TestBase {


    @Test
    public void Odev() throws InterruptedException
   {
        ////      //   1- https://www.facebook.com adresine gidelim
        //        //    2- Yeni hesap olustur butonuna basalim
        //        //    3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim

        driver.get("https://www.facebook.com");
       driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//a[.='Yeni Hesap Oluştur']")).click();
        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.click(name).
                sendKeys("elif").
                sendKeys(Keys.TAB).
                sendKeys("oz").
                sendKeys(Keys.TAB).
                sendKeys("els@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("els@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("458712,").
                perform();

        WebElement saveBox = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

       actions.click(saveBox).perform();








    }



}
