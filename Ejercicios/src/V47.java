// Realiza un programa que calcule la media de tres notas.

import java.util.Scanner;
public class V47 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la nota 1: ");
        double valor_1 = entrada.nextDouble();

        System.out.println("Ingrese la nota 2: ");
        double valor_2 = entrada.nextDouble();

        System.out.println("Ingrese la nota 3: ");
        double valor_3 = entrada.nextDouble();

        double promedio = ((valor_1 + valor_2 + valor_3)/3);

        System.out.println("El promedio de las tres notas es: " + promedio);
    }
}
