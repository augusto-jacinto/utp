package ejercicio03;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (1-6): ");
        int numero = scanner.nextInt();

        String numeroIngles;

        switch (numero) {
            case 1:
                numeroIngles = "One";
                break;
            case 2:
                numeroIngles = "Two";
                break;
            case 3:
                numeroIngles = "Three";
                break;
            case 4:
                numeroIngles = "Four";
                break;
            case 5:
                numeroIngles = "Five";
                break;
            case 6:
                numeroIngles = "Six";
                break;
            default:
                numeroIngles = "Número fuera de rango";
        }

        System.out.println("El número en inglés es: " + numeroIngles);
        scanner.close();
    }
}
