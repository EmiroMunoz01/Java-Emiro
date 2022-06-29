// Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
// convertir deberá estar almacenada en una variable.


import java.util.Scanner;

public class V5 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pesetas: ");
        double pesetas = dato.nextDouble();

        double euros = (pesetas * 1 / 166.386);
        System.out.println("La conversión es: "+euros+" euros");

        
    }
}
