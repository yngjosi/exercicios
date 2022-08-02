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
        opçao = JOptionPane.showInputDialog("Escolha a alternativa desejada baseada no exercício:"
                + "\n1 - Letra A"
                + "\n2 - Letra B"
                + "\n3 - Letra C"
                + "\n4 - Letra D");
        int opt;
        opt = Integer.parseInt(opçao);
        
        if (opt == 1);{
                String n1;
        String n2;
        String n3;
        String n4;
        String n5;
        String n6;
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
n3 = JOptionPane.showInputDialog("Digite o Terceiro Número");


                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        double numero3 = Double.parseDouble(n3);
                        
                        double resultado = -numero1 + numero2 * numero3;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 2 );{
                String n1;
        String n2;
        String n3;
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
                n3 = JOptionPane.showInputDialog("Digite o Terceiro Número");

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        double numero3 = Double.parseDouble(n3);
                        
                        double resultado = (numero1 + numero2) % numero3;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 3 );{
                String n1;
        String n2;
        String n3;
        String n4;
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
                n3 = JOptionPane.showInputDialog("Digite o Terceiro Número");
                n4 = JOptionPane.showInputDialog("Digite o Quarto Número");
                

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        double numero3 = Double.parseDouble(n3);
                        double numero4 = Double.parseDouble(n4);
                        
                        double resultado = numero1 + -numero2 * numero3 / numero4;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
                   
    }
    if (opt == 4 );{
                String n1;
        String n2;
        String n3;
        String n4;
        String n5;
        String n6;
        n1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
                n2 = JOptionPane.showInputDialog("Digite o Segundo Número");
                n3 = JOptionPane.showInputDialog("Digite o Terceiro Número");
                n4 = JOptionPane.showInputDialog("Digite o Quarto Número");
                n5 = JOptionPane.showInputDialog("Digite o Quinto Número");
                n6 = JOptionPane.showInputDialog("Digite o Sexto Número");
                

                        double numero1 = Double.parseDouble(n1);
                        double numero2 = Double.parseDouble(n2);
                        double numero3 = Double.parseDouble(n3);
                        double numero4 = Double.parseDouble(n4);
                        double numero5 = Double.parseDouble(n5);
                        double numero6 = Double.parseDouble(n6);
                        
                        double resultado = numero1 + numero2 / numero3 * numero4 - numero5 % numero6;
                        String res;
                                res = "O resultado da operação é: "+resultado;
                                JOptionPane.showConfirmDialog(null, res);
    }
                   
    
  
 
