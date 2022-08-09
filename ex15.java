/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author tackl
 */
public class JavaApplication1 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 100, y = 200;
        
        System.out.println("Antes da troca");
        System.out.println("x =" + x);
                System.out.println("y = " + y);
                
                int temp = x;
                x = y;
                y = temp;
                
                System.out.println("Depois da troca");
                        System.out.println("x = " + x);
                                System.out.println("y = " + y);
                }
              
    }
    
}
