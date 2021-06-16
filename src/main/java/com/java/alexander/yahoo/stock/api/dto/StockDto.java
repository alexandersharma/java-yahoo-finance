package com.java.alexander.yahoo.stock.api.dto;

import java.math.BigDecimal;

public class StockDto {
	private String name;
	private BigDecimal price;
	private BigDecimal change;
	private String currency;
	private BigDecimal bid;

	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", price='" + getPrice() + "'" +
			", change='" + getChange() + "'" +
			", currency='" + getCurrency() + "'" +
			", bid='" + getBid() + "'" +
			"}";
	}

	public StockDto() {}

	public StockDto(String name, BigDecimal price, BigDecimal change, String currency, BigDecimal bid) {
		this.name = name;
		this.price = price;
		this.change = change;
		this.currency = currency;
		this.bid = bid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getChange() {
		return this.change;
	}

	public void setChange(BigDecimal change) {
		this.change = change;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getBid() {
		return this.bid;
	}

	public void setBid(BigDecimal bid) {
		this.bid = bid;
	}
}
