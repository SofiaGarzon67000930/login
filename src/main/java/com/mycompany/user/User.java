/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.user;

import java.util.Scanner;

/**
 *
 * @author Araceli
 */
public class User {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String user;
        String password;
        
        System.out.println("Inserte un usuario");
        user=in.nextLine();
            in.nextLine();
        do {
            System.out.println("Inserte una contraseña de 8 caracacteres");
            password = in.nextLine();
            if (!password.setPassword(password)) {
                System.out.println("La contraseña no es valida");
            }
        } while (false);
        
       usuario usuario =new user;
    }
}

