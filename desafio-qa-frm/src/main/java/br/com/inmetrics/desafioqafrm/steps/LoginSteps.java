package br.com.inmetrics.desafioqafrm.steps;

import static com.br.inmetrics.frm.base.DefaultBaseController.getPage_;
import static com.br.inmetrics.frm.helpers.DataTableHelper.getDt_;

import com.br.inmetrics.frm.bdd.DesignSteps;
import com.br.inmetrics.frm.bdd.Step;
import com.br.inmetrics.frm.exceptions.ElementFindException;

import br.com.inmetrics.desafioqafrm.pages.BookingPage;
import br.com.inmetrics.desafioqafrm.pages.HomePage;
import br.com.inmetrics.desafioqafrm.pages.LoginPage;

@DesignSteps
public class LoginSteps {
	
	LoginPage loginPage = getPage_(LoginPage.class);
	HomePage homePage = getPage_(HomePage.class);
	
			
	@Step("Dado que eu esteja na página de login")
	public void dado_que_eu_esteja_na_pagina_de_login() throws ElementFindException {
		loginPage.validarPaginaLogin();
	}
	
	@Step("Quando preencher o login com informações válidas")
	public void quando_preencher_o_login_com_informacoes_validas() throws ElementFindException {
		loginPage.preencherLogin(getDt_().getStringOf("Email"), 
								 getDt_().getStringOf("Senha"));
	}

	@Step("Devo ir para página inicial.")
	public void devo_ir_para_pagina_inicial() throws ElementFindException {
		homePage.validarPaginaHome();
	}
	
}
