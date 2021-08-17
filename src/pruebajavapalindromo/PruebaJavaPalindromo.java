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
public class PruebaJavaPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabras[] = {"anA","cAfe","SalmOn","SomeTemos","Luz azul","Segovia","MiSmo","orden","Seres"};
        Palindromo palindromo = new Palindromo();
        System.out.println(palindromo.encontrarPalindromos(palabras));
    }
    
}
