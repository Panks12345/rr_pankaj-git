import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLogFunctionality  
{





	public String baseurl ="https://www.saucedemo.com/";

	String driverpath = "C:\\Users\\PANKAJ\\Desktop\\ABC\\chromedriver.exe";

	public WebDriver driver;



	@BeforeTest()

	public void launch()
	{


		System.out.println("launching chrome browser");
		System.setProperty("Webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.get(baseurl);

		driver.manage().window().maximize();




	}


	@Test(priority=1)

	public void verifyloginApplication()

	{


		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		System.out.println("email is entered");




		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		System.out.println("password is entered");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("login button clicked");

		String giventitle = "Swag Labs";

		String actualtitle = driver.getTitle();

		Assert.assertEquals(giventitle,actualtitle,"title does not match");

	}


	@Test(enabled = false)

	public void Verifylogoutfunctionality() throws InterruptedException
	{


		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

		System.out.println("click on button");

		Thread.sleep(4000);


		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

		System.out.println("click on logout button");

	}

	@Test(enabled=false)



	public void verifyaddtocartfunctionality() throws InterruptedException 
	{

		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

		System.out.println("click on add to cart");
		Thread.sleep(4000);



		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();



		String givenurl = "https://www.saucedemo.com/cart.html";

		String Actualurl = driver.getCurrentUrl();


		Assert.assertEquals(givenurl,Actualurl,"url doesnot match");

	}

	@Test(enabled = false)


	public void removeproductaddtocart()
	{

		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();

		System.out.println("product is removed");

	}

	@Test(enabled=false)

	public void addedproductCheckoutPresent()
	{

		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		System.out.println("click on checkout button");


		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("pankaj");

		System.out.println("first name is entered");


		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("doifode");


		System.out.println("last name is entered");


		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("443283");


		System.out.println("postal code is entered");


		driver.findElement(By.xpath("//input[@id='continue']")).click();

		System.out.println("click on continue button");


		System.out.println("added product is displayed");





	}	


	@Test(enabled= false)


	public void addedproductordersucessful()
	{


		driver.findElement(By.xpath("//button[@id='finish']")).click();


		System.out.println("click on finish button");


		String givenurl = "https://www.saucedemo.com/checkout-complete.html";

		String expectedurl = driver.getCurrentUrl();

		Assert.assertEquals(givenurl, expectedurl,"url does not match");


		System.out.println("Thank you for your order!");




	}


	@Test(enabled=false)

	public void canceltheorderproduct()

	{


		driver.findElement(By.xpath("//button[@id='cancel']")).click();

		System.out.println("product not ordered");
	}


	@Test(enabled=false)

	public void loginByInvalidUsername()
	{

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user12");

		System.out.println("email is entered");




		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		System.out.println("password is entered");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("login button clicked");


		System.out.println("username and password do not match error message display");


	}

	@Test(enabled = false)

	public void LoginApplicationByInvalidPassword()
	{


		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		System.out.println("email is entered");




		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce12");
		System.out.println("password is entered");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("login button clicked");


		System.out.println("username and password do not match error message display");


	}


	@Test(enabled=false)



	public void CheckoutpageClickContinueWithoutSendAllInformation()

	{
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		System.out.println("click on checkout button");


		driver.findElement(By.xpath("//input[@id='continue']")).click();

		System.out.println("click on continue button");


		System.out.println("error message should be shown");

	}

	@Test(enabled=false)

	public void ByClickProductAddtoCart() throws InterruptedException

	{


		driver.findElement(By.xpath("//div[@class='inventory_item_name ']")).click();

		System.out.println("click on the product");



		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

		System.out.println("click on add to cart");

		System.out.println("product should added in cart");

	}


	@Test(enabled=false)


	public void removeaddedproduct() throws InterruptedException
	{


		Thread.sleep(3000);



		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();

		System.out.println("product is removed");


	}

	@Test(enabled=false)

	public void LoginWithDifferentUsername()
	{

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");

		System.out.println("username is entered");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");


		System.out.println("password is entered");


		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		System.out.println("click on login button");

	}


	@Test(enabled=false)

	public void LoginWithDifferentUsername1()
	{

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");

		System.out.println("username is entered");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");


		System.out.println("password is entered");


		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		System.out.println("click on login button");

	}



	@Test(enabled =false)

	public void LinkPresentOnPage()
	{


		List<WebElement> pankaj = driver.findElements(By.tagName("a"));


		for(WebElement panks : pankaj) 
		{

			String text =	panks.getText();

			System.out.println(text);

		}






	}


	@Test(priority=2)

	public void SelectdropdownZtoA()
	{

		Select s = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));


		s.selectByValue("za");


	}


	@Test(priority=3)

	public void SelectValueLowToHigh() throws InterruptedException
	{
		Thread.sleep(4000);
		Select s = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));


		s.selectByValue("lohi");


	}

	@Test(priority=4)

	public void SelectValueHighToLow() throws InterruptedException

	{

		Thread.sleep(5000);


		Select s = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));


		s.selectByValue("hilo");

	}


	@Test(priority=5)

	public void AddMultipleProductToCart() throws InterruptedException
	{
		Thread.sleep(3000);

		List<WebElement> allproducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));


		for(WebElement allproduct : allproducts) {


			allproduct.click();



		}








	}



	@Test(priority=6)

	public void AllProductsCheckOut() throws InterruptedException
	{


		driver.findElement(By.className("shopping_cart_link")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='checkout']")).click();









	}



	@Test(priority=7)

	public void OrderallTheProducts() throws InterruptedException
	{


		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("pankaj");

		System.out.println("first name is entered");


		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("doifode");


		System.out.println("last name is entered");


		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("443283");


		System.out.println("postal code is entered");


		driver.findElement(By.xpath("//input[@id='continue']")).click();

		System.out.println("click on continue button");


		System.out.println("added product is displayed");


		Thread.sleep(3000);


		driver.findElement(By.xpath("//button[@id='finish']")).click();

		System.out.println("thank you for your order message displayed");

	}



	@Test(enabled=false)

	public void RemoveOneproductFromAllSelectedProduct()
	{



		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();


		System.out.println("one product removed");



	}



	@AfterTest()

	public void close() throws InterruptedException
	{
		Thread.sleep(3000);

		driver.close();

	}














































































































































}
