// Escribe un programa que lea 10 números 
// por teclado y que luego los muestre
// en orden inverso, es decir, el primero 
// que se introduce es el último en mostrarse
// y viceversa.

public class V704 {

    public static void main(String[] args){

        int[] num = new int[10];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 6;
        num[6] = 7;
        num[7] = 8;
        num[8] = 9;
        num[9] = 10;

        for (int i = 9; i >= 0; i--) {
            System.out.println("simbolo[" + i + "]: " + num[i]);
        }
    }
    
}
