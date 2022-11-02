package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       driver.get("https://blazedemo.com/");

     //   i.   Verify the title of the homepage and print result in the console

        System.out.println("TITLE OF THE PAGE == "+driver.getTitle());

     //   ii.  find number of links and images in the homepage

        int count=driver.findElements(By.tagName("a")).size();
        System.out.println("TOTAL LINK ON PAGE=== "+count);

     //   iii. write a test script to book a airline ticket

      WebElement no = driver.findElement(By.name("fromPort"));
      Select sle = new Select(no);
      sle.selectByVisibleText("Boston");
      WebElement no1 =driver.findElement(By.name("toPort"));
      Select sle1 = new Select(no1);
      sle1.selectByValue("London");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
      driver.findElement(By.id("inputName")).sendKeys("Roshan Kedar");
      driver.findElement(By.id("address")).sendKeys("india");
      driver.findElement(By.id("city")).sendKeys("nashik");
      driver.findElement(By.id("state")).sendKeys("Maharashtra");
      Thread.sleep(500);
      driver.findElement(By.id("zipCode")).sendKeys("422003");
      driver.findElement(By.id("creditCardNumber")).sendKeys("123456789");
        driver.findElement(By.id("creditCardMonth")).clear();
      driver.findElement(By.id("creditCardMonth")).sendKeys("05");
        driver.findElement(By.id("creditCardYear")).clear();
      driver.findElement(By.id("creditCardYear")).sendKeys("2022");
      driver.findElement(By.id("nameOnCard")).sendKeys("ROSHAN KEDAR");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
     Thread.sleep(1000);


    }
}
