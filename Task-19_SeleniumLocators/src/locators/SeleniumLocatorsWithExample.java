package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsWithExample {
	
	public static void main(String[] args) {
	
		//initalize the webdriver;
		WebDriver driver = new ChromeDriver();
		
		//navigate to guvilogin
		driver.navigate().to("https://www.guvi.in/register");
		
		//Here are possible locators Email Field

		//ID:'email'

		 
		  WebElement emailField = driver.findElement(By.id("email"));
		  emailField.sendKeys("example@example.com");
	

		//ClassName: 'form-control'

		  WebElement emailField1 = driver.findElement(By.className("form-control"));
		  emailField.sendKeys("example@example.com");
		

		//TagName: 'input'

		
		  WebElement emailField2 = driver.findElement(By.tagName("input"));
		  emailField.sendKeys("example@example.com");
	

		//CSS Selector: 'input#email'

	
		  WebElement emailField3 = driver.findElement(By.cssSelector("input#email"));
		  emailField.sendKeys("example@example.com");
	

		//XPath: 'input[@id='email']'

		
		  WebElement emailField4 = driver.findElement(By.xpath("//input[@id='email']"));
		  emailField.sendKeys("example@example.com");


		// Here are possible locators for Mobile Number Field

		//ID: 'mobile'
		  

		  WebElement mobileField = driver.findElement(By.id("mobile"));
		  mobileField.sendKeys("1234567890");
	

		//CSS Selector: 'input#mobile'
	
		  WebElement mobileField1 = driver.findElement(By.cssSelector("input#mobile"));
		  mobileField.sendKeys("1234567890");
		 

		//XPath: '//input[@id='mobile''

		 
		  WebElement mobileField2 = driver.findElement(By.xpath("//input[@id='mobile']"));
		  mobileField.sendKeys("1234567890");
		  

		// Here are the possible locators for Password Field

		//ID: 'password'

	
		  WebElement passwordField = driver.findElement(By.id("password"));
		  passwordField.sendKeys("password123");
	

		//CSS Selector: 'input#password'
		  
		
		  WebElement passwordField1 = driver.findElement(By.cssSelector("input#password"));
		  passwordField.sendKeys("password123");
		

		//XPath: '//input[@id='password']'

		 
		  WebElement passwordField2 = driver.findElement(By.xpath("//input[@id='password']"));
		  passwordField.sendKeys("password123");
		 
		// Here are possible locators for Full Name Field

		//ID: 'name'
		  
		
		  WebElement nameField = driver.findElement(By.id("name"));
		  nameField.sendKeys("John Doe");
	
		  
		//CSS Selector: 'input#name'
		  
		
		  WebElement nameField1 = driver.findElement(By.cssSelector("input#name"));
		  nameField.sendKeys("John Doe");
		

		//XPath: '//input[@id='name'

		
		  WebElement nameField2 = driver.findElement(By.xpath("//input[@id='name']"));
		  nameField.sendKeys("John Doe");
		 

		// 5. Checkbox for Terms and Conditions

		//ID: 'terms'
		  
		
		  WebElement termsCheckbox = driver.findElement(By.id("terms"));
		  termsCheckbox.click();
		 

		//CSS Selector: 'input#terms'
		  
	
		  WebElement termsCheckbox1 = driver.findElement(By.cssSelector("input#terms"));
		  termsCheckbox.click();
		

		//XPath: '//input[@id='terms'

		 
		  WebElement termsCheckbox3 = driver.findElement(By.xpath("//input[@id='terms']"));
		  termsCheckbox.click();
		

		//6. Here are possible locators for Register Button

		// ClassName: 'btn-primary'

		 
		  WebElement registerButton = driver.findElement(By.className("btn-primary"));
		  registerButton.click();
		 

		//CSS Selector:'button.btn.btn-primary.btn-block'
		  
		
		  WebElement registerButton1 = driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block"));
		  registerButton.click();
		 

		//XPath:
		  
	
		  WebElement registerButton2 = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and text()='Register']"));
		  registerButton.click();
		

		// Here are possible locators for Login Link (for already registered users)

		//ClassName:'btn-link'
		 
	
		  WebElement loginLink = driver.findElement(By.className("btn-link"));
		  loginLink.click();
		

		//CSS Selector:'a.btn-link'

		 
		  WebElement loginLink1 = driver.findElement(By.cssSelector("a.btn-link"));
		  loginLink.click();
	

		//XPath:

		
		  WebElement loginLink2 = driver.findElement(By.xpath("//a[contains(@class, 'btn-link') and text()='Login']"));
		  loginLink.click();
		 

		// Here are posible locators for Google Sign-Up Button

		//ClassName: 'google-signin-button'
		  
		
		  WebElement googleButton = driver.findElement(By.className("google-signin-button"));
		  googleButton.click();
		

		//CSS Selector: 'button.google-signin-button'
		 
		 
		  WebElement googleButton1 = driver.findElement(By.cssSelector("button.google-signin-button"));
		  googleButton.click();
		 

		//XPath:
		  
		
		  WebElement googleButton2 = driver.findElement(By.xpath("//button[contains(@class, 'google-signin-button')]"));
		  googleButton.click();

	
          driver.quit();  	
	
	
	}
	

}
