/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

/**
 *
 * @author Araceli
 */
public class password {
        private String password;
        private String [] arrayp =new String[5];
        private int i;

    public boolean setPassword(String password){
        int mayus = 0;
        int minus = 0;
        int num = 0;
        int esp = 0;
        int c=0;

        if (password.length() == 8) {
            for (int i = 0; i <= password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    mayus++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    minus++;
                }

                if (Character.isDigit(password.charAt(i))) {
                    num++;
                }

                if ((int) password.charAt(i) == 42 || (int) password.charAt(i) == 43 || (int) password.charAt(i) == 45 || (int) password.charAt(i) == 63) {
                    esp++;
                }

            }
            if (mayus >= 1 && minus >= 1 && num >= 1 && esp >= 1 && c<=5) {
                arrayp[c] = password;
                c++;                
                return true;
            }
        }
        return false;
    }

        
        
        /**
     * @param password the password to set
     * @return 
     */
    /*public int setPassword(String password) {
        if (passwordCondition(password) && i<=5) {
                arrayp[i] = password;
                i++;
            }
        return i;
    }*/
        
        
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }


}
