package com.altimetik.stock.stock_inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.altimetik.stock.stock_inventory.entity.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {

}
