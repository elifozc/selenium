package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));//NullPointerException

        //eğer key olarak girdiğimiz String comfiguration.properties dosyasında yoksa
        //ornegin HMCUrl yerine HMCurl yazarsak
        //config.reader.getproperty() o key e karşılık o key i bulamaz
        // ve NullPointerException fırlatır



    }

}
