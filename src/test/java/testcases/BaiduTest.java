package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaiduTest {
  @Test
  public void f() {
		//chrome
		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//自动化窗口
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
  @Test(enabled=false)
  public void ignore() {
	  System.out.println("ignore");
  }
  @Test(dependsOnMethods= {"f"})
  public void depends() {
	  System.out.println("depends");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
