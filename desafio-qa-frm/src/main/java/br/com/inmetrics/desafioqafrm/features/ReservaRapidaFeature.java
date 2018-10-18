package br.com.inmetrics.desafioqafrm.features;

import static com.br.inmetrics.frm.bdd.Gherkin.given_;

import java.util.concurrent.ExecutionException;

import com.br.inmetrics.frm.bdd.Feature;
import com.br.inmetrics.frm.bdd.Scenario;

@Feature("ReservaRapida")
public class ReservaRapidaFeature {

	@Scenario("Reserva Rapida")
	public void acessar_reservas() throws ExecutionException {
		
		given_("Dado que eu esteja na página de login").
		when_("Quando preencher o login com informações válidas").
		then_("Devo ir para página inicial.").
		then_("Acesso a página de reserva rapida").
		then_("Devo ir para a página de reserva rapida").
		then_("Escolher hotels no menu service, clicando no botão NEXT").
		then_("Preencher o formulário como visitante e confirmar a reserva.").
		then_("Devo ir para página de reservas").
		
		execute_();
		
	}
}
