package com.altimetik.stock.stock_inventory.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimetik.stock.stock_inventory.entity.Stock;
import com.altimetik.stock.stock_inventory.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {
	private StockService stockService;

	@RequestMapping(method = RequestMethod.POST, value = "")
	public void addStock(@RequestBody Stock stock) {
		stockService.create(stock);
	}

	@RequestMapping("")
	public Iterable<Stock> getAllStock() {
		return stockService.findAll();

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{stockNumber}")
	public void updateStock(@RequestBody Stock stock) {
		stockService.updateStock(stock);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{stockNumber}")
	public void deleteStock(@RequestBody Stock stock) {
		stockService.deleteStock(stock);

	}

}
