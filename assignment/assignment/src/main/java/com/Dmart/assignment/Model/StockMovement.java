package com.Dmart.assignment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private StockItem stockItem;

    @ManyToOne
    private Store fromStore;

    @ManyToOne
    private Store toStore;

    private int quantity;




}
