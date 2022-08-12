/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author PIERO
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private int Item_id;
    private String Item_name;
    private int Item_qly;
    private String Item_description;
    private double Item_price_buying;
    private double Item_price_selling;
    private Boolean Item_status;
}