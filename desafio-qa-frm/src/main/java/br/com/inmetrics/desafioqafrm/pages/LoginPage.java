package br.com.inmetrics.desafioqafrm.pages;

import static com.br.inmetrics.frm.helpers.QueryHelper.*;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.log4testng.Logger;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.PropertyHelper;
import com.br.inmetrics.frm.utils.ScreenshotUtils;

public class LoginPage extends PageBase {

	Logger logger = Logger.getLogger(LoginPage.class);
	
	VirtualElement txtUsuario = getElementByName("email"), 
			   	   txtSenha = getElementBys(By.name("password")), 
			   	   btnSubmit = getElementBys(By.xpath("//*[contains(@type,'submit')]")), 
			   	   lblPainel = getElementBys(By.xpath("//*[contains(text(),'Login Panel')]"));
	
	public void validarPaginaLogin() throws ElementFindException { 
		
		logger.debug("Validando a página de login.");
		
		if (elementExists(lblPainel, 10))
			logger.debug("O elemento existe");
		else
			logger.debug("O elemento no existe");
		
		ScreenshotUtils.takeScreenshot_("Login");
		
		//assertTrue(elementExists(lblPainel, 10));
	}
	
	public void preencherLogin(String email, String senha) throws ElementFindException {
		
		logger.debug("Preenchendo as informações de login.");
		txtUsuario.setValue(email);
		txtSenha.setValue(senha);
	
		ScreenshotUtils.takeScreenshot_("Login preenchido");
		
		btnSubmit.click();
	}
}
