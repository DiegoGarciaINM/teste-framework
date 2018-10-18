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
public class BookingSteps {
	
	LoginPage loginPage = getPage_(LoginPage.class);
	HomePage homePage = getPage_(HomePage.class);
	BookingPage bookingPage = getPage_(BookingPage.class);
	
			
	@Step("Acesso a página de reservas")
	public void acesso_a_pagina_de_reservas() throws ElementFindException {
		bookingPage.acesso_a_pagina_de_reservas();
	}
	
	@Step("Devo ir para página de reservas")
	public void devo_ir_para_pagina_de_reservas() throws ElementFindException {
		bookingPage.devo_ir_para_pagina_de_reservas();
	}
	
}
