package com.balram.invoice.invoice_processing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balram.invoice.invoice_processing.Dao.Repository;
import com.balram.invoice.invoice_processing.model.Invoice;

@Service
public class serviceImpl implements InvoiceService {
	
	@Autowired
	private Repository invoicerepository;

	@Override
	public Invoice create(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoicerepository.save(invoice);
	}

	@Override
	public List<Invoice> getInvoice() {
		// TODO Auto-generated method stub
		return invoicerepository.findAll();
	}

	@Override
	public List<Invoice> deleteInvoice(Integer id) {
		// TODO Auto-generated method stub
		 invoicerepository.deleteById(id);
		return invoicerepository.findAll();
	}

	

}
