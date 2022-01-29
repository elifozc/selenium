package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04_DragAndDrop extends TestBase {
//Yeni bir class olusturalim: MouseActions2
//1- https://demoqa.com/droppable adresine gidelim
//2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
//3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");

        Actions actions= new Actions(driver);

        WebElement dragMe=driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement tasinacakHedefElement= driver.findElement(By.xpath("//div[@id='droppable'][1]"));

        actions.dragAndDrop(dragMe,tasinacakHedefElement).perform();

        String actualDroppedYazisi=tasinacakHedefElement.getText();
        String expectedDroppedyazisi="Dropped!";

        Assert.assertEquals(actualDroppedYazisi,expectedDroppedyazisi);

        Thread.sleep(3000);




    }









}
