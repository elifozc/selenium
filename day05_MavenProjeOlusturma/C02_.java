package day05_MavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

 //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        WebElement userName= driver.findElement(By.xpath("//input[@name='user-name']"));
        userName.sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce");


        //4. Login tusuna basin
        driver.findElement(By.xpath("//input[@name='login-button']")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkElement=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String ilkUrunIsim=ilkElement.getText();
        ilkElement.click();


        //6. Add to Cart butonuna basin
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        //9. Sayfayi kapatin













    }
}
