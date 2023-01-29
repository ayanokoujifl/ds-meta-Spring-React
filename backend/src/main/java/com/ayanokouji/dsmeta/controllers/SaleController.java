package com.ayanokouji.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ayanokouji.dsmeta.dto.SaleDTO;
import com.ayanokouji.dsmeta.entities.Sale;
import com.ayanokouji.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public Page<Sale> findAll(@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, Pageable pageable) {
		return service.findAll(minDate, maxDate, pageable);
	}

	@GetMapping(value = "/{id}")
	public SaleDTO findById(@PathVariable Long id) {
		return new SaleDTO(service.findById(id));
	}
}
