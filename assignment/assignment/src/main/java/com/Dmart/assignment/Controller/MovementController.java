package com.Dmart.assignment.Controller;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Exception.MovementException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Model.StockMovement;
import com.Dmart.assignment.Service.StockMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovementController {

    @Autowired
    private StockMovementService str;


    @PostMapping("/Movement")
    public ResponseEntity<StockMovement> addStockHandler(@RequestBody StockMovement st)throws MovementException {

        StockMovement sti = str.addStockMovement(st);

        return new ResponseEntity<StockMovement>(sti, HttpStatus.ACCEPTED);

    }





}
