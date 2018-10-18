package br.com.inmetrics.desafioqafrm.pages;

import static com.br.inmetrics.frm.base.DefaultBaseController.getDriver_;
import static com.br.inmetrics.frm.helpers.QueryHelper.getElementBys;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.exceptions.GenericException;

import io.appium.java_client.functions.ExpectedCondition;

public class ReservaRapidaPage extends PageBase {
	
	Logger logger = Logger.getLogger(ReservaRapidaPage.class);
	
	VirtualElement btnQuickBooking = getElementBys(By.xpath("//button[@class='btn btn-danger btn-block']"));
	VirtualElement panelHeading = getElementBys(By.xpath("//h4[text() = 'Quick Booking']"));
	VirtualElement dropService = getElementBys(By.xpath("//select[@id='servicetype']"));	
	VirtualElement btnNext = getElementBys(By.xpath("//button[@class = 'btn btn-primary']"));
	VirtualElement dropCustomer = getElementBys(By.xpath("//option[@value = 'guest']"));
	VirtualElement firstName = getElementBys(By.xpath("//input[@name = 'firstname']"));
	VirtualElement lastName = getElementBys(By.xpath("//input[@name = 'lastname']"));
	VirtualElement mobile = getElementBys(By.xpath("//input[@name = 'phone']"));
	VirtualElement email = getElementBys(By.xpath("//input[@name = 'email']"));
	VirtualElement checkIn = getElementBys(By.xpath("//input[@name = 'checkin'][@placeholder = 'Date']"));
	VirtualElement checkOut = getElementBys(By.xpath("//input[@name = 'checkout'][@placeholder = 'Date']"));
	VirtualElement hotelName = getElementBys(By.xpath("//div[@id = 's2id_autogen3']"));
	VirtualElement hotel = getElementBys(By.xpath("//div[text() = ' Oasis Beach Tower ']"));
	VirtualElement roomName = getElementBys(By.xpath("//span[text()='Select Room']"));
	VirtualElement room = getElementBys(By.xpath("//div[text()='Executive Two-Bedrooms Apartment']"));
	VirtualElement paymentType = getElementBys(By.xpath("//select[@name = 'paymethod']"));
	VirtualElement payment = getElementBys(By.xpath("//option[@value = 'paypalexpress']"));
	VirtualElement btnBookNow = getElementBys(By.xpath("//input[@value = 'Book Now']"));
	
	
	public void acesso_a_pagina_de_reserva_rapidas() throws ElementFindException { 
		btnQuickBooking.click();
	}
	
	public void devo_ir_para_a_pagina_de_reserva_rapida() throws ElementFindException {
		assertTrue(elementExists(panelHeading, 10));
	}
	
	public void escolher_hotels_no_menu_service_clicando_no_botao_next() throws ElementFindException {

		dropService.selectByText("Hotels");
		btnNext.click();
	}
	
	public void preencher_o_formulario_como_visitante_e_confirmar_a_reserva() throws ElementFindException {
		dropCustomer.click();
		firstName.sendKeys("Diego");
		lastName.sendKeys("Garcia");
		mobile.sendKeys("+55(11)999999999");
		email.sendKeys("diego.garcia@diegogarcia.com.br");
		checkIn.sendKeys("30/10/2018"); //Atualizar a data de Chec In
		checkIn.click();
		checkOut.sendKeys("31/10/2018"); //Atualizar a data de Chec Out
		checkOut.click();
		hotelName.click();
		waitUntilExists(hotel, 10);
		hotel.click();
		waitUntilExists(roomName, 10);
		roomName.click();
		waitUntilExists(room, 10);
		room.click();
		sleep(2);
		paymentType.click();
		waitUntilExists(payment, 10);
		payment.click();
		btnBookNow.click();
	}
}
