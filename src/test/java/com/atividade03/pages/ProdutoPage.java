package com.atividade03.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade03.uimaps.ProdutoMap;

public class ProdutoPage {
	WebDriver driver;
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ProdutoMap produtoMap = new ProdutoMap(driver);
	
	public void pesquisarCep(String cep) {
		produtoMap.inputCep.click(driver);
		produtoMap.inputCep.sendkeys(driver, cep);
		produtoMap.btncep.click(driver);
	}
	
	/*public void validarFrete() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated((produtoMap.fretes)));
			List<WebElement> valoresFretePage = driver.findElements(produtoMap.fretes);
			for (int i=0; i < valoresFrete.size(); i++);
		}
	}
	*/

	public void validarValores() {
		// TODO Auto-generated method stub
		
	}
	
}

