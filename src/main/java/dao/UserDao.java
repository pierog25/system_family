/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.BdInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.User;

/**
 *
 * @author PIERO
 */
public class UserDao implements BdInterface<User> {
    
    public static final String sql_list = "select * from user where user_status = 1";
    public static final String sql_insert = "";
    public static final String sql_edit = "";
    public static final String sql_save = "";
    public static final String sql_delete = "";
    
    @Override
    public ArrayList<User> list() throws SQLException {
        ArrayList<User> lista = new ArrayList<User>();
        User us = null;
        Connection cn = conexion.conexion.openConnection();
        try{
            PreparedStatement stm = cn.prepareStatement(sql_list);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                us = new User();
                us.setUser_id(rs.getInt("user_id"));
                us.setUser_username(rs.getString("user_username"));
                us.setUser_password(rs.getString("user_password"));
                us.setUser_role_id(rs.getInt("user_role_id"));
                us.setUser_status(rs.getBoolean("user_status"));
                lista.add(us);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void insert(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
