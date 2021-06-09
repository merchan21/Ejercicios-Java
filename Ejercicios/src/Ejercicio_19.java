import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
. Escriba un programa que determine si un carácter ingresado es letra, número, o ninguno de los dos. En caso que
sea letra, determine si es mayúscula o minúscula. (consultar tabla ASCII).

 * @author ronal
 */
public class Ejercicio_19 {
    public static void main(String[] args) throws Exception {
        entradaCaracter();
    }

    // Metodo de entrada del caracter
    public static void entradaCaracter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Ingrese un caracter:");
        String caracter = scanner.nextLine();
        validarEntrada(caracter);
        scanner.close();
    }

    // Metodo de validacion del caracter ingresado
    public static void validarEntrada(String caracter) {
        if (caracter.length() == 1) { // valida que solo se ingrese un caracter
            String resultado = ValidarCaracter(caracter);
            mostrarResultado(resultado);
        } else {
            System.out.println("Debes ingresar un caracter... Intenta nuevamente!");
            entradaCaracter();
        }
    }

    // Metodo que retorna mediante una expresion regular si es letra o un numero
    public static String ValidarCaracter(String caracter) {
        String characterValue = "NO ES NUMERO NI LETRA";
        Pattern numero = Pattern.compile("[0-9]");
        Pattern letraMinuscula = Pattern.compile("[a-z]");
        Pattern letraMayuscula = Pattern.compile("[A-Z]");
        Matcher numeroMatcher = numero.matcher(caracter);
        Matcher letraMinMatcher = letraMinuscula.matcher(caracter);
        Matcher letraMayMatcher = letraMayuscula.matcher(caracter);
        if (numeroMatcher.find()) {
            characterValue = "ES UN NUMERO";
        } else if (letraMinMatcher.find()) {
            characterValue = "ES UNA LETRA MINUSCULA";
        } else if (letraMayMatcher.find()) {
            characterValue = "ES UNA LETRA MAYUSCULA";
        }
        return characterValue;
    }

    // Metodo que imprime si es letra o numero
    public static void mostrarResultado(String valor) {
        System.out.println("\n------------------¿ES LETRA O NUMERO?------------------");
        System.out.println("El caracter " + valor);
    }
    
}
