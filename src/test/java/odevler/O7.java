package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class O7 {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void test01() {
        // 4 TEST METODU OLUSTURUN,oncelik vererek sirasiyla
        // https://www.n11.com/ SAYFASINA GiDİN.
        driver.get("https://www.n11.com/");

    }

    @Test(priority = 2)
    public void test02() {

        driver.get("https://www.gittigidiyor.com/ ");
        // https://www.gittigidiyor.com/ SAYFASINA GiDiN

    }


    @Test(priority = 3)
    public void test03() {

        driver.get("https://getir.com/");

        // https://getir.com/ SAYFASINA GiDiN

    }




    @Test(priority = 4)
    public void test04() {

        driver.get("https://www.sahibinden.com/ ");

        // https://www.sahibinden.com/ SAYFASINA GiDiN
    }
}
