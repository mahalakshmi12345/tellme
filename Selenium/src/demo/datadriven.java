package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		FileInputStream m=new FileInputStream("F:\\excels\\datadrivens.xls");
		Workbook b=Workbook.getWorkbook(m);
		Sheet F=b.getSheet(0);
		Thread.sleep(5000);
				
		//int totalnorows=F.getRows();
		//for
		
		for (int j=1; j<=F.getRows(); j++)
		
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
	
		
		/*String FN=F.getCell(0,i).getContents();
		String LN=F.getCell(1,i).getContents();
		String ADDR=F.getCell(2,i).getContents();
		String EMAIL=F.getCell(3,i).getContents();
		String PHONE=F.getCell(4,i).getContents();
		String PASS=F.getCell(5,i).getContents();
		String CPASS=F.getCell(6,i).getContents();*/
		
		
}
	


