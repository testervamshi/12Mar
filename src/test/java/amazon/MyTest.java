package amazon;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
	public WebDriver driver;
	@Test
	public void listProducts() throws InterruptedException, IOException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Boy's Fashion");
		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement>all=driver.findElements(By.xpath("//div[@class='a-section a-spacing-base a-text-center']/div[2]/div/h2"));


		for(int i=0;i<=all.size()-1;i++) {

			System.out.println(all.get(i).getText());
		}
		//		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Data.xlsx");
		//		//open workbook
		//		XSSFWorkbook workbook=new XSSFWorkbook();
		//		//create sheet
		//		XSSFSheet sheet=workbook.createSheet();
		//		XSSFRow row1=sheet.createRow(0);//create 1st row
		//		//row1
		//		
		//name_input = driver.findElement(null)
		//		
		//		for(int j=0;j<row1-1;j++)
		//		{
		//			
		//		}
		//		
		//		
		//		workbook.write(file);//this will write data into xl
		//		workbook.close();
		//		file.close();
		//				System.out.println("writing completed");
	}
}
