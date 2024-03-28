package MyFirstSeleniumProject.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;


public class Base {

    public static WebDriver driver;

    public static void getDriver(){
        System.out.println(System.getProperty("webdriver.driver"));
        switch (System.getProperty("webdriver.driver")){
            case "firefox":
            case "mozilla":{
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "edge":{
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            }
            case "chrome":
            default:{
                ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
                options.addArguments("--incognito");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            }
        }
    }

    public static void getPropValues() {
        try {
            Properties prop = new Properties();
            FileInputStream ip = new FileInputStream("./config.properties");
            prop.load(ip);
            System.setProperty("default.url", prop.getProperty("default.url"));
            System.setProperty("webdriver.driver", prop.getProperty("webdriver.driver"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void kill(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }



}
