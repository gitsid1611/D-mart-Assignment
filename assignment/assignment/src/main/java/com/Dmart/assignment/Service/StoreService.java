package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.MovementException;
import com.Dmart.assignment.Exception.StoreException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Model.StockMovement;
import com.Dmart.assignment.Model.Store;

public interface StoreService {

    public Store addStore(Store st)throws StoreException;


    public int getStockQuantity(StockItem stockItem, Store store);

}
