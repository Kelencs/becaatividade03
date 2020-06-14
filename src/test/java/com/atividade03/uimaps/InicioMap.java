package com.atividade03.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade03.core.Element;
import com.atividade03.enums.ByValue;

public class InicioMap {
WebDriver driver;
	
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
		
	}

	public Element campoBusca = new Element(driver,ByValue.XPATH, "//input[contains(@class,'sprocura')]");
	
	public Element btnBuscar = new Element(driver, ByValue.XPATH, "//input[contains(@id,'bt-busca')]");
	
	public Element linkProduto = new Element(driver, ByValue.XPATH, "//a[text()='Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite']");
	
	public Element preencherCep = new Element(driver, ByValue.XPATH, "//input[@id='calc_cep']");
	public Element btncep = new Element( driver, ByValue.XPATH, "//input[@value='Calcular Frete']");
	
	public Element fretes = new Element(driver, ByValue.XPATH, "//tbody[@id='tabe-calcular']//tr/td[contains(text(). 'R$')]");


}
