// Realiza un programa que resuelva una ecuación 
// de segundo grado (del tipo ax2 + bx + c = 0).
import java.util.Scanner;
public class V49 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa resolvera ecuaciones de segundo grado");
        System.out.println("Ecuaciones del tipo ax2 + bx + c = 0");

        System.out.println("Ingrese el valor de a: ");
        int a = entrada.nextInt();   

        System.out.println("Ingrese el valor de b: ");
        int b = entrada.nextInt();    

        System.out.println("Ingrese el valor de c: ");
        int c = entrada.nextInt();    

        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }
        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no tiene solución.");
            }
            // ax^2 + bx + 0 = 0 con a y b distintos de 0
        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }
            // 0x^2 + bx + c = 0 con b y c distintos de 0
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }
            // ax^2 + bx + c = 0 con a, b y c distintos de 0
        if ((a != 0) && (b != 0) && (c != 0)) {
            double discriminante = b*b - (4 * a * c);
            if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
            } 
            else {
            System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
            }
        }
            
            
            


    }
}
