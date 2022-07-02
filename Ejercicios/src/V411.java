// Escribe un programa que dada una hora 
// determinada (horas y minutos), calcule
// los segundos que faltan para llegar a la 
// medianoche.
import java.util.Scanner;
public class V411 {
    public static void main(String[] args){
        System.out.println("Usaremos formato de 24 horas");
        System.out.println("Pediremos la hora en partes");
        System.out.println("*******************************");
        System.out.println("Primero ingresar la hora en numero entero");
        System.out.println("Ejemplo, si son las 13:00 ingresar 13");
        System.out.println("*******************************");

        System.out.println("Si son 13:10 ingresar primero el numero 13");
        System.out.println("Y finalmente el número 10 de los minutos");
        System.out.println("*******************************");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas: ");
        int horas = entrada.nextInt();

        System.out.println("*******************************");
        System.out.println("Ingrese el numero de minutos: ");
        int minutos = entrada.nextInt();

        if (minutos == 0){
           
            if (horas <= 17){
                int diferencia = 17 - horas;
                int total = diferencia * 60 * 60;
                System.out.println("Faltan " + total + " segundos para media noche");
            }
            else{
                int diferencia = horas - 17;
                int total = diferencia * 60 * 60;
                System.out.println("Faltan " + total + " segundos para media noche");

            }
        }
        else{
            if (horas <= 17){
                int diferencia = 17 - horas;

                int total = diferencia * 60 * 60 + (minutos * 60);
                System.out.println("Faltan " + total + " segundos para media noche");
            }
            else{
                int diferencia = horas - 17;
                int total = diferencia * 60 * 60 + (minutos * 60);
                System.out.println("Faltan " + total + " segundos para media noche");

            }

        }

    }

    




    
}
