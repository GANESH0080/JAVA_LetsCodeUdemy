package UdemyCourseExamples;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductIntoCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Creating array with name as "item"
		String[] items = { "Beetroot", "Brinjal" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// Calling function / method
		addItems(driver, items);

	}

	public static void addItems(WebDriver driver, String[] items) throws InterruptedException {
		int j = 0;
		// Creating list to get the number of product on page using findelements
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		// Convert Array into Arraylist because array taking so much memory
		List<String> al = Arrays.asList(items);

		// For Loop for getting index & text of product
		for (int i = 0; i < product.size(); i++) {

			// Creating array because after spilitting the product name we get 2
			// diff strings
			// String productText =
			// product.get(i).getText().split("-")[0].toString();
			String[] productText = product.get(i).getText().split("-");

			// Trimming because product name has space before the "-"
			String productN = productText[0].trim();
			System.out.println(productN);

			Thread.sleep(1000);
			if (al.contains(productN)) {
				j++;
				// driver.findElements(By.xpath("//button[text() = 'ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				// items.lenth means length of Array
				if (j == items.length) {
					break;
				}
			}

		}
	}
}
