 package pom;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.CacheLookup;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;

 public class Login {

	
 private WebDriver driver;
		
		@CacheLookup
		@FindBy(id = "email")
		WebElement email;

		@CacheLookup
		@FindBy(id = "pass")
		WebElement passwd;
		
		@CacheLookup
		@FindBy(tagName = "button")
		WebElement loginBtn;
		
		public Login(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		/**
		 * Enters the username into the username field and logs the action.
		 *
		 * @param username The username to input into the field.
		 */
		public void enterUsername(String username) {
		    
			
		    email.clear();
		    email.sendKeys(username);
		}

		/**
		 * Enters the password into the password field and logs the action.
		 *
		 * @param password The password to input into the field.
		 */
		public void enterPassword(String password) {
		    
			
		    passwd.clear();
		    passwd.sendKeys(password);
		}

		/**
		 * Clicks the login button to submit the login form.
		 */
		public void clickLoginBtn() {
		    
			loginBtn.click();
		}

		/**
		 * Performs the complete login process by entering the username and password.
		 *
		 * @param username The username to input.
		 * @param password The password to input.
		 */
		public void login(String username, String password) {
		    
			WebElement email = driver.findElement(By.id("email"));
			
			enterUsername(username);
		    enterPassword(password);
		    //clickLoginBtn(); // Uncomment to perform login
		  }
		
	 }

