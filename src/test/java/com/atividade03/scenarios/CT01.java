package com.atividade03.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.atividade03.core.Driver;
import com.atividade03.pages.InicioPage;
import com.atividade03.pages.ProdutoPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	ProdutoPage produtoPage;
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		inicioPage = new InicioPage(driver);
		
	}
	@Test
	public void test() {
		inicioPage.selecionarCampoBusca("Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		inicioPage.clicarPraBuscar();
		inicioPage.lincarProduto();
		
		inicioPage.clicarCep();
		inicioPage.preencherCep("38413108");
		inicioPage.clicarCalcularFrete();
				
		
		
		/*
		buscarPage.chooseProduct("Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		produtoPage.preencherCep("38413108");
		produtoPage.validarValores()
		*/
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@After
	public void after() {
		Driver.quit(driver);
	}

}
