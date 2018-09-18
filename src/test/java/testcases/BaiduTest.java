package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BaiduTest {
  @Test
  public void f() {
		//chrome
		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//�������
		dr.manage().window().maximize();
		dr.get("https://www.baidu.com");
		System.out.println("The title is:"+dr.getTitle());
		System.out.println("Current URL is:"+dr.getCurrentUrl());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(dr.getTitle().contains("百度"), true);
		dr.quit();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
