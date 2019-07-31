package com.testMerlinJorge;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.jorge.MainProject;



public class NewUserRegisterLoginTest extends MainProject {
	
	
	@Test
	public void registerUser() {
		
		driver.findElement(By.name("name")).sendKeys("Jorge Cortés20");	
		driver.findElement(By.name("phone")).sendKeys("123456920");
		driver.findElement(By.name("email")).sendKeys("prueba@prueba20.com");
		driver.findElement(By.name("country")).sendKeys("Colombia");	
		driver.findElement(By.name("city")).sendKeys("Colombia");		
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("Jorge20");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("Jorge20");
		WebElement boton  = driver.findElement(By.xpath("(//input[@type='submit'] [@class='button'])[2]"));
		boton.click();	
	}
	
	@Test
	public void registerUserExist() {
		
		driver.findElement(By.name("name")).sendKeys("Jorge Cortés");	
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.name("email")).sendKeys("prueba@prueba.com");
		driver.findElement(By.name("country")).sendKeys("Colombia");	
		driver.findElement(By.name("city")).sendKeys("Colombia");		
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("Jorge");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("Jorge");
		WebElement boton  = driver.findElement(By.xpath("(//input[@type='submit'] [@class='button'])[2]"));
		boton.click();			
		
	}
	
}
	
	
