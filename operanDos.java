/**Author: DeltaMurillo **/

import java.util.Scanner;

public class operanDos {
    static double valor1;
    static double valor2;

    public static void main(String[] arg) throws InterruptedException {

        Scanner key = new Scanner(System.in);

        System.out.println("Por favor, escribe el primer numero:");
        valor1 = key.nextDouble();

        System.out.println("Por favor, escribe el segundo numero:");
        valor2 = key.nextDouble();
        operar("suma", valor1, valor2);
        operar("resta", valor1, valor2);
        operar("multiplicacion", valor1, valor2);
        operar("division", valor1, valor2);
    }

    public static double operar(String accion, double op1, double op2) {
        double resultado = 0;
        String infinito = "";
        switch (accion) {
            case "suma":
                 resultado = op1 + op2;
                 break;
            case "resta":
                 resultado = op1 - op2;
                 break;
            case "multiplicacion":
                 resultado = op1 * op2;
                  break;
            case "division":
                if (op2 < 1){
                    infinito = "Infinito. Esto se debe a que tu segundo numero equivale a ";
                    break;}
                else{
                 resultado = op1 / op2;
                 break;}
        }
        System.out.println("La " + accion + " de los dos números es: " + infinito + resultado +"\n");
        return resultado;
    }
}
