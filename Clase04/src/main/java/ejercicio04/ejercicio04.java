package ejercicio04;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();

        String periodo;

        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Número fuera de rango";
        }

        System.out.println("El periodo es: " + periodo);
        scanner.close();
    }
}
