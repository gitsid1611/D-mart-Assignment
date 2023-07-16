package com.Dmart.assignment.Service;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Model.StockItem;
import com.Dmart.assignment.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class StockItemServiceImpl implements StockItemService{



    @Autowired
    private StockRepository str;
    @Override
    public StockItem addStock(StockItem st) throws ItemException {
        return str.save(st);
    }

    @Override
    public StockItem updateStockQuantity(String name, StockItem st) throws ItemException {

       Optional<StockItem> s = Optional.ofNullable(str.findByName(name));

       if(s.isPresent()){
           return str.save(st);
       }
       else{
           throw new ItemException("Can't update as No such Item present in Databases");
       }

    }


    @Override
    public StockItem deleteStock(StockItem id) throws ItemException {
        Optional<StockItem> s = str.findById(id.getId());

        if(s.isPresent()){
            str.delete(id);
        }
        else{
            throw new ItemException("No Item with given Id is present in Databases");
        }


        return s.get();
    }
}
