package programas;
import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        String empleado;
        double ingreso, gasto, ahorrom, ahorroa;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Nombre del empreado: ");
        empleado = sc.next();
        System.out.println("Ingresos del empleado: ");
        ingreso = sc.nextDouble();
        System.out.printf("Gastos del empleado: ");
        gasto = sc.nextDouble();

        ahorrom = ingreso - gasto;
        ahorroa = ahorrom * 12;

        System.out.println("Ahorro mensual: " + ahorrom);
        System.out.println("Ahorro anual: " + ahorroa);
    }
}
