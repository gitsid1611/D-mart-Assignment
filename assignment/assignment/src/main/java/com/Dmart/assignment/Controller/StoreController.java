package com.Dmart.assignment.Controller;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Exception.StoreException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Model.Store;
import com.Dmart.assignment.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StoreController {

    @Autowired
    private StoreService str;


//// This will add store in databases

    @PostMapping("/addStore")
    public ResponseEntity<Store> addStore(@RequestBody Store st)throws StoreException {

        Store sti = str.addStore(st);

        return new ResponseEntity<Store>(sti, HttpStatus.ACCEPTED);

    }


//    ////  This Get Method is to Check the quantity from each Store.


    @GetMapping("/stores/{storeId}/stock-items/{stockItemId}/quantity")
    public int getStockQuantity(@PathVariable Integer storeId, @PathVariable Integer stockItemId) {
        Store store = new Store();
        store.setId(storeId);

        StockItem stockItem = new StockItem();
        stockItem.setId(stockItemId);

        return str.getStockQuantity(stockItem, store);
    }



}
