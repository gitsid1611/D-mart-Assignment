package com.Dmart.assignment.Repository;

import com.Dmart.assignment.Model.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovement,Integer> {


}
