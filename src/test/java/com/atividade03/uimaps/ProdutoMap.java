package com.atividade03.uimaps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import com.atividade03.core.Element;
import com.atividade03.enums.ByValue;

public class ProdutoMap {
	WebDriver driver;
	
	public ProdutoMap(WebDriver driver){
		this.driver = driver;
		
	}
	// campos do frete
	public Element inputCep = new Element(driver, ByValue.XPATH, "//input[@id='calc_cep']");
	public Element btncep = new Element( driver, ByValue.XPATH, "input[@value='Calcular Frete']");
	
	
	
}
