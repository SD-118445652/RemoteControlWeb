/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdoyle.DAO;

import com.sdoyle.POJOs.User;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author samdo
 */
public class UserDAO implements UserInterface{
    static Vector<User> vec = new Vector<User>();
    public static void insert(User user) {
        vec.add(user);
    }

    @Override
    public User getUserByUsername(String username) {
        for (User u: vec) {
   if (username.equals(u.getEmail())) {
   return u;
   }        
        }
   return null;

                
}
}
