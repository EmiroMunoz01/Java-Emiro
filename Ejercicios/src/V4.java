// Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
// convertir deberá estar almacenada en una variable.

import java.util.Scanner;
public class V4 {
    public static void main(String[] args){

        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros: ");
        Double euros = dato.nextDouble();

        double pesetas = (euros * 166.386 / 1);

        System.out.println("La conversión es: "+pesetas+" pesetas");


        

    }
}
