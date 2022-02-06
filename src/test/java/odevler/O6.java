package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class O6 {


    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


    @Test
    public void test(){

        // ...Exercise4...
// Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
// Under the  ORIGINAL CONTENTS
// click on Alerts
       driver.findElement(By.xpath("//a[@id='alerts']")).click();

// print the URL
        driver.getCurrentUrl();

// navigate back
        driver.navigate().back();
// print the URL
        String url1="";
        url1+=driver.getCurrentUrl();
        System.out.println(url1);
// Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
// print the URL
      String url2="";
      url2+=driver.getCurrentUrl();
        System.out.println(url2);
// enter value-> 20 and Enter
       WebElement value= driver.findElement(By.id("lteq30"));
       value.click();
       value.sendKeys("20" + Keys.ENTER);



// and then verify Submitted Values is displayed open page

        String actualvalue="20";
        String expectedvalue=value.getText();

        Assert.assertEquals(actualvalue,expectedvalue);

// close driver

    }

}
