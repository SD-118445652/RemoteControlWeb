/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdoyle.factories;

import com.sdoyle.DAO.UserDAO;
import com.sdoyle.POJOs.User;

/**
 *
 * @author samdo
 */
public class UserFactory {
    private UserDAO dao;
    
    public User create(UserDAO userdao){
        
        return new User();
    
}
}
