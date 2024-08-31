 
 package com.edureka.cucumber_project1;

 import io.cucumber.java.After;
 import io.cucumber.java.Before;
 import io.cucumber.java.en.Given;
 import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;
 import pom.Login;
 import utils.Common;

 import static org.testng.Assert.assertTrue;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.Assert;

 public class StepDefinitions {
	 
	 String browser = "chrome";
	 String url = "https://www.facebook.com";
	 Common common;
	 WebDriver driver;
	 
	  @Before
	  public void setup() {
		
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getBrowserDriver();
		
	  }

		@After
		public void tearDown() {
			driver.quit();
		}
		
		@Given("I am on the login page")
		public void navToLogin() {
			
			driver.navigate().to(url);
		}
       
		/*
		@When("The page title should be dispalyed")
		public void pageTitleValidation() {
			
			String expectedResult = "Facebook – log in or sign up";
			String actualResult = driver.getTitle();
		    assertTrue(actualResult.equals(expectedResult), "Mismatch in the page title");
		}
		
		@Then("The URL should be displayed")
		public void urlValidation() {
			
			String expectedResult = "https://www.facebook.com/ramesh";
			String actualResult = driver.getCurrentUrl();
			assertTrue(actualResult.equals(expectedResult), "Mismatch in the login page URL");
		}*/
		
		
		
		@When("I enter username as {string} and password as {string}")
		public void login(String username, String password) {
		    
			Login obj = new Login(driver);
		    obj.login(username, password);
		}
		
		@Then("I should successfully be logged in")
		public void successfulLogin() {
		    System.out.println("Logged in successfully");
		}
		
		@Then("Login error message should be displayed")
		public void unsuccessfulLogin() {
		    System.out.println("Login error message is displayed successfully");
		}

       /*@Given("I am on the Facebook login page")
	   
       public void i_am_on_the_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	  @Then("The page title should be dispalyed")
	  
	    public void the_page_title_should_be_dispalyed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	    @Given("I am on the login page")
	   public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	  }

	    @Then("The URL should be displayed")
	    public void the_url_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	    
	  }*/
	    
 }
	
   
