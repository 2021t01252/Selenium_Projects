package project01;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		
		WebElement username = driver.findElement(By.name("uid"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		username.sendKeys("mngr577684");
		password.sendKeys("AnUrAby");
		login.click();
		
		String actual_url = "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
		String expected_url = driver.getCurrentUrl();
		
		System.out.println(actual_url);
		System.out.println(expected_url);
		
		if(actual_url.equals(expected_url)) {
			
			System.out.println("Login Successful");
		}
		else {
			
			System.out.println("Login Error");
		}
		

	}

}
