package com.balram.invoice.invoice_processing.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balram.invoice.invoice_processing.model.Invoice;

public interface Repository extends JpaRepository<Invoice,Integer> {

}
