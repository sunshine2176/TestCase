package com.david.s;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void testMail() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.yeah.net");
//		driver.get("file:///D:/test.html");
		Thread.sleep(2000);
		
		driver.findElement(
				By.xpath("/html/body/section/div/div/form/div[1]/input"))
				.sendKeys("testautomation");
		driver.findElement(
				By.xpath("/html/body/section/div/div/form/div[2]/input"))
				.sendKeys("edcedc");
		driver.findElement(By.xpath("/html/body/section/div/div/form/button"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/span[2]")).click();
		driver.findElement(
				By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/span"))
				.click();

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/header/div/div[3]/div[4]/span[1]")).click();
		Thread.sleep(2000);
		System.out.println("************** " + driver.findElements(By.className("nui-menu-item-text")).get(0).getText());
		driver.close();
	}
	
	public static void main(String[] args){
		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("file:///D:/test.html");
			Thread.sleep(2000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			
			System.out.println("*********** " + js.executeScript("document.getElementById('divText').value='123444';"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
