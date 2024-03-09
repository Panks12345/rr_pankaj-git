package AutomationExercise2ndProject;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyAllTestcases 
{

	public String baseurl = "https://automationexercise.com/";

	String driverpath ="C:\\Users\\PANKAJ\\Desktop\\chromedriver.exe";

	public WebDriver driver;



	@BeforeTest()

	public void launch() throws InterruptedException
	{


		System.out.println("launching chrome browser");
		System.setProperty("Webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.get(baseurl);

		driver.manage().window().maximize();

	}


	@Test()



	public void RegisterUser() throws InterruptedException
	{


		String actual = "Automation Exercise";

		String expected = driver.getTitle();

		Assert.assertEquals(actual,expected,"title does not match");


		System.out.println("title is match");

		Thread.sleep(4000);


		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");



		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pankaj");

		System.out.println("name is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("panksdoifode447@gmail.com");


		System.out.println("email is entered");


		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		System.out.println("clicked on signup button");


		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

		System.out.println("mr is clicked");



		driver.findElement(By.xpath("//input[@id='name']")).clear();


		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pankaj");
		System.out.println("name is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);


		System.out.println("email is entered");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Panks@9799");
		System.out.println("password is entered");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='days']")));

		s.selectByIndex(2);
		System.out.println("day is selected");


		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='months']")));

		s1.selectByVisibleText("March");
		System.out.println("month is selected");

		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='years']")));


		s2.selectByValue("2013");
		System.out.println("year is selected");

		driver.findElement(By.xpath("//input[@id='newsletter']")).click();

		System.out.println("signup for our news alert is selected");

		driver.findElement(By.xpath("//input[@id='optin']")).click();

		System.out.println("receive special offer for partner is selected");


		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("pankaj");

		System.out.println("First name is entered");

		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("doifode");


		System.out.println("last name is entered");


		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("tata consultancy services");

		System.out.println("company name is entered");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)");


		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("powai mumbai");

		System.out.println("address is entered");


		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("near phenoix mall powai");


		System.out.println("address 2 is entered");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)");



		Select s3 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		Thread.sleep(2000);
		s3.selectByVisibleText("India");

		System.out.println("country is entered");

		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("maharashtra");

		System.out.println("state is entered");


		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Delhi");

		System.out.println("city is entered");


		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("4000143");

		System.out.println("zipcode is entered");


		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9370379912");


		System.out.println("mobile number is entered");


		driver.findElement(By.xpath("//button[text()='Create Account']")).click();

		System.out.println("clicked on create account button");



		String actualurl = "https://automationexercise.com/account_created";

		String expurl = driver.getCurrentUrl();


		Assert.assertEquals(actualurl, expurl,"url is not match");

		System.out.println("account created url is present");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		System.out.println("clicked on continue button");


		System.out.println("login as username is visible");


	}


	@Test()

	public void loginwithcorrectemailandpassword() throws InterruptedException
	{
		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");

		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("panksdoifode447@gmail.com");

		System.out.println("Email address is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("Panks@9799");

		System.out.println("password is entered");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		System.out.println("clicked on login button");



		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		System.out.println("clicked on delete button");


		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/svg)")).click();
		System.out.println("clicked on add");

	}

	@Test()

	public  void loginuserwithincorrectemail()
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");

		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("panksdoifode1233244@gmail.com");

		System.out.println("Email address is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("Panks@10934");

		System.out.println("password is entered");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		System.out.println("clicked on login button");

		System.out.println("Your email or password is incorrect! is visible");



	}



	@Test()

	public void LogOutUser()

	{


		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");

		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("panksdoifode447@gmail.com");

		System.out.println("Email address is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("Panks@9799");

		System.out.println("password is entered");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		System.out.println("clicked on login button");


		WebElement logout =driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a)"));
		logout.click();

		System.out.println("click on log out button");






	}



	@Test()

	public void RegisterUserWithExistingMailid()
	{

		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");



		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pankaj");

		System.out.println("name is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("panksdoifode447@gmail.com");


		System.out.println("email is entered");


		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		System.out.println("clicked on signup button");

		System.out.println("Email Address already exist! is visible");




	}

	@Test()

	public void ContactUsForm() throws InterruptedException
	{


		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[8]/a")).click();

		System.out.println("clicked on contact us button");

		System.out.println("GET IN TOUCH IS VISIBLE");

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[1]/input")).sendKeys("pankaj");

		System.out.println("name is entered");

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[2]/input")).sendKeys("pankajdoifOde@gmail.com");

		System.out.println("email is entered");


		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input")).sendKeys("regarding issue");
		System.out.println("subject is entered");


		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("i have faced some issue during that that");
		System.out.println("your message is here entered");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[5]/input")).sendKeys("C:\\Users\\PANKAJ\\Desktop\\ABC\\Pankaj.jpeg");

		System.out.println("file is uploaded");

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[6]/input")).click();

		System.out.println("Clicked on submit button");

		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		alt.accept();


		System.out.println("Success! Your details have been submitted successfully.is visible");

		driver.findElement(By.xpath("//a[@class=\"btn btn-success\"]")).click();

		System.out.println("landed on home page");

	}

	@Test()

	public void VerifyTestCasePage()
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();


		System.out.println("clicked on test cases button");


		String givenurl = "https://automationexercise.com/test_cases";

		String expurl = driver.getCurrentUrl();

		Assert.assertEquals(givenurl,expurl,"url is not matched");


		System.out.println("landed on test case page successfully");

	}

	@Test()

	public void VerifyAllProductsAndProductDetailsPage()
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");


		System.out.println("landed on all products page successfully");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		System.out.println("click on first product: view product");




		String givenurl = "https://automationexercise.com/product_details/1";

		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(givenurl,actualurl ,"url is doesnot match");

		System.out.println("all details of product is displayed");

	}


	@Test()

	public void SearchProduct()

	{




		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");


		System.out.println("landed on all products page successfully");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,200)");


		WebElement locator= driver.findElement(By.xpath("/html/body/section[1]/div/input"));

		Actions act = new Actions(driver);

		act.sendKeys(locator,"Men Tshirt").build().perform();

		driver.findElement(By.xpath("//button[@id='submit_search']")).click();		


		System.out.println("all products related to search is visible");


		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,300)");




	}


	@Test()

	public void VerifySubscriptionHomePage() throws InterruptedException
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");

		Thread.sleep(3000);


		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,8000)");

		System.out.println("scroll down to footer");


		String giventext= "SUBSCRIPTION";

		String actualtext =driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();


		System.out.println("Subscription text is verified");




		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("pankajdoifode098@gmail.com");

		System.out.println("email address is entered");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='subscribe']")).click();


		System.out.println("clicked on arrow button");



		System.out.println("You have been successfully subscribed!' is visible");


	}


	@Test()

	public  void VerifySubscriptionInCartPage() throws InterruptedException
	{


		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();


		System.out.println("clicked on cart button");



		String giventext= "SUBSCRIPTION";

		String actualtext =driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();


		System.out.println("Subscription text is verified");



		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("pankajdoifode098@gmail.com");

		System.out.println("email address is entered");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='subscribe']")).click();


		System.out.println("clicked on arrow button");

		Thread.sleep(5000);

		System.out.println("You have been successfully subscribed!' is visible");


	}


	@Test()

	public void AddProductsinCart() throws InterruptedException
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");




		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,350)");

		Actions act = new Actions (driver);

		act.moveToElement(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a)"))).build().perform();

		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		System.out.println("clicked on continue shopping button");



		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,250)");


		Actions act1 = new Actions (driver);

		act.moveToElement(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a"))).build().perform();

		driver.findElement(By.xpath("//u[text()='View Cart']")).click();

		System.out.println("clicked on view cart button");

		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,200)");


		System.out.println("both products are added to cart");
		System.out.println("verified price,quantity");


	}


	@Test()

	public void RemoveProductCart() throws InterruptedException
	{



		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");


		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")).click();

		System.out.println("product add to the cart");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//u[text()='View Cart']")).click();


		System.out.println("clicked on view cart button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart_quantity_delete\"]")).click();

		System.out.println("clicked on cancel button");


		System.out.println("product is removed from cart succesfully");


	}

	@Test()

	public void ViewandCartBrandProducts()
	{






		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");




		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,800)");



		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/div/ul/li[1]/a)")).click();

		System.out.println("clicked on polo brand");


		String givenurl = "https://automationexercise.com/brand_products/Polo";

		String actualurl = driver.getCurrentUrl();


		System.out.println("User is nevigated to brand page and products are displayed");



		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,800)");


		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/a)")).click();



		System.out.println("clicked on HandM brand");

		String Givenurl ="https://automationexercise.com/brand_products/H&M";

		String actualurl1 = driver.getCurrentUrl();

		System.out.println("User is nevigated on brand page and see the products");


	}


	@Test()

	public void SearchProductsandVerifyCartAfterLogin()
	{



		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");



		System.out.println("user is nevigated to all products page successfully");



		WebElement locator= driver.findElement(By.xpath("/html/body/section[1]/div/input"));

		Actions act = new Actions(driver);

		act.sendKeys(locator,"Men Tshirt").build().perform();

		driver.findElement(By.xpath("//button[@id='submit_search']")).click();		


		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a)")).click();

		System.out.println("products added in cart");




		driver.findElement(By.xpath("//u[text()='View Cart']")).click();

		System.out.println("clicked on view cart button");

		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");



		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("panksdoifode447@gmail.com");

		System.out.println("Email address is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("Panks@9799");

		System.out.println("password is entered");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		System.out.println("clicked on login button");



		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();


		System.out.println("clicked on cart button");



		System.out.println("those products are visible in cart after login as well");


	}





	@Test()

	public void AddReviewOnProduct()
	{

		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();


		System.out.println("clicked on products button");



		System.out.println("user is nevigated to all products page successfully");



		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,500)");


		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a)")).click();
		System.out.println("Clicked on view product button");



		System.out.println("Write Your Review' is visible");

		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,800)");


		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pankaj");

		System.out.println("name is entered");



		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("panksdoifode678@gmail.com");


		System.out.println("email is entered");

		driver.findElement(By.xpath("//textarea[@id='review']")).sendKeys("awsome product");
		System.out.println("review is write");

		driver.findElement(By.xpath("//button[@id='button-review']")).click();

		System.out.println("clicked on submit button ");

		System.out.println("Thank you for your review Message displayed");



	}

	@Test()

	public void AddToCartFromRecomendedProducts() throws InterruptedException

	{



		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,7500)");


		System.out.println("RECOMENDED ITEMS are visible");

		driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")).click();


		System.out.println("Clicked on Recomended items product");



		Thread.sleep(3000);

		driver.findElement(By.xpath("//u[text()='View Cart']")).click();


		System.out.println("clicked on view cart button");


		System.out.println("product is displayed in view cart ");


	}



	@Test()

	public void VerifyScroolUpUsingArrowButtonAndScroolDown() throws InterruptedException
	{


		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");



		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,8300)");



		String giventext= "SUBSCRIPTION";

		String actualtext =driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();


		System.out.println("Subscription text is verified");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='scrollUp']")).click();





		System.out.println("page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen");



	}


	@Test()

	public void VerifyScrollUpWithoutArrowButton()
	{


		String actualtitle = "Automation Exercise";


		String exptitle = driver.getTitle();


		Assert.assertEquals(actualtitle,exptitle,"title does not match");


		System.out.println("home page is visible successsfully");



		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,8300)");



		String giventext= "SUBSCRIPTION";

		String actualtext =driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();


		System.out.println("Subscription text is verified");


		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,-8300)");




		System.out.println("page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen");

	}



	@Test()

	public void VerifyAddressDetailsInCheckoutPage() throws InterruptedException
	{





		String actual = "Automation Exercise";

		String expected = driver.getTitle();

		Assert.assertEquals(actual,expected,"title does not match");


		System.out.println("title is match");

		Thread.sleep(4000);


		WebElement signup =	driver.findElement(By.xpath("//a[@href='/login']"));

		signup.click();

		System.out.println("click on signup/login button");



		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("panks");

		System.out.println("name is entered");


		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("pankajsahebdoifode2200@gmail.com");


		System.out.println("email is entered");


		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		System.out.println("clicked on signup button");


		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

		System.out.println("mr is clicked");



		driver.findElement(By.xpath("//input[@id='name']")).clear();


		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pankaj");
		System.out.println("name is entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);


		System.out.println("email is entered");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Panks@9799");
		System.out.println("password is entered");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='days']")));

		s.selectByIndex(2);
		System.out.println("day is selected");


		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='months']")));

		s1.selectByVisibleText("March");
		System.out.println("month is selected");

		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='years']")));


		s2.selectByValue("2013");
		System.out.println("year is selected");

		driver.findElement(By.xpath("//input[@id='newsletter']")).click();

		System.out.println("signup for our news alert is selected");

		driver.findElement(By.xpath("//input[@id='optin']")).click();

		System.out.println("receive special offer for partner is selected");


		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("pankaj");

		System.out.println("First name is entered");

		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("doifode");


		System.out.println("last name is entered");


		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("tata consultancy services");

		System.out.println("company name is entered");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)");


		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("powai mumbai");

		System.out.println("address is entered");


		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("near phenoix mall powai");


		System.out.println("address 2 is entered");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)");



		Select s3 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		Thread.sleep(2000);
		s3.selectByVisibleText("India");

		System.out.println("country is entered");

		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("maharashtra");

		System.out.println("state is entered");


		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Delhi");

		System.out.println("city is entered");


		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("4000143");

		System.out.println("zipcode is entered");


		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9370379912");


		System.out.println("mobile number is entered");


		driver.findElement(By.xpath("//button[text()='Create Account']")).click();

		System.out.println("clicked on create account button");



		String actualurl = "https://automationexercise.com/account_created";

		String expurl = driver.getCurrentUrl();


		Assert.assertEquals(actualurl, expurl,"url is not match");

		System.out.println("account created url is present");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		System.out.println("clicked on continue button");


		System.out.println("login as username is visible");



		JavascriptExecutor js09 = (JavascriptExecutor) driver;
		js09.executeScript("window.scrollBy(0,250)");



		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a)")).click();

		System.out.println("clicked on add to cart button");

		driver.findElement(By.xpath("//u[text()='View Cart']")).click();


		Thread.sleep(4000);



		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();



		System.out.println("delivery address is same address filled at the time registration of account");


		System.out.println(" billing address is same address filled at the time registration of account");



		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a)")).click();

		System.out.println("clicked on delete account button");


		System.out.println("account deleted verified");


		driver.findElement(By.xpath("//*[@id='form']/div/div/div/div/a)")).click();

		System.out.println("clicked on continue button");

	}

	@AfterTest()

	public void close() throws InterruptedException
	{
		Thread.sleep(3000);

		driver.quit();

	}

























































































































}



