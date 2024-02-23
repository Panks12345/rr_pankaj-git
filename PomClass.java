import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{

	public WebDriver driver;


	@FindBy(xpath ="//input[@id='user-name']")

	WebElement username;

	@FindBy(xpath ="//input[@id=\'password\']")

	WebElement password;


	@FindBy(xpath ="//input[@id='login-button']")

	WebElement loginbtn;


	public void sendusername()
	{

		username.sendKeys("standard_user");


	}


	public void sendpassword()
	{

		password.sendKeys("secret_sauce");
	}
	public void ClickLoginBtn() {

		loginbtn.click();


	}


	public PomClass (WebDriver driver) {


		this.driver= driver;


		PageFactory.initElements(driver,this);


	}
















}
