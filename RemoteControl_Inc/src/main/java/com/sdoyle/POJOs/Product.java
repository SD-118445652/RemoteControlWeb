/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdoyle.POJOs;

/**
 *
 * @author samdo
 */
public class Product {
    private int id;
    private String name;
    private String email;
    
    public Product(int id, String name,String email){
    this.id =id;
    this.name = name;
    this.email = email;
    
}

public void setID(int _id){
id = _id;
}
public int getId(){
    return id;
}

public void setName(String _name){
    name = _name;
}
public String getName(){
    return name;
}

public void setEmail(String _email){
    email = _email;
}
public String getEmail(){
    return email;
}

}
