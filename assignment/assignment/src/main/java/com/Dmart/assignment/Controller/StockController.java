package com.Dmart.assignment.Controller;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Service.StockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StockController {


    @Autowired
    private StockItemService str;

//    //  Adding Stock in database

    @PostMapping("/addStock")
    public ResponseEntity<StockItem> addStockHandler(@RequestBody StockItem st)throws ItemException{

        StockItem sti = str.addStock(st);

        return new ResponseEntity<StockItem>(sti,HttpStatus.ACCEPTED);

    }

    //// Update the Quantity using StockItem Name;


    @PutMapping("/updateQuantity{name}")
    public ResponseEntity<StockItem> updateStockHandler(@PathVariable("name") String name, @RequestBody StockItem st)throws ItemException{

        StockItem sti = str.updateStockQuantity(name, st);

        return new ResponseEntity<StockItem>(sti,HttpStatus.ACCEPTED);

    }


////// Delete StockItem using Id


    @DeleteMapping("/deleteStockItem/{id}")
    public ResponseEntity<StockItem> deleteStockHandler(@PathVariable("id") StockItem st)throws ItemException{

        StockItem sti = str.deleteStock(st);

        return new ResponseEntity<StockItem>(sti,HttpStatus.ACCEPTED);

    }







}
