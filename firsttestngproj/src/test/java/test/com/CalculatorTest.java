/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.Calculator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author vidhi
 */
public class CalculatorTest {
    Calculator calc;
    private static WebDriver driver;
    private String baseUrl="https://www.indeed.com";  
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        calc = new Calculator();
        System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testAdd()
    {
    Assert.assertEquals(calc.add(2,2), 4);
    }
    @Test
    public void testIndeed() throws InterruptedException
    {
         driver.get("http://demo.guru99.com/test/newtours/index.php");
         Thread.sleep(1000);
         driver.close();
   }
}
