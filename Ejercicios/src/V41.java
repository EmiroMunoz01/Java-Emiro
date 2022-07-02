// Escribe un programa que pida por teclado un día de la semana y que diga qué
// asignatura toca a primera hora ese día.

import java.util.Scanner;

public class V41 {

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        

        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = entrada.nextLine();
        dia.toLowerCase(); // convierto a minúsculas todas las letras

        switch(dia){
            
            case "lunes":
            break;

            case "martes":
            break;

            case "miércoles":
            System.out.println("Programación");
            break;

            case "jueves":
            System.out.println("Sistemas Informáticos");
            break;

            case "viernes":
            System.out.println("Bases de Datos");
            break;

            case "sábado":
            break;

            case "domingo":
            System.out.println("¡Ese día no hay clase!");
            break;

            default:
            System.out.println("El día introducido no es correcto.");
            break;
        }

    }

}