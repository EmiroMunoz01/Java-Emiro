// Vamos a ampliar uno de los ejercicios 
// de la relación anterior para considerar
// las horas extras. Escribe un programa 
// que calcule el salario semanal de un
// trabajador teniendo en cuenta que las 
// horas ordinarias (40 primeras horas de
// trabajo) se pagan a 12 euros la hora. 
// A partir de la hora 41, se pagan a 16 euros
// la hora.

import java.util.Scanner;

public class V44 {
    public static void main(String[] args){

        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese las horas laboradas: ");
        double horas = dato.nextDouble();

        if (horas <= 40){
            double total = horas * 12;
            System.out.println("Su pago es de: "+total+" euros");

        }
        else{

            double base = horas - 40;
            double total = (base * 16) + 480;
            System.out.println("Su pago es de: "+total+" euros");

        }

    }
}
