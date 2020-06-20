package com.atividade03.pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade03.uimaps.ProdutoMap;


public class ProdutoPage {
	WebDriver driver;
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ProdutoMap produtoMap = new ProdutoMap(driver);
	
	public void preencherCep() {
		produtoMap.inputCep.click(driver);
		produtoMap.inputCep.sendkeys(driver, "38413108");
		produtoMap.btncep.click(driver);
	}
	
	

	public void validarValoresFrete() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		

		
	try {
		String textoElement = driver.findElement(By.xpath("//*[contains(text(),'23,17')]")).getText();
        assertEquals("23,17", textoElement);
		
		System.out.println("Sucesso");
	}catch (Exception e) {
		System.out.println("Falha!");
	}
	}
		
}
		
	
	


