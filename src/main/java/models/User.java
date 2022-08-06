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
public class User {
    private int user_id;
    private String user_username;
    private String user_password;
    private int user_role_id;
    private Boolean user_status;
}
