/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.UserDao.sql_insert;
import interfaces.BdInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Producto;

/**
 *
 * @author PIERO
 */
public class ProductoDao implements BdInterface<Producto>{

    public static final String sql_list = "select * from producto where item_status = 1";

    public static final String sql_insert = "insert into ( Item_name, Item_category, Item_price_buying) values (?,?.?)";
    public static final String sql_edit = "";  
    public static final String sql_list_for_id = "select * from producto where item_status = 1 and item_id = ?";
    public static final String sql_save = "";
    public static final String sql_delete = "";
    
    @Override
    public ArrayList<Producto> list() throws SQLException {
        ArrayList<Producto> lista= new ArrayList<Producto>();
        Producto us = null;
        Connection cn = conexion.conexion.openConnection();try{
            PreparedStatement stm = cn.prepareStatement(sql_list); 
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                us = new Producto();
                us.setItem_id(rs.getInt("Item_id"));
                us.setItem_name(rs.getString("Item_name"));
                us.setItem_description(rs.getString("Item_description"));
                us.setItem_price_buying(rs.getInt("Item_price_buying"));
                us.setItem_price_selling(rs.getInt("Item_price_selling"));
                us.setItem_status(rs.getBoolean("Item_status"));
                lista.add(us);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;   
    }
    
    @Override
    public void insert(Producto t) throws SQLException {
            Connection cn = conexion.conexion.openConnection();
            try {
                PreparedStatement stm=cn.prepareStatement(sql_insert);
                stm.setString(1, t.getItem_name());
                stm.executeUpdate();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    @Override
    public void save(Producto t) throws SQLException {
               
                    
    }

    @Override
    public void delete(Producto t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto listForId(int id) throws SQLException {
        Connection cn = conexion.conexion.openConnection();
        try{
            PreparedStatement stm=cn.prepareStatement(sql_list_for_id);
            stm.setInt(1, id);
            stm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
