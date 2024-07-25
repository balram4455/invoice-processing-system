package com.balram.invoice.invoice_processing.service;

import java.util.List;

import com.balram.invoice.invoice_processing.model.Invoice;

public interface InvoiceService {

   Invoice create(Invoice ivoice);

    List<Invoice> getInvoice();

	List<Invoice> deleteInvoice(Integer id);
	
}
