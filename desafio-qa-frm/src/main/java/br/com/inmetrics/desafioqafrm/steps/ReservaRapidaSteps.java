package br.com.inmetrics.desafioqafrm.steps;

import static com.br.inmetrics.frm.base.DefaultBaseController.getPage_;
import static com.br.inmetrics.frm.helpers.DataTableHelper.getDt_;

import com.br.inmetrics.frm.bdd.DesignSteps;
import com.br.inmetrics.frm.bdd.Step;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.exceptions.GenericException;

import br.com.inmetrics.desafioqafrm.pages.HomePage;
import br.com.inmetrics.desafioqafrm.pages.LoginPage;
import br.com.inmetrics.desafioqafrm.pages.ReservaRapidaPage;

@DesignSteps
public class ReservaRapidaSteps {
	
	LoginPage loginPage = getPage_(LoginPage.class);
	HomePage homePage = getPage_(HomePage.class);
	ReservaRapidaPage reservaRapida = getPage_(ReservaRapidaPage.class);
	

	@Step("Acesso a página de reserva rapida")
	public void acesso_a_pagina_de_reserva_rapida() throws ElementFindException {
		reservaRapida.acesso_a_pagina_de_reserva_rapidas();
	}
	
	@Step("Devo ir para a página de reserva rapida")
	public void devo_ir_para_a_pagina_de_reserva_rapida() throws ElementFindException {
		reservaRapida.devo_ir_para_a_pagina_de_reserva_rapida();
	}
	
	@Step("Escolher hotels no menu service, clicando no botão NEXT")
	public void escolher_hotels_no_menu_service_clicando_no_botao_next() throws ElementFindException {
		reservaRapida.escolher_hotels_no_menu_service_clicando_no_botao_next();
	}
	
	@Step("Preencher o formulário como visitante e confirmar a reserva.")
	public void preencher_o_formulario_como_visitante_e_confirmar_a_reserva() throws ElementFindException {
		reservaRapida.preencher_o_formulario_como_visitante_e_confirmar_a_reserva();
	}
	
	@Step("Verificar se voltou para a página de reserva rapida")
	public void verificar_se_voltou_para_a_pagina_de_reserva_rapida() throws ElementFindException {
		reservaRapida.devo_ir_para_a_pagina_de_reserva_rapida();
	}
	
}
