package com.altimetik.stock.stock_inventory.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s")
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stockNumber;

	@Column
	private String stockName;

	@Temporal(TemporalType.DATE)
	private Date purchaseDate;

	private float purchasePrice;

	private int quantity;

	public Stock(int stockNumber, String stockName, Date purchaseDate, float purchasePrice, int quantity) {
		super();
		this.stockNumber = stockNumber;
		this.stockName = stockName;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	public int getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [stockNumber=" + stockNumber + ", stockName=" + stockName + ", purchaseDate=" + purchaseDate
				+ ", purchasePrice=" + purchasePrice + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Stock stock = (Stock) obj;
		return (stock.stockName.equals(this.stockName) && stock.purchasePrice == this.purchasePrice
				&& stock.purchaseDate == this.purchaseDate);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.stockNumber;
	}

	class SortByName implements Comparator<Stock> {

		@Override
		public int compare(Stock s1, Stock s2) {
			// TODO Auto-generated method stub
			return s1.stockName.compareTo(s2.stockName);
		}

		class SortByPurchasedate implements Comparator<Stock> {

			@Override
			public int compare(Stock s1, Stock s2) {
				// TODO Auto-generated method stub
				return s1.purchaseDate.compareTo(s2.purchaseDate);
			}

		}

	}

}
