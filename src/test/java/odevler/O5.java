package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class O5 {


    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    WebElement actualtext=driver.findElement(By.tagName("h3"));
    String istenentext="Opening a new window";
       // Assert.assertEquals(actualtext,istenentext);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
     String actualtitle= driver.getTitle();
     String istenenTitle="The Internet";
     Assert.assertEquals(actualtitle,istenenTitle);

        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        String actualNewWindowTitle=driver.getTitle();
        String istenenNewWindowTitle="New Window";
        Assert.assertEquals(actualNewWindowTitle,istenenNewWindowTitle);


        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement actualNewWindowText=driver.findElement(By.tagName("h3"));
        String istenenNewWindowText="New Window";
        Assert.assertEquals(actualNewWindowText,istenenNewWindowText);

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.navigate().back();


    }

}
