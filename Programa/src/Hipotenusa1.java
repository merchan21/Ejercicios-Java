import java.util.Scanner;
/**
 *
 * @author ronal
 */
public class Hipotenusa1 {

   public static void main(String[]args){
        
    double cateto1, cateto2;
    Scanner sc=new Scanner(System.in);
        System.out.print("introduce el valor del cateto 1");
        cateto1=sc.nextDouble();
        System.out.print("introduce el valor del cateto 2");
        cateto2=sc.nextDouble();
        
        System.out.print("La hipotenusa es"+Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2)));
        
    }
    
}
