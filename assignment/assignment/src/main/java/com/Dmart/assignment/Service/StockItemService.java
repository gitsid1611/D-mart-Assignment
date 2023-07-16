package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Model.StockItem;

public interface StockItemService {

    public StockItem addStock(StockItem st)throws ItemException;


    public StockItem updateStockQuantity(String name, StockItem st)throws ItemException;

    public StockItem deleteStock(StockItem id) throws ItemException;


}
