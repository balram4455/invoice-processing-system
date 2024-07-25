package com.balram.invoice.invoice_processing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balram.invoice.invoice_processing.model.Invoice;
import com.balram.invoice.invoice_processing.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
@CrossOrigin
public class UserController {
	
	@Autowired
	 private InvoiceService invoiceservice;
	
	@PostMapping
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return invoiceservice.create(invoice);
	}
	@GetMapping
	public List<Invoice> getInvoices(){
		return invoiceservice.getInvoice();
	}
	
	@DeleteMapping("/{id}")
	public List<Invoice> deleteInvoice(@PathVariable Integer id) {
  
        return invoiceservice.deleteInvoice(id);
	}
	


}
