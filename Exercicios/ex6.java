/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opçao;
        opçao = JOptionPane.showInputDialog("Escolha a Operação:"
                + "\n1 - Soma"
                + "\n2 - Subtração"
                + "\n3 - Multtiplicação"
                + "\n4 - Divisão"
                + "\n5 - Resto");
        int opt;
        opt = Integer.parseInt(opçao);
        
        if (opt == 1);{
                String n1;
        String n2;
        
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");



                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        
                        
                        double resultado = numero1 + numero2;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 2 );{
                String n1;
        String n2;
      
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
                

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                      
                        
                        double resultado = numero1 - numero2;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 3 );{
                String n1;
        String n2;
       
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
                
                

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        
                        
                        double resultado = numero1 * numero2 ;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 4 );{
                String n1;
        String n2;
   
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
              
                

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                     
                        
                        double resultado = (numero1 % numero2);
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
    }
                   
    
  
 
