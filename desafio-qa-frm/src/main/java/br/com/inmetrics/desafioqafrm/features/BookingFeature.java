package br.com.inmetrics.desafioqafrm.features;

import static com.br.inmetrics.frm.bdd.Gherkin.given_;

import java.util.concurrent.ExecutionException;

import com.br.inmetrics.frm.bdd.Feature;
import com.br.inmetrics.frm.bdd.Scenario;

@Feature("AcessarReserva")
public class BookingFeature {

	@Scenario("Acessar Reservas")
	public void acessar_reservas() throws ExecutionException {
		
		given_("Dado que eu esteja na página de login").
		when_("Quando preencher o login com informações válidas").
		then_("Devo ir para página inicial.").
		then_("Acesso a página de reservas").
		then_("Devo ir para página de reservas").
		execute_();
		
	}
}
