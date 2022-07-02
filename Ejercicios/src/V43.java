// Escribe un programa en que dado un número del 1 a 7 
// escriba el correspondiente nombre del día de la semana.
import java.util.Scanner;

public class V43 {
    public static void main(String[] args){

        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7: ");
        int dia = dato.nextInt();

        if (dia == 1){
            System.out.println("Lunes");
        }
        else if (dia == 2){
            System.out.println("Martes");

        }
        else if (dia == 3){
            System.out.println("Miercoles");

        }
        else if (dia == 4){
            System.out.println("Jueves");

        }
        else if (dia == 5){
            System.out.println("Viernes");

        }
        else if (dia == 6){
            System.out.println("Sabado");

        }
        else if (dia == 7){
            System.out.println("Domingo");

        }

    }
}
