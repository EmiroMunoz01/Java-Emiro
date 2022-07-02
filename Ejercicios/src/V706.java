import java.util.Scanner;
//importamos esta libreria para hacer uso del Scanner
public class V706 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[10];

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        //importamos Integer.MIN_VALUE y MAX_VALUE para establecerlos en variables
        //para usarlos en el ciclo y determinar si el valor es max o min en nuestro arreglo
        int i;

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");


        for (i = 0; i < 10; i++) {

            int a = scanner.nextInt();
            
            numero[i] = a;
            //como declaramos la lectura de la variable a dentro del for, este se ira renovando
            //a medida que corre el ciclo.

            //se hace la equivalencia en numero[i] para ir rellenando el arreglo a medida que
            //este avanza
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }

        }
            System.out.println();

        for (i = 0; i < 10; i++) {

            System.out.print(numero[i]);

            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }

            System.out.println();
        }
            
    }
}
