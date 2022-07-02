// Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
// y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
// cuadrado se deben almacenar los cuadrados de los valores que hay en el array
// numero. En el array cubo se deben almacenar los cubos de los valores que hay en
// numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
// columnas.

public class V705 {
    public static void main (String[] args){

        double[] numero = new double[20];
        double[] cuadrado = new double[20];
        double[] cubo = new double[20];


        for (int i = 0; i <= 19; i++) {
            numero[i] = (int)(Math.random() * 20);
        }
        for (int i = 0; i <= 19; i++) {
            cuadrado[i] = Math.pow(numero[i], 2);
            cubo[i] = Math.pow(numero[i], 3);

            System.out.println("Número[" + i + "]: " + numero[i]+", cuadrado es: "+ cuadrado[i] + " y su cubo es: "+ cubo[i]);

        }

    }
}
