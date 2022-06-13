
import com.google.gson.JsonObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.List;
public class amazontestcase2 {

    @Test
    public void launchedAmazon() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");

            driver.close();
        } catch (Exception e) {
               }
    }

    @Test
    public void launchedAmazon2() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            driver.close();
        } catch (Exception e) {
        }
    }
    @Test
    public void launchedAmazon3() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }
    @Test
    public void launchedAmazon4() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon5() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon6() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon7() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon8() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon9() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

    @Test
    public void launchedAmazon10() throws IOException {
        try {

            String node="http://192.168.18.3:4444/wd/hub";
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setPlatform(Platform.LINUX);
            dc.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(node),dc);
            driver.navigate().to("https://www.amazon.in");
//            Thread.sleep(10000);
            System.out.println("working");
            driver.close();
        } catch (Exception e) {
        }
    }

}
