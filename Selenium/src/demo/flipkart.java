package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.get("https://www.flipkart.com/");
		f.manage().window().maximize();
		f.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		Actions a=new Actions(f);
		a.moveToElement(f.findElement(By.cssSelector("#container > div > div.zi6sUf > div > ul > li:nth-child(4) > span"))).build().perform();
		Actions b=new Actions(f);
		b.moveToElement(f.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]/ul/li/ul/li[2]/ul/li[11]/a"))).click().perform();
	}

}
