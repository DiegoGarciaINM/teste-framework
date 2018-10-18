package br.com.inmetrics.desafioqafrm.pages;

import static com.br.inmetrics.frm.helpers.QueryHelper.*;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;

public class BookingPage extends PageBase {
	
	VirtualElement btnBooking = getElementBys(By.xpath("//div[text()=' Bookings']"));
	VirtualElement panelHeading = getElementBys(By.xpath("//div[text() = 'Booking Management']"));
	
	public void acesso_a_pagina_de_reservas() throws ElementFindException { 
		
		btnBooking.click();
		
	}
	
	public void devo_ir_para_pagina_de_reservas() throws ElementFindException{
		assertTrue(elementExists(panelHeading, 10));
		
		
	}

}
