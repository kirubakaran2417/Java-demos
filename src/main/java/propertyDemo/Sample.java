package propertyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample {


    By search=By.name(Propertyfilereader.getProperty("searchbox_name"));
    @Test
    public void testcase(){
        WebDriver driver = new EdgeDriver();
        driver.get(Propertyfilereader.getProperty("url"));
        driver.findElement(search).sendKeys("maamanan");
    }

}
