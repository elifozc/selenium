package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class O3 {

    //1. Bir class oluşturun: LocatorsIntro
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    // a. http://a.testaddressbook.com adresine gidiniz.
    // b. Sign in butonuna basin
    // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    // i. Username : testtechproed@gmail.com
    // ii.Password : Test1234!
    // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    //3. Sayfada kac tane link oldugunu bulun.
    //4.Linklerin yazisini nasil yazdirabiliriz
    //5. driver i kapatin


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a   adrese git
        driver.navigate().to("http://a.testaddressbook.com");
        //b sign e tikla
        driver.findElement(By.xpath("//a[@class='nav-item nav-link']")).click();
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.className("form-control"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButonu = driver.findElement(By.xpath("//input[@value='Sign in']"));
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii.Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement idDogrulama = driver.findElement(By.xpath("//h1[text()='Welcome to Address Book']"));
        System.out.println(idDogrulama.getText());
        if (idDogrulama.isDisplayed()) {
            System.out.println("Id Girisi PASS");//Yani sayfaya giris yapilirsa
        } else {//sayfaya giris yapilamassa
            System.out.println("Id Girisi FAILED");
        }
// f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressIsDisplay = driver.findElement(By.xpath("//a[@href='/addresses']"));
        if (adressIsDisplay.isDisplayed()) {
            System.out.println("Adress Testi PASS");
        } else {
            System.out.println("Adress Testi FAILED");
        }
        WebElement signOutisDisplay = driver.findElement(By.xpath("//a[text()='Sign out']"));
        if (signOutisDisplay.isDisplayed()) {
            System.out.println("signOutisDisplay Testi PASS");
        } else {
            System.out.println("signOutisDisplayTesti FAILED");
        }
//3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> sayfadakiLinkSayi = driver.findElements(By.tagName("a"));
//4.Linklerin yazisini nasil yazdirabiliriz
        System.out.println("sayfada " + sayfadakiLinkSayi.size() + " tane yanyana link mevcuttur");
//5. driver i kapatin
        driver.close();

    }

}
