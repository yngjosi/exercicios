/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String num1;
 String num2;
 int n1, n2, res;
 
 num1 = javax.swing.JOptionPane.showInputDialog("Informe o primeiro número");
 num2 = javax.swing.JOptionPane.showInputDialog("Informe o segundo número");
 
 n1 = Integer.parseInt(num1);
         n2 = Integer.parseInt(num2);
         
         res = n1/n2;
         javax.swing.JOptionPane.showMessageDialog(null, "O resultado é: "+res,"Resultado da Soma:",javax.swing.JOptionPane.PLAIN_MESSAGE );
System.exit(0);
    }
}