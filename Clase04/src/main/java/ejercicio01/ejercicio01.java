package ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (1-5): ");
        int numero = scanner.nextInt();

        String palabra;

        switch (numero) {
            case 1:
                palabra = "Uno";
                break;
            case 2:
                palabra = "Dos";
                break;
            case 3:
                palabra = "Tres";
                break;
            case 4:
                palabra = "Cuatro";
                break;
            case 5:
                palabra = "Cinco";
                break;
            default:
                palabra = "Número fuera de rango";
        }

        System.out.println("El número ingresado es: " + palabra);
        scanner.close();
    }
}
