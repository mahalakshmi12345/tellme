package demo;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTestNG {
	WebDriver d;
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		Thread.sleep(4000);
  }
  
  @Test(priority=2)
  public void f() throws BiffException, IOException, InterruptedException {
	  
	  FileInputStream m=new FileInputStream("F:\\excels\\datadrivens.xls");
		Workbook b=Workbook.getWorkbook(m);
		Sheet F=b.getSheet(0);
		Thread.sleep(5000);
		for (int j=1; j<=13; j++)
			
		{
	
			
			
		
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(F.getCell(0,j).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(F.getCell(1,j).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(F.getCell(2,j).getContents());
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(F.getCell(3,j).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(F.getCell(4,j).getContents());
		d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(F.getCell(5,j).getContents());
		d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(F.getCell(6,j).getContents());
		d.findElement(By.id("Button1")).click();
	
		}
		
	
  }
  @Test(enabled=false)
  public void u() throws BiffException, IOException, InterruptedException {
	  
	  FileInputStream m=new FileInputStream("F:\\excels\\datadrivens.xls");
		Workbook b=Workbook.getWorkbook(m);
		Sheet F=b.getSheet(0);
		for (int i=14; i<=19; i++)
		{
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(F.getCell(0,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(F.getCell(1,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(F.getCell(2,i).getContents());
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(F.getCell(3,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(F.getCell(4,i).getContents());
		d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(F.getCell(5,i).getContents());
		d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(F.getCell(6,i).getContents());
		d.findElement(By.id("Button1")).click();
			
		}
		}
  
@Test
  
  public void c() throws BiffException, IOException, InterruptedException {
	  
	  FileInputStream m=new FileInputStream("F:\\excels\\datadrivens.xls");
		Workbook b=Workbook.getWorkbook(m);
		Sheet F=b.getSheet(1);
		for (int i=1; i<=8; i++)
		{
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(F.getCell(0,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(F.getCell(1,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(F.getCell(2,i).getContents());
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(F.getCell(3,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(F.getCell(4,i).getContents());
		d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(F.getCell(5,i).getContents());
		d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(F.getCell(6,i).getContents());
		d.findElement(By.id("Button1")).click();
			
		}
		}

  @Test(invocationCount=2)
  public void k() throws BiffException, IOException, InterruptedException {
	  
	  FileInputStream m=new FileInputStream("F:\\excels\\datadrivens.xls");
		Workbook b=Workbook.getWorkbook(m);
		Sheet F=b.getSheet(2);
		for (int i=1; i<=5; i++)
		{
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(F.getCell(0,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(F.getCell(1,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(F.getCell(2,i).getContents());
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(F.getCell(3,i).getContents());
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(F.getCell(4,i).getContents());
		d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(F.getCell(5,i).getContents());
		d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(F.getCell(6,i).getContents());
		d.findElement(By.id("Button1")).click();
			
		}
		}
  @AfterClass
  public void afterClass() {
	  
	  d.close();
	  
  }

}
