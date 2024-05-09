import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class FormFill {

	@SuppressWarnings("deprecation")
	@Test
	public void formfill () throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Desktop\\All drivers for selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		// 1st name and last name
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		WebElement ln = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));

		if (fn.isDisplayed() && fn.isEnabled() == true) {
			fn.sendKeys("Sagor");
		}
		Thread.sleep(1000);
		if (ln.isDisplayed() && ln.isEnabled() == true) {
			ln.sendKeys("Saha");
		}
		Thread.sleep(1000);

		/*
		 * driver.switchTo().frame(0); WebElement add = driver.findElement(By.xpath(
		 * "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")); Actions resize = new
		 * Actions(driver); resize.moveToElement(add).dragAndDropBy(add, 50,
		 * 50).build().perform(); Thread.sleep(2000);
		 */

		// address
		WebElement add = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		if (add.isDisplayed() && add.isEnabled() == true) {
			add.sendKeys("Huay Tower, MarkZukarbag");
		}
		Thread.sleep(1000);

		// email
		WebElement em = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		if (em.isDisplayed() && em.isEnabled() == true) {
			em.sendKeys("sagor@gmail.com");
		}
		Thread.sleep(1000);

		// phonenumber
		WebElement pn = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		if (pn.isDisplayed() && pn.isEnabled() == true) {
			pn.sendKeys("01811111111");
		}
		Thread.sleep(1000);

		// gender
		WebElement ma = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		if (ma.isEnabled() == true && ma.isSelected() == false) {
			ma.click();
		}
		Thread.sleep(1000);

		// hobbies
		WebElement h1 = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		if (h1.isEnabled() == true && h1.isSelected() == false) {
			h1.click();
		}
		WebElement h2 = driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		if (h2.isEnabled() == true && h2.isSelected() == false) {
			h2.click();
		}
		WebElement h3 = driver.findElement(By.xpath("//*[@id=\"checkbox3\"]"));
		if (h3.isEnabled() == true && h3.isSelected() == false) {
			h3.click();
		}
		Thread.sleep(1000);

		// language
		WebElement lan = driver.findElement(By.id("msdd"));
		lan.click();
		WebElement lan1 = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]"));
		lan1.click();
		Thread.sleep(1000);
		WebElement lan2 = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]"));
		lan2.click();
		Thread.sleep(1000);
		WebElement lan3 = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[40]"));
		lan3.click();
		Thread.sleep(1000);

		// skill
		Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		skill.selectByVisibleText("Java");
		Thread.sleep(1000);
		

		// country
		WebElement country = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]"));
		country.click();
		Thread.sleep(500);
		WebElement country1 = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[3]"));
		country1.click();
		Thread.sleep(1000);

		// date of birth
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		year.selectByVisibleText("2000");
		Thread.sleep(1000);
		Select month = new Select(
				driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		month.selectByVisibleText("April");
		Thread.sleep(1000);
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		day.selectByVisibleText("29");
		Thread.sleep(1000);

		// password
		WebElement pa = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		if (pa.isDisplayed() && pa.isEnabled() == true) {
			pa.sendKeys("sagor111");
		}
		Thread.sleep(1000);

		// confirm password
		WebElement cp = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		if (cp.isDisplayed() && cp.isEnabled() == true) {
			cp.sendKeys("sagor111");
		}
		Thread.sleep(1000);
		
		// upload image 
		WebElement ui = driver.findElement(By.xpath("//*[@id=\'imagesrc\']"));
		ui.sendKeys("C:\\Users\\USER\\Desktop\\upload using sikuli automation\\image\\flower.jpg");
		Thread.sleep(1000);
		
		//submit_button
		WebElement sub = driver.findElement(By.id("submitbtn"));
		sub.click();
		
		/* upload image using sikuli
		 String imagepath = "C:\\Users\\USER\\Desktop\\upload using sikuli
		 automation\\";
		 String inputimagepath = "C:\\Users\\USER\\Desktop\\upload using sikuli
	     automation\\image\\";
		 Screen s = new Screen();
		 Pattern textbox = new Pattern(imagepath + "1.PNG");
		 Pattern open = new Pattern(imagepath + "op.PNG");
		 s.wait(textbox, 20);
		 s.type(textbox, inputimagepath + "flower.jpg");
		 s.click(open);*/

	}

}
