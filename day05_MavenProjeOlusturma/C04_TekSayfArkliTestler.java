package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekSayfArkliTestler {

   static WebDriver driver;
    static WebElement aramaKutu;
   static WebElement sonucYazisiElementi;



    @Test
    public void test01(){
    aramaKutu.sendKeys("nutella" + Keys.ENTER);
        sonucYazisiElementi= driver.findElement(By.xpath("/div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualNutSonc=sonucYazisiElementi.getText();
        String arananKelm="nutella";

        if (actualNutSonc.contains(arananKelm)){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

    }


    @Test
    public void test02(){
        aramaKutu.sendKeys("java" + Keys.ENTER);
        sonucYazisiElementi= driver.findElement(By.xpath("/div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualNutSonc=sonucYazisiElementi.getText();
        String arananKelm="nutella";

        if (actualNutSonc.contains(arananKelm)){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

    }


    @Test
    public void test03(){

    }

    @BeforeClass
    public static void  ayarla(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        aramaKutu= driver.findElement(By.id("twotabsearchtextbox"));

    }

    @AfterClass
    public static void topla(){
        driver.close();
    }
}
