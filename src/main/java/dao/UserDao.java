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
    public static final String sql_insert = "insert into user (user_user_name,user_password,user_role_id) values (?,?,?)";
    public static final String sql_edit = "";
    public static final String sql_save = "insert into user( user_id,user_name,user_password,user_role_id,user_status) values (?,?,?,?,?)";
    public static final String sql_delete = "";
    
    @Override
    public ArrayList<User> list() throws SQLException {
        ArrayList<User> lista = new ArrayList<User>();  /* INICIAR UN ARRAY LIST (LISTA ASOCIATIVA) VACIA*/
        User us = null; /* SETEAR UN MODELO AL VACIO PARA USARLO DESPUES*/
        Connection cn = conexion.conexion.openConnection(); /* ABRIR LA CONEXION DE LA BASE DE DATOS */
        try{
            PreparedStatement stm = cn.prepareStatement(sql_list); /** TRANSFORMAR LA CONSULTA STRING A TIPO PREPARED STATEMENT*/
            ResultSet rs = stm.executeQuery(); /* EJECUTA ESE COMANDO */
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
        Connection cn = conexion.conexion.openConnection();
        try{
            PreparedStatement stm=cn.prepareStatement(sql_insert);
            stm.setString(1, t.getUser_username());
            stm.setString(2, t.getUser_password());
            stm.setInt(3, t.getUser_role_id());
            stm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void save(User t) throws SQLException {
         Connection cn = conexion.conexion.openConnection();
         try {
         PreparedStatement stm=cn.prepareStatement(sql_save);
         stm.setInt(1, t.getUser_id());
         stm.setString(2, t.getUser_username());
         stm.setString(3, t.getUser_password());
         stm.setInt(4, t.getUser_role_id());
         stm.setBoolean(5, t.getUser_status());
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    @Override
    public void delete(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User listForId(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
