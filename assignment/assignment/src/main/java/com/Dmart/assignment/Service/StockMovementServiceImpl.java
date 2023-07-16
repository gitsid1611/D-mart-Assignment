package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.MovementException;
import com.Dmart.assignment.Model.StockMovement;
import com.Dmart.assignment.Repository.StockMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockMovementServiceImpl implements StockMovementService{

    @Autowired
    private StockMovementRepository str;

    @Override
    public StockMovement addStockMovement(StockMovement st) throws MovementException {
        return str.save(st);
    }
}
