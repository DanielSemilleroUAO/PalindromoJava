/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavapalindromo;

/**
 *
 * @author delga
 */
public class Palindromo {

    
    public String encontrarPalindromos(String[] palabras){
        String palabrasPalindromos = "";
        
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if((new StringBuilder(palabra).reverse().toString().trim().replaceAll(" ", "")).equalsIgnoreCase(palabra.trim().replaceAll(" ", ""))){
                palabrasPalindromos += palabra.toLowerCase()+", ";
            }
            
        }
        return palabrasPalindromos;
    }
    
}
