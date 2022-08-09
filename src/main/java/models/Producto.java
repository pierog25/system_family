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
    private int item_id;
    private String item_name;
}
