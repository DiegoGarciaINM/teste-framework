package br.com.inmetrics.desafioqafrm.features;

import static com.br.inmetrics.frm.bdd.Gherkin.given_;

import java.util.concurrent.ExecutionException;

import com.br.inmetrics.frm.bdd.Feature;
import com.br.inmetrics.frm.bdd.Scenario;

@Feature("Login")
public class LoginFeature {

	@Scenario("Efetuar Login com Sucesso")
	public void cadastro_com_sucesso() throws ExecutionException {
		
		given_("Dado que eu esteja na página de login").
		when_("Quando preencher o login com informações válidas").
		then_("Devo ir para página inicial.").
		execute_();
		
	}
}
