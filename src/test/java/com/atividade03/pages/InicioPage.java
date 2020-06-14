package com.atividade03.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade03.uimaps.InicioMap;


public class InicioPage {
	WebDriver driver;
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarCampoBusca(String string) {
		inicioMap.campoBusca.sendkeys(driver, string);
		
	}
	public void clicarPraBuscar() {
		inicioMap.btnBuscar.click(driver);
	}
	public void lincarProduto() {
		inicioMap.linkProduto.click(driver);
	}
	
	public void clicarCep() {
		inicioMap.preencherCep.click(driver);
	}
	
	public void preencherCep( String string) {
		inicioMap.preencherCep.sendkeys(driver, string);
	}
	
	public void clicarCalcularFrete() {
		inicioMap.btncep.click(driver);
	}
	public void validarOpçoesDeFrete() {
		 WebDriverWait wait = new WebDriverWait(driver,10);
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated((inicioMap.fretes)));
				List<WebElement> valoresFretePage = driver.findElement(inicioMap.fretes);
				for (int i=0; i < valoresFrete.size(); i++);
			}
	 }
	 

	
	

}
