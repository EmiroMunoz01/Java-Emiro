// Escribe un programa que calcule el total de una factura a partir de la base
// imponible (precio sin IVA). La base imponible estará almacenada en una
// variable.
//IVA del 19%

public class V6 {
    public static void main(String[] args){

        double iva = 0.19;
        double base = 10000;
        
        double total = base * 1.19;
        System.out.println("Total: " + total);
    }
}
