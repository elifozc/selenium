package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03IlkTestMethodu {

    WebDriver driver;

    @Test
    public  void test01(){


        driver.get("https://www.amazon.com/");
        String actualtitle= driver.getTitle();
        String arananKelime="amazon";

        if (actualtitle.contains(arananKelime)){
            System.out.println("PASS");

        }else {
            System.out.println("FAILED");
        }
    }

    @Test
    public  void test02(){
        System.out.println("2.test methodu çalıştı");
    }


    @Before
    public void ayarlarıDuzenle(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void ortaligiTopla(){

    }
}
