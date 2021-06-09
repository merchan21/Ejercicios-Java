
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronal
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
        Scanner piramide=new Scanner(System.in);
        System.out.print("Ingresa Numero de fila:");
        int filas = piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for (int alto=1; alto <= filas; alto++){
        
            for(int espacio = 1; espacio <= filas-alto; espacio++){
                System.out.print(" ");
            }
            
            for(int asteriscos=1; asteriscos <=(alto*2)-1; asteriscos++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    
    
   }    
}
