//Write down the following test in the ‘LoginTest’ class
//1. userSholdLoginSuccessfullyWithValidCredentials()
//* Enter “Admin” username
//* Enter “admin123 password
//* Click on the ‘Login’ button
//* Verify the ‘Dashboard’ text is displayed
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

  String baseURL = "https://opensource-demo.orangehrmlive.com/";


  @Before
          public void setup ( ) {
      openBrowser(baseURL);
  }

  @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
      driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
      driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
      String expectedText = "Dashboard";
      WebElement dashboard = driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]"));
      String actualText = dashboard.getText();
      Assert.assertEquals("Dashboard ot displayed", actualText, expectedText);


  }
  @After
    public void teardown(){
     // driver.quit();
  }
}
