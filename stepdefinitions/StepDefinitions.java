package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class StepDefinitions {
    WebDriver driver;

    @Given("^User Open the browser and Enter Url$")
    public void user_Open_the_browser_and_Enter_Url()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

   }

    @Then("^User  click on register button$")
    public void user_click_on_register_button()  {
        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^User enter  FirstName$")
    public void user_enter_FirstName()  {
        driver.findElement(By.id("FirstName")).sendKeys("Manisha");
    }

    @Then("^User  enter LastName$")
    public void user_enter_LastName()  {
        driver.findElement(By.id("LastName")).sendKeys("Patel");

    }

    @Then("^User enter Date of birth$")
    public void user_enter_Date_of_birth()  {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("13");

    }

    @Then("^User enter Month of birth$")
    public void user_enter_Month_of_birth()  {
          driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");

    }

    @Then("^User enter year of birth$")
    public void user_enter_year_of_birth()  {
         driver.findElement(By.name("DateOfBirthYear")).sendKeys("2000");

    }

    @Then("^User enter email$")
    public void user_enter_email()  {
        driver.findElement(By.id("Email")).sendKeys("nisha.patel16@gmail.com");

    }

    @Then("^User enter password$")
    public void user_enter_password()  {
        driver.findElement(By.id("Password")).sendKeys("123456");

    }

    @Then("^User enter ConfirmPassword$")
    public void user_enter_ConfirmPassword() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");


    }

    @Then("^User Click on register$")
    public void user_Click_on_register()  {
        driver.findElement(By.id("register-button")).click();

    }

    @Then("^User is on HomePage$")
    public void user_is_on_HomePage()  {

    }



}






