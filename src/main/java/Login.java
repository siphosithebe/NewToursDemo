import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main (String[] args){

    System.setProperty("webdriver.chrome.driver","C:\\Users\\ssithebe\\Desktop\\IntelijSession\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    String Test_Results ="";

    driver.get("rirrirrrirritititittiii");

    driver.findElement(By.xpath("//a[ciontains(text(),'SIGN-ON')]")).click();

    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

    driver.findElement(By.xpath("//input[@name='submit']")).click();

  if(driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed())
  {
      Test_Results = "PASSED";
  }else
      Test_Results ="FAILED";

System.out.println(Test_Results);

driver.close();
}
}