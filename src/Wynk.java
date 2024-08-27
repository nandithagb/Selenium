
package Selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wynk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://wynk.in/music");
		driver.manage().window().maximize();
		//login button click
//		
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//          // Wait for the element to be visible and clickable
//          WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.hover\\:opacity-60.cursor-pointer.flex")));
//
//          // Click the login button
//          loginButton.click();
//          System.out.println("Login button clicked.");
//          
//          
//          // mobile number eneterd
//          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//          // Wait for the input field to be visible
//          WebElement mobileInput = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phone'][data-testid='loginInputNumber']")));
//
//          // Clear any existing value in the input field
//          mobileInput.clear();
//
//          // Enter the mobile number
//          String mobileNumber = "6363735487"; // Replace with the mobile number you want to enter
//          mobileInput.sendKeys(mobileNumber);
//
//          System.out.println("Mobile number entered: " + mobileNumber);
//          
//          
//          // send otp click button
//          
//          WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//          // Wait for the button to be clickable
//          WebElement sendOtpButton = wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='loginSendOtpButton']")));
//
//          // Click the button
//          sendOtpButton.click();
//          System.out.println("Send OTP button clicked.");
//          
//          
//          
//          // taking otp from the console
//          
//          
//          WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//          // Wait for the input field to be visible
//          WebElement otpInputField = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phone'][data-testid='loginInputOtp']")));
//
//          // Read the OTP from the console
//          Scanner scanner = new Scanner(System.in);
//          System.out.print("Enter OTP: ");
//          String otp = scanner.nextLine();
//
//          // Enter the OTP into the input field
//          otpInputField.clear(); // Clear any existing value
//          otpInputField.sendKeys(otp);
//
//          // Retrieve and print the value from the input field
//          String enteredOtp = otpInputField.getAttribute("value");
//          System.out.println("Entered OTP: " + enteredOtp);
          
          
          
          
          
//         // click on 3 bars
//          
//          WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//          // Wait for the button to be clickable using an appropriate CSS selector
//          WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("headlessui-popover-button-:Rv696:")));
//
//          // Click the button
//          button.click();
//
//          System.out.println("Button clicked.");
//          
          
          
          // select trending songs
          
          WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Wait for the "Trending Now" link to be clickable
          WebElement trendingNowLink = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Trending Now']")));

          // Click the "Trending Now" link
          trendingNowLink.click();

          // Optional: Wait to ensure the navigation is complete
          // Add a wait or check here to confirm that the navigation happened as expected

          System.out.println("Clicked on 'Trending Now' link and navigated to the URL.");
          
          // play trending songs

          WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Wait for the button to be clickable using XPath
          WebElement button = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[3]/section/div/div[1]/div[2]/div[2]/div[1]/button[1]")));

          // Click the button
          button.click();

          System.out.println("Button clicked successfully.");
          
          
         // stop the songgg
          
          
          
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the button using XPath
          WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[3]/div[1]/div[3]/div[2]/button")));

          // Click the button
          button1.click();
          System.out.println("stop button");
          
          
          
          // 3 dots
      // old songs
          
          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the element using XPath
          WebElement element = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='__next']/header/section[2]/div/div/div[3]/a")));

          // Click the element
          element.click();
          
          
          
          // old list songg
          WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the image element using XPath
          WebElement imageElement = wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='__next']/div[4]/section/div/div[1]/div[1]/a/div[1]/span/span/img")));

          // Click the image element
          imageElement.click();
   
          
          //stop old song
          
          WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the link element using XPath
          WebElement linkElement = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/header/section[2]/div/div/div[4]/a")));

          // Click the link element
          linkElement.click();
          
          
          // top artist
          
          WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the link element using XPath
          WebElement linkElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/header/section[2]/div/div/div[7]/a")));

          // Click the link element
          linkElement1.click();

          
          // click on this image 
          
          
          WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));

          // Locate the image element using XPath
          WebElement imageElement13= wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[4]/section/div/div[1]/div[1]/a/div[1]/span/span/img")));

          // Click the image element
          imageElement13.click();

          
          
          
          // button click 3 bottons
          
          WebDriverWait waitii = new WebDriverWait(driver, Duration.ofSeconds(20));
          
//            // Wait for the element to be visible and clickable
     WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.hover\\:opacity-60.cursor-pointer.flex")));
          
//                    // Click the login button
                   loginButton.click();
                   System.out.println("Login button clicked.");
//                    
//                    
//                    // mobile number eneterd
                   WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(20));
          //
//                    // Wait for the input field to be visible
                    WebElement mobileInput = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phone'][data-testid='loginInputNumber']")));
          //
//                    // Clear any existing value in the input field
                    mobileInput.clear();
          //
//                    // Enter the mobile number
                    String mobileNumber = "6363735487"; // Replace with the mobile number you want to enter
                    mobileInput.sendKeys(mobileNumber);
          //
                    System.out.println("Mobile number entered: " + mobileNumber);
//                    
//                    
//                    // send otp click button
//                    
                    WebDriverWait wait31 = new WebDriverWait(driver, Duration.ofSeconds(20));
          //
//                    // Wait for the button to be clickable
                    WebElement sendOtpButton = wait31.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='loginSendOtpButton']")));
          //
//                    // Click the button
                    sendOtpButton.click();
                   System.out.println("Send OTP button clicked.");
//                    
//                    
//                    
//                    // taking otp from the console
//                    
//                    
                   WebDriverWait wait41 = new WebDriverWait(driver, Duration.ofSeconds(20));
          //
//                    // Wait for the input field to be visible
                    WebElement otpInputField = wait41.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phone'][data-testid='loginInputOtp']")));
          //
//                    // Read the OTP from the console
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter OTP: ");
                    String otp = scanner.nextLine();
          //
//                    // Enter the OTP into the input field
                   otpInputField.clear(); // Clear any existing value
                    otpInputField.sendKeys(otp);
          //
//                    // Retrieve and print the value from the input field
                    String enteredOtp = otpInputField.getAttribute("value");
                    System.out.println("Entered OTP: " + enteredOtp);
                    

          


	}

	}