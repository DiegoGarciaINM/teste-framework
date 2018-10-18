package br.com.inmetrics.desafioqafrm.tests;

import static com.br.inmetrics.frm.bdd.Gherkin.executeScenario_;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.br.inmetrics.frm.base.TestBase;
import com.br.inmetrics.frm.controllers.WebController;
import com.br.inmetrics.frm.testng.DataTableConfig;
import com.br.inmetrics.frm.testng.TestConfig;

@TestConfig(controllerType = WebController.class)
public class TestBooking extends TestBase {

	@DataTableConfig(ct = 1)
	@Test(priority = 1, groups = { "AcessarReserva" }, testName = "ct001 - acesso a página de reservas", suiteName = "Booking")
	public void CT001_Acesso_a_Pagina_de_Reservas() {
		try {
			executeScenario_("AcessarReserva", "Acessar Reservas");
		} catch (Exception e) {
			Assert.fail("Test error.", e);
		}
	}
	
	@BeforeMethod
	public void setup(final Method method, final ITestContext context) {
		super.setup(method, context);
	}

	@AfterMethod
	public void teardown(final Method method, final ITestContext context) {
		super.teardown(method, context);
	}

}
