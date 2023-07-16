package com.Dmart.assignment.Repository;

import com.Dmart.assignment.Exception.ItemException;
import com.Dmart.assignment.Model.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockItem,Integer> {

    public StockItem findByName(String name)throws ItemException;


    @Query("SELECT s.quantity FROM StockItem s WHERE s.stockItem.id = :stockItemId AND s.store.id = :storeId")
    int getStockQuantity(@Param("stockItemId") Integer stockItemId, @Param("storeId") Integer storeId);


}
