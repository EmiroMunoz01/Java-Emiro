// Realiza un programa que calcule el tiempo que 
// tardará en caer un objeto desde
// una altura h. Aplica la fórmula t =√2h/g
// siendo g = 9.81m/s
import java.util.*;

public class V46 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese la altura desde donde cae el objeto: ");

        double gravedad = 9.81;
        double altura = dato.nextDouble();

        double tiempo = Math.sqrt((2*altura)/gravedad);

        System.out.println("El objeto cae en "+tiempo+" segundos");


    }
}
