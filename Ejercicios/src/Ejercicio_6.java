import java.util.Scanner;
/*
 A través de un Programa desarrolle y muestre el resultado de la siguiente fórmula:
S = (1/2) 1+(2/4)2+(3/6) 3 + ...............+ (N/(N*2) N
 * @author ronald
 */
public class Ejercicio_6 {
    
     public static void main(String[] args) throws Exception {
        entradaNumero();
    }

    // Metodo de entrada del valor N de la formula
    public static void entradaNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Ingrese un valor N para la formula:\nS = (1/2) 1+(2/4)2+(3/6) 3 + ...............+ (N/(N*2) N)");
        String N = scanner.nextLine();
        validarN(N);
        scanner.close();
    }

    // Metodo de validacion del numero N
    public static void validarN(String N) {
        try {
            if (!N.isEmpty()) {// valida que no se hayan ingresado datos vacios
                int valorN = Integer.parseInt(N);
                if (valorN > 0) { // valida que no sean numeros negativos
                    mostrarResultado(generarFormula(valorN));
                } else {
                    System.out.println("No se aceptan valores negativos.. intenta nuevamente");
                    entradaNumero();
                }
            } else {
                System.out.println("Entrada Invalida... Intenta nuevamente!");
                entradaNumero();
            }
        } catch (Exception e) { // excepcion que valida si no es un numero
            System.out.println("Formato invalido... Intenta nuevamente!");
            entradaNumero();
        }
    }

    // Genera el resultado de la formula dada
    public static double generarFormula(int valorN) {
        double resultado = 0;
        for (int i = 1; i <= valorN; i++) {
            resultado += (valorN / (double) (valorN + i));
        }
        return resultado;
    }

    // Metodo que muestra el resultado total
    public static void mostrarResultado(double valorS) {
        System.out.println("----------RESULTADO------------");
        System.out.println("El resultado es " + valorS);
    }
    
}
