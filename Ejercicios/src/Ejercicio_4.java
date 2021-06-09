import java.util.Scanner;
/*
Realice un programa que dibuje un triángulo de n filas, empleando el carácter asterisco (*). Por ejemplo para n = 4
@author ronald
 */


public class Ejercicio_4 {
    
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
