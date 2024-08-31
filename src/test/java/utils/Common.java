package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

	private WebDriver driver;

	/**
	 * Sets up the browser specified and navigates to the given URL.
	 *
	 * This method initializes the WebDriver based on the provided browser type and 
	 * opens the specified URL. If an unsupported browser is provided, the automation 
	 * run will terminate.
	 *
	 * @param browser The type of browser to launch (e.g., "chrome", "firefox", "edge").
	 * @param url The URL to navigate to after the browser is opened; opens "about:blank" if empty.
	 */
	public void setupBrowser(String browser, String url) {
	    // Opening the browser
	    if (browser.equalsIgnoreCase("chrome"))
	        driver = new ChromeDriver();
	    else if (browser.equalsIgnoreCase("firefox"))
	        driver = new FirefoxDriver();
	    else if (browser.equalsIgnoreCase("edge"))
	        driver = new EdgeDriver();
	    else {
	        System.out.println("Valid browser was not provided, hence quitting the automation run");
	        System.exit(0);
	    }

	    // Maximize the browser
	    // driver.manage().window().maximize();
	    
	    // Opening the URL
	    if (!url.isEmpty())
	        driver.get(url);
	    else
	        driver.get("about:blank");
	}

	/**
	 * Returns the current WebDriver instance.
	 *
	 * @return The WebDriver instance managing the browser.
	 */
	public WebDriver getBrowserDriver() {
	    return driver;
	}

	/**
	 * Closes the current browser tab.
	 */
	public void closeTab() {
	    driver.close();
	}

	/**
	 * Quits the browser and terminates the WebDriver session.
	 */
	public void quitBrowser() {
	    driver.quit();
	}
	

}
