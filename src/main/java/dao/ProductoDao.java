/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.BdInterface;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Producto;

/**
 *
 * @author PIERO
 */
public class ProductoDao implements BdInterface<Producto>{

    public static final String sql_list = "select * from producto where item_status = 1";
    public static final String sql_insert = "";
    public static final String sql_edit = "";
    public static final String sql_save = "";
    public static final String sql_delete = "";
    
    @Override
    public ArrayList<Producto> list() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Producto t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Producto t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Producto t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Producto t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
