package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	static WebDriver driver;

	@Parameters({ "username", "password" })
	@Test(priority = 1)
	public void searchHotel(String a, String b) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(a);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(b);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Parameters({ "location", "hotels", "room_type", "room-nos", "roomad", "roomchil" })
	@Test(priority = 2)
	public void enterDetail(String locat, String hotel, String room, String roomno, String roomad, String roomchil) {
		WebElement selLoc = driver.findElement(By.id("location"));
		Select s = new Select(selLoc);
		s.selectByVisibleText(locat);
		WebElement selHot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(selHot);
		s1.selectByVisibleText(hotel);
		WebElement selRoom = driver.findElement(By.id("room_type"));
		Select s2 = new Select(selRoom);
		s2.selectByVisibleText(room);
		WebElement noRoom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noRoom);
		s3.selectByVisibleText(roomno);
		WebElement adRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adRoom);
		s4.selectByVisibleText(roomad);
		WebElement chilRoom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(chilRoom);
		s5.selectByVisibleText(roomchil);
	}

	@Test(priority = 3)
	public void clickOk() {
		WebElement btnClick = driver.findElement(By.id("Submit"));
		btnClick.click();
		WebElement btnClick1 = driver.findElement(By.id("radiobutton_0"));
		btnClick1.click();
		WebElement btnClick2 = driver.findElement(By.id("continue"));
		btnClick2.click();

	}

	@Parameters({ "First-Name", "Last-Name", "Billing-Address", "CcNo", "CcType", "Expiry-Date", "Expiry-Year",
			"CVV-Number" })
	@Test(priority=4)
	public void searchHotel(String fstnam, String lstnam, String add, String ccno, String ccty, String ccmon,
			String ccyr, String cvvno) throws InterruptedException {
		Thread.sleep(3000);
		WebElement fstName = driver.findElement(By.id("first_name"));
		fstName.sendKeys(fstnam);
		WebElement lstName = driver.findElement(By.id("last_name"));
		lstName.sendKeys(lstnam);
		WebElement addrre = driver.findElement(By.id("address"));
		addrre.sendKeys(add);
		WebElement cno = driver.findElement(By.id("cc_num"));
		cno.sendKeys(ccno);
		WebElement cty = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cty);
		s6.selectByVisibleText(ccty);
		WebElement cmon = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(cmon);
		s7.selectByVisibleText(ccmon);
		WebElement cyr = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(cyr);
		s8.selectByVisibleText(ccyr);
		WebElement ccvv = driver.findElement(By.id("cc_cvv"));
		ccvv.sendKeys(cvvno);
		WebElement btncli = driver.findElement(By.id("book_now"));
		btncli.click();
	}

	@Parameters
	@Test(priority=5)
	public void tc5() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("order_no"));
		String d = element.getAttribute("value");
		System.out.println(d);
	}
}
