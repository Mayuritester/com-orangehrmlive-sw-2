package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup (){
        openBrowser(baseURL);
    }

    @Test
public void userShouldNavigateToForgotPasswordPageSuccessfully(){
    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")).click();
    String expectedText = "Reset Password";
        WebElement resetPassword = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]"));
        String actualText = resetPassword.getText();
        Assert.assertEquals("Test not displayed", actualText, expectedText);

    }

    @After
    public void teardown(){
        //driver.quit();
    }
}
