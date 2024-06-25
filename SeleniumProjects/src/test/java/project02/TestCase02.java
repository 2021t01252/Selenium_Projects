package project02;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase02 {

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
		
		String acctual_link = "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
		String expected_link = driver.getCurrentUrl();
		
		if(acctual_link.equals(expected_link)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		
		String acctual_title = "Guru99 Bank Manager HomePage";
		String expected_title = driver.getTitle();
		
		if(acctual_title.equals(expected_title)) {
			System.out.println("Title Verify Successful");
		}
		else {
			System.out.println("Title Verify Failed");
		}
		
		driver.close();

	}

}
