import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		String name = "guest111";

		for (int i = 1; i <= 2; i++) {
			driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(name + i + "@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
			Thread.sleep(4000);
			WebElement radio1 = driver.findElement(By.id("id_gender1"));
			radio1.click();
			driver.findElement(By.id("id_gender1")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("guest");
			driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("name");
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("abcde");
			Select day = new Select(driver.findElement(By.id("days")));
			day.selectByIndex(5);
			Select month = new Select(driver.findElement(By.id("months")));
			month.selectByIndex(2);
			// Thread.sleep(2000);
			Select year = new Select(driver.findElement(By.id("years")));
			year.selectByIndex(4);
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			driver.findElement(By.id("company")).sendKeys("ABC");
			driver.findElement(By.id("address1")).sendKeys("Street: 12, P.O Box: 123, ABC");
			driver.findElement(By.id("address2")).sendKeys("Apartment: 3D, Unit:3, Building: 17/C");
			driver.findElement(By.id("city")).sendKeys("Dhaka");
			Thread.sleep(5000);
			Select State = new Select(driver.findElement(By.id("id_state")));
			State.selectByVisibleText("Hawaii");
			driver.findElement(By.id("postcode")).sendKeys("25000");
			driver.findElement(By.id("other")).sendKeys("something");
			driver.findElement(By.id("phone")).sendKeys("123456");
			driver.findElement(By.id("phone_mobile")).sendKeys("1234567");
			driver.findElement(By.id("alias")).sendKeys(": Dhaka");
			driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
			Thread.sleep(5000);
		}

		for (int j = 1; j <= 2; j++) {
			driver.findElement(By.id("email")).sendKeys(name + j + "@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("abcde");
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_14\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();

			Thread.sleep(3000);
			driver.navigate().refresh();

			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
			driver.findElement(By.id("cgv")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();

			/*
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			 * Thread.sleep(2000);
			 */
			driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
	}

}
