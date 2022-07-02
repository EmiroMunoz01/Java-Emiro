// Escribe un programa que nos diga el horóscopo 
// a partir del día y el mes de nacimiento.

import java.util.Scanner;

public class V410 {
    public static void main(String[] args){

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el numero del día: ");
        int dia = ingreso.nextInt();

        System.out.println("Ingrese el numero del mes: ");
        int mes = ingreso.nextInt();

        if (mes == 3 || mes == 4 ){
            if (mes == 3){
                if (dia > 21){
                    System.out.println("Su signo es: Aries");
                }
            }
            else{
                if (dia <= 19){
                    System.out.println("Su signo es: Aries");
                }
            }
        }
        else if (mes == 4 || mes == 5){
            if (mes == 4){
                if (dia > 19){
                    System.out.println("Su signo es: Tauro");
                }
            }
            else{
                if (dia <= 21){
                    System.out.println("Su signo es: Tauro");
                }
            }
        }
        else if (mes == 5 || mes == 6){
            if (mes == 5){
                if (dia >= 21){
                    System.out.println("Su signo es: Géminis");
                }
            }
            else{
                if (dia <= 20){
                    System.out.println("Su signo es: Géminis");
                }
            }
        }
        else if (mes == 6 || mes == 7){
            if (mes == 6){
                if (dia >= 21){
                    System.out.println("Su signo es: Cáncer");
                }
            }
            else{
                if (dia <= 22){
                    System.out.println("Su signo es: Cáncer");
                }
            }
        }
        else if (mes == 7 || mes == 8){
            if (mes == 7){
                if (dia >= 23){
                    System.out.println("Su signo es: Leo");
                }
            }
            else{
                if (dia <= 22){
                    System.out.println("Su signo es: Leo");
                }
            }
        }
        else if (mes == 8 || mes == 9){
            if (mes == 8){
                if (dia >= 23){
                    System.out.println("Su signo es: Virgo");
                }
            }
            else{
                if (dia <= 22){
                    System.out.println("Su signo es: Virgo");

                }
            }
        }
        else if (mes == 9 || mes == 10){
            if (mes == 9){
                if (dia >= 23){
                    System.out.println("Su signo es: Libra");
                }
            }
            else{
                if (dia <= 22){
                    System.out.println("Su signo es: Libra");
                }
            }
        }
        else if (mes == 10 || mes == 11){
            if (mes == 10){
                if (dia >= 23){
                    System.out.println("Su signo es: Escorpio");
                }
            }
            else{
                if (dia <= 21){
                    System.out.println("Su signo es: Escorpio");
                }
            }
        }
        else if (mes == 11 || mes == 12){
            if (mes == 11){
                if (dia >= 22){
                    System.out.println("Su signo es: Sagitario");
                }
            }
            else{
                if (dia <= 21){
                    System.out.println("Su signo es: Sagitario");
                }
            }
        }
        else if (mes == 12 || mes == 1){
            if (mes == 12){
                if (dia >= 22){
                    System.out.println("Su signo es: Capricornio");
                }
            }
            else{
                if (dia <= 19){
                    System.out.println("Su signo es: Capricornio");
                }
            }
        }
        else if (mes == 1 || mes == 2){
            if (mes == 1){
                if (dia >= 20){
                    System.out.println("Su signo es: Acuario");
                }
            }
            else{
                if (dia <= 19){
                    System.out.println("Su signo es: Acuario");
                }
            }
        }
        else {
            if (mes == 2){
                if (dia >= 19){
                    System.out.println("Su signo es: Piscis");
                }
            }
            else{
                if (dia <= 20){
                    System.out.println("Su signo es: Piscis");
                }
            }
        }
    }
}
