package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class O8 {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test01() {
        // 1) "https://www.facebook.com/" SAYFASINA GiDiN
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();

        // 2) YENi HESAP OLUSTUR BUTONUNA TIKLAYIN
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        // 3) DOGUM TARiHi BOLUMUNDEKi GUNLERiN LiSTESiNi ALIN
        WebElement days= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select= new Select(days);
        String gunlerListesi="";
        List<WebElement>daysList=select.getOptions();
        System.out.println();
        System.out.println("DAYS  : ");

        for (WebElement each:daysList
             ) {
            System.out.print(gunlerListesi+=each.getText());

        }

        // 4) DOGUM TARiHi BOLUMUNDEKi AYLARIN LiSTESiNi ALIN

        WebElement aylar= driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select select2= new Select(aylar);
        String aylarListesi="";
        List<WebElement>aylarList=select2.getOptions();
        System.out.println();
        System.out.println("AYLAR : ");
        for (WebElement each2: aylarList
             ) {
            System.out.print(aylarListesi+=each2.getText());

        }


        // 5) DOGUM TARiHi BOLUMUNDEKi YILLARIN LiSTESiNi ALIN

        WebElement yillar=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select select3= new Select(yillar);
        String yillarListesi="";
        List<WebElement>yillarList=select3.getOptions();
        System.out.println();
        System.out.println("YILLAR: ");
        for (WebElement each:yillarList
             ) {
            System.out.print(yillarListesi+=each.getText());

        }
    }
}