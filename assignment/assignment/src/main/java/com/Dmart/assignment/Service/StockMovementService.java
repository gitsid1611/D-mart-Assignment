package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Exception.MovementException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Model.StockMovement;

public interface StockMovementService {
    public StockMovement addStockMovement(StockMovement st)throws MovementException;

}
