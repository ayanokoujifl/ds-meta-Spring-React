package com.ayanokouji.dsmeta.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.ayanokouji.dsmeta.entities.Sale;

public class SaleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	public SaleDTO() {
	}

	public SaleDTO(Long id, String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
		super();
		this.id = id;
		this.sellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}

	public SaleDTO(Sale sale) {
		this.id = sale.getId();
		this.sellerName = sale.getSellerName();
		this.visited = sale.getVisited();
		this.deals = sale.getDeals();
		this.amount = sale.getAmount();
		this.date = sale.getDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
