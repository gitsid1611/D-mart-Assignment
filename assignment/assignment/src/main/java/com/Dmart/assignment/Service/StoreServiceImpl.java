package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.StoreException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Model.Store;
import com.Dmart.assignment.Repository.StockRepository;
import com.Dmart.assignment.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    private StoreRepository str;


    @Autowired
    private StockRepository stt;



    @Override
    public Store addStore(Store st) throws StoreException {
        return str.save(st);
    }


    @Override
    public int getStockQuantity(StockItem stockItem, Store store) {
        return stt.getStockQuantity(stockItem.getId(), store.getId());
    }
}
