import java.text.DecimalFormat;
import java.util.Scanner;
/*
Escriba un programa que permita ingresar la siguiente información: el primer dato representa un valor numérico
y el segundo un valor de tipo cadena que representa la medida (Metros, Decímetros, Pulgadas y Pies). Dicho
programa deberá transformar y mostrar el valor numérico convertido a centímetros
@author ronald
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) throws Exception {
        entradaCentimetros();
    }

    // Metodo de entrada del valor en centimetros
    public static void entradaCentimetros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Ingrese un valor en centimetros: ");
        String centimetros = scanner.nextLine();
        validarCentimetros(centimetros);
        scanner.close();
    }

    // Metodo de validacion del numero ingresado
    public static void validarCentimetros(String centimetrosStr) {
        double metros, decimetros, pulgadas, pies;
        try {
            if (!centimetrosStr.isEmpty()) { // Valida de que exista un valor
                double centimetros = Double.parseDouble(centimetrosStr);
                if (centimetros > 0) { // Valida que el valor ingresado sea mayor a cero
                    metros = centimetros / 100;
                    decimetros = centimetros / 10;
                    pulgadas = centimetros / 2.54;
                    pies = centimetros / 30.48;
                    mostrarConversiones(centimetrosStr, metros, decimetros, pulgadas, pies);
                } else {
                    System.out.println("Por favor ingresa un numero mayor a cero!");
                    entradaCentimetros();
                }
            } else {
                System.out.println("Debes ingresar un numero... Vuelve a intentarlo!");
                entradaCentimetros();
            }
        } catch (Exception e) { // Captura la excepcion en caso de no ser el formato correcto
            System.out.println("No se admite este formato... Vuelve a intentarlo!");
            entradaCentimetros();
        }
    }

    // Metodo imprime los valores ya convertidos en pantalla
    public static void mostrarConversiones(String centimetros, double metros, double decimetros, double pulgadas,
            double pies) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("------------------ CONVERSION DE " + centimetros + "cm ------------------");
        System.out.println("La cantidad en metros es: " + decimalFormat.format(metros) + " Metros");
        System.out.println("La cantidad en decimetros es: " + decimalFormat.format(decimetros) + " Decimetros");
        System.out.println("La cantidad en pulgadas es: " + decimalFormat.format(pulgadas) + " Pulgadas");
        System.out.println("La cantidad en pies es: " + decimalFormat.format(pies) + " Pies");
    }
    
}
