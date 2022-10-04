/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class Login {
    private String name;
    private String password;
    
    public Login(String name, String password){
        name=this.name;
        password=this.password;
        
        ArrayList<String> user = new ArrayList<>();
        user.add(name);
        ArrayList<String> contrasena = new ArrayList<>();
        contrasena.add(password);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
