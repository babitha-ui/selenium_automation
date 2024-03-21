package module8_Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_login {
 public WebDriver driver;
 
 //specify the object/Element loctors
 
 By UserNameField=By.id("user-name");
 By PasswordField=By.id("password");
 By LoginBtn=By.id("login-button");
 By text_products=By.xpath("//span[text()='Products']");
 By button_addToCart=By.xpath("(//button[text()='Add to cart'])[1]");
 By cart_menu=By.xpath("//a[@class='shopping_cart_link']");
 By text_cart=By.xpath("//span[text()='Your Cart']");
 
 public Page_login(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 public void type_Username(String uname) throws InterruptedException
 {
	 driver.findElement(UserNameField).sendKeys(uname);
	 Thread.sleep(3000);
 }
 
 public void type_password(String pwd) throws InterruptedException
 {
	 driver.findElement(PasswordField).sendKeys(pwd);
	 Thread.sleep(3000);
 }
 public void click_Login() throws InterruptedException
 {
	 driver.findElement(LoginBtn).click();
	 Thread.sleep(3000);
 }
 
 public String capture_producttxt() throws InterruptedException
 {
	 return driver.findElement(text_products).getText();
	 
}
 public void click_addTocart() throws InterruptedException
 {
	  driver.findElement(button_addToCart).click();
	  Thread.sleep(2000);
	 
} 
 public void click_cartmenu() throws InterruptedException
 {
	  driver.findElement(cart_menu).click();
	  Thread.sleep(2000);
	 
} 
 public String  capture_text_cart() throws InterruptedException
 {
	 return driver.findElement(text_cart).getText();
	 
}
}
