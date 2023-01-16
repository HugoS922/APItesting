package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Steps {

    @Before
    public void setup (Scenario scenario){
        System.out.println("::::::::::::::::::::");
        System.out.println("Scenario name: " + scenario.getName());
        System.out.println("Scenario name: " + scenario.getSourceTagNames());
        System.out.println("::::::::::::::::::::");

    }

    @Given("The user is on Login page")
    public void the_user_is_on_login_page() {
        WebDriver driver = null;
        String baseUrl = "https://test-api.k6.io/";
        System.out.println("::::::::::::::::::::");
        System.out.println("inside step - open browser");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.navigate().to(baseUrl + "auth/basic/login/");
    }

    @When("The user enters a username {string}")
    public void the_user_enters_a_username(String string) {
        System.out.println("the user ID is ::" + string);
    }

    @And("the user enters a password {string}")
    public void the_user_enters_a_password(String string) {
        System.out.println("the user password is ::" + string);
    }

    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void teardown (){
        System.out.println("::::::::::::::::::::");
    }
}
