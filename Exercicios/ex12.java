/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
      
      System.out.println("Informe o primeiro valor: ");
      String valor1 = teclado.next().replace("," , "." );
      
      System.out.println("Informe o segundo valor: ");
      String valor2 = teclado.next().replace("," , "." );
      
      System.out.println("Informe o terceiro valor: ");
      String valor3 = teclado.next().replace("," , "." );
      
        
    double num1 = Double.parseDouble(valor1);
    double num2 = Double.parseDouble(valor2);
    double num3 = Double.parseDouble(valor3);
    
    double media = (num1+num2+num3) / 3;
    
        System.out.println("A média dos três números é: "+media);
}
