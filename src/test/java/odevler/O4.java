package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class O4 {


    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");

    }






   @Test
    public void test01(){

//            - Test 1
//    Arama kutusunun yanindaki kategori menusundeki kategori
//    sayisinin 45 oldugunu test edin

       List<WebElement>kategoriListe=driver.findElements(By.xpath("//options"));
       int actualSize=kategoriListe.size();
       int expectedKategori=45;

       Assert.assertEquals(actualSize,expectedKategori);








}

    @Test
    public void test02(){
        //-Test 2
//            1. Kategori menusunden Books secenegini secin

        WebElement dropdownKategori= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select= new Select(dropdownKategori);
        select.selectByValue("search-alias=stripbooks-intl-ship");




//2. Arama kutusuna Java yazin ve aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("Java"+ Keys.ENTER);


//3. Bulunan sonuc sayisini yazdirin
        WebElement sonucYazisiElementi=  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'][1]"));
//4. Sonucun Java kelimesini icerdigini test edin
        String actualSonucYazisi=sonucYazisiElementi.getText();
        String expectedSonucYazisi="Java";
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));







    }








}
