/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PIERO
 */
public interface BdInterface<T> {
    ArrayList<T> list() throws SQLException;
    void insert(T t) throws SQLException;
    void save(T t) throws SQLException;
    T listForId(int id) throws SQLException;
    void delete(T t) throws SQLException;
}
