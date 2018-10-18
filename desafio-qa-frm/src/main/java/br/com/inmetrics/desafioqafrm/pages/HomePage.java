package br.com.inmetrics.desafioqafrm.pages;

import static com.br.inmetrics.frm.helpers.QueryHelper.*;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;

public class HomePage extends PageBase {

	VirtualElement lblPainel = get(By.xpath("//*[contains(text(),'Dashboard')]"));
	
	public void validarPaginaHome() throws ElementFindException { 
		assertTrue(elementExists(lblPainel, 10));
	}
	
}
