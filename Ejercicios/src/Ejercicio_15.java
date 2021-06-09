import java.time.LocalDate;
import java.util.Scanner;

/*
Programa que permita el ingreso de dos valores numéricos: El primero representa el MES (validar) y el segundo
el DÍA del mes (validar el DÍA en base al Mes ingresado. Asuma que se trata de un año No Bisiesto). Muestre a
que “día del año” corresponde la fecha ingresada. Ejemplos:
Fecha: Enero 25 Corresponde al “día del año” 25
Fecha: Febrero 9 Corresponde al “día del año” 40
Fecha: Marzo 1 Corresponde al “día del año” 59
Fecha: Diciembre 25 Corresponde al “día del año” 359
 * @author ronal
 */
public class Ejercicio_15 {
    public static void main(String[] args) throws Exception {
        entradaDia();
    }

    // Metodo de entrada del dia del año
    public static void entradaDia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n* * * * * * OBTENER DIA Y MES DE UN AÑO NO BISIESTO * * * * * * *");
        System.out.println("Ingrese numero del dia del anio: ");
        String diaAnio = scanner.nextLine();
        validarDia(diaAnio);
        scanner.close();
    }

    // Metodo de validacion del dia ingresado
    public static void validarDia(String dia) {
        try {
            if (!dia.isEmpty()) { // Valida que no se aya ingresado un valor vacio
                int diaAnio = Integer.parseInt(dia);
                if (diaAnio >= 1 && diaAnio <= 365) { // valida que el dia ingresado este dentro del rango
                    calcularMesDia(diaAnio);
                } else {
                    System.out.println("El dia tiene que estar entre 1 y 365.. Intenta nuevamente!!\n");
                    entradaDia();
                }
            } else {
                System.out.println("Los campos no puenden quedar vacios... Intenta nuevamente!\n");
                entradaDia();
            }
        } catch (Exception e) {// Captura la excepcion en caso de no ser el formato correcto
            System.out.println("No se admite este formato... Intenta nuevamente!\n");
            entradaDia();
        }
    }

    // Calcula el mes y dia del numero ingresado por el usuario
    public static void calcularMesDia(int dia) {
        String[] MesdiaArray;
        LocalDate date = LocalDate.of(2019, 1, 1);
        LocalDate newDate = date.plusDays(dia - 1);
        MesdiaArray = String.valueOf(newDate).split("-");
        String mes = getMes(Integer.parseInt(MesdiaArray[1]));
        mostrarFecha(dia, mes, Integer.parseInt(MesdiaArray[2]));
    }

    // Este metodo recupera el mes en tipo cadena de texo
    public static String getMes(int mes) {
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        return meses[mes - 1];
    }

    // Muestra la fecha de un dia ingresado por el usuario en un año no bisiesto
    public static void mostrarFecha(int dia, String mes, int diaMes) {
        System.out.println("------------------ RESULTADO ------------------");
        System.out.println("\nEl Dia " + dia + " Corresponde a: " + mes + " " + diaMes);
    }
    
}
