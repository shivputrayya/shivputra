package com.altimetik.stock.stock_inventory.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetik.stock.stock_inventory.entity.Stock;
import com.altimetik.stock.stock_inventory.repository.StockRepository;

@Transactional
@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;
	private ArrayList<Stock> stock;

	public void create(Stock stock) {
		stockRepository.save(stock);
	}

	public void updateStock(Stock stock) {
		stockRepository.save(stock);

	}

	public Iterable<Stock> findAll() {
		return stockRepository.findAll();
	}

	public void deleteStock(Stock stock) {
		stockRepository.delete(stock);

	}
}
