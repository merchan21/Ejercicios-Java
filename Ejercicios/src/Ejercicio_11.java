import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Programa que emule una calculadora básica. Esta puede realizar las operaciones de: suma, resta, multiplicación
y división. El programa debe recibir como entrada 2 números (validar como enteros y positivos) y el operador,
que puede ser +, -, * o /. La salida del programa debe ser el resultado de la operación.
 * @author ronald
 */
public class Ejercicio_11 {
    public static void main(String[] args) throws Exception {
        menu();
    }

    // Metodo de selecciona la operacion que desea ejecutar e ingreso de los valores
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * * * * * * * * * ¿QUE DESEA HACER? * * * * * * * * * * *");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n");
        String valorMenu = scanner.nextLine();
        if (validarMenu(valorMenu)) {
            System.out.println("===== Seleccionaste " + valorMenu + " =====");
            System.out.println("Ingrese primer valor");
            String valorUno = scanner.nextLine();
            System.out.println("Ingrese segundo valor");
            String valorDos = scanner.nextLine();
            validarValores(valorUno, valorDos, valorMenu);
        } else {
            System.out.println("Valor de entrada no valido.. Intenta nuevamente\n");
            menu();
        }
        scanner.close();
    }

    // Metodo de validacion del los numeros ingresados
    public static void validarValores(String valorUno, String valorDos, String valorMenu) {
        try {
            if (!valorUno.isEmpty() && !valorDos.isEmpty()) { // Valida de que existan los valores
                int primerNumero = Integer.parseInt(valorUno);
                int segundoNumero = Integer.parseInt(valorDos);
                int numeroMenu = Integer.parseInt(valorMenu);
                if (primerNumero >= 0 && segundoNumero >= 0) { // Valida que los valores ingresados no sean negativos
                    calcularOperacion(primerNumero, segundoNumero, numeroMenu);
                } else {
                    System.out.println("No se aceptan valores negativos.. Intenta nuevamente!!");
                    menu();
                }
            } else {
                System.out.println("Uno de los campos quedo vacio... Vuelve a intentarlo!!");
                menu();
            }
        } catch (Exception e) { // Captura la excepcion en caso de no ser el formato correcto
            System.out.println("No se admite este formato... Vuelve a intentarlo!");
            menu();
        }
    }

    // Metodo que calcula la operacion asignada
    public static void calcularOperacion(int valorUno, int valorDos, int numeroMenu) {
        int resultado = 0;
        switch (numeroMenu) {
            case 1:
                resultado = valorUno + valorDos;
                mostrarResultado(valorUno, valorDos, resultado, " + ");
                break;
            case 2:
                resultado = valorUno - valorDos;
                mostrarResultado(valorUno, valorDos, resultado, " - ");
                break;
            case 3:
                resultado = valorUno * valorDos;
                mostrarResultado(valorUno, valorDos, resultado, " * ");
                break;
            case 4:
                resultado = valorUno / valorDos;
                mostrarResultado(valorUno, valorDos, resultado, " / ");
                break;
            default:
                break;
        }
    }

    // valida si el numero ingresado en el menu es valido
    public static boolean validarMenu(String valorMenu) {
        Pattern pattern = Pattern.compile("^[1234]{1}$");
        Matcher matcher = pattern.matcher(valorMenu);
        return matcher.find();
    }

    // Metodo que imprime el resultado por pantalla
    public static void mostrarResultado(int valorUno, int valorDos, int resultado, String signo) {
        System.out.println("----- RESULTADO DE LA OPERACION " + valorUno + signo + valorDos + " -----");
        System.out.println(valorUno + signo + valorDos + " = " + resultado);
    }
}
