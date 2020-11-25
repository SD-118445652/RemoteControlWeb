/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdoyle.DAO;

import com.sdoyle.POJOs.User;

/**
 *
 * @author samdo
 */
public interface UserInterface {
    public User getUserByUsername(String username);
    
}
