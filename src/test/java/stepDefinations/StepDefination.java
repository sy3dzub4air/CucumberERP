package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	WebDriver driver;
	String Expected;
	String Actual;



	@Given("^User Navigate Url \"([^\"]*)\" in Browser$")
	public void user_Navigate_Url_in_Browser(String Url) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^user Login as \"([^\"]*)\" in username$")
	public void user_Login_as_in_username(String user) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(user);
	}

	@When("^user login as \"([^\"]*)\" in password$")
	public void user_login_as_in_password(String pass) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(pass); 
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@When("^user click pim$")
	public void user_click_pim() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^user click add button$")
	public void user_click_add_button() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^user Enter as \"([^\"]*)\" in fname$")
	public void user_Enter_as_in_fname(String fname) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("^user Enter \"([^\"]*)\" in mname$")
	public void user_Enter_in_mname(String mname) throws Throwable {
		driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("^user Enter \"([^\"]*)\" in lane$")
	public void user_Enter_in_lane(String lane) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(lane);
	}

	@When("^user Capture EID Before Adding$")
	public void user_Capture_EID_Before_Adding() throws Throwable {
		Expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
		driver.findElement(By.id("btnSave")).click();
	}

	@When("^user captures EID after adding$")
	public void user_captures_EID_after_adding() throws Throwable {
		Actual = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	}

	@Then("^User validates EID$")
	public void user_validates_EID() throws Throwable {
		if (Expected.equals(Actual)) {
			System.out.println("Employee Creation Successfull :::" +Expected+"              "+Actual);

		} else {
			System.out.println("Employee Creation Failed :::" +Expected+"              "+Actual);

		}

	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
		driver.quit();
	}



}
