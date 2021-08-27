package Week3Day2Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement SearchValue = driver.findElement(By.name("searchVal"));
		SearchValue.sendKeys("Bags");
		SearchValue.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class= 'facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id= 'Men - Fashion Bags']")).click();
		driver.findElement(By.xpath("//label[@class = 'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String Length = driver.findElement(By.className("length")).getText();
		System.out.println("The Search result : "+Length );
			
		List <WebElement> brandnames = driver.findElements(By.className("brands"));
		System.out.println("Size "+ brandnames.size());
		for(WebElement webelement : brandnames) {
			String text = webelement.getText();
			System.out.println(text);
		}
		List<WebElement>bagnames = driver.findElements(By.className("name"));
		System.out.println("total number of bags : "+bagnames.size());
		for(WebElement webelement :bagnames ) {
			String text = webelement.getText();
			System.out.println("The brand names are: "+text);
		}
		
		}
}
