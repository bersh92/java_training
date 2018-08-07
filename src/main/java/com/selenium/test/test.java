package automationpractice.com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class test {
    public static void main(String[] args) {
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.google.cz");
    }
}
