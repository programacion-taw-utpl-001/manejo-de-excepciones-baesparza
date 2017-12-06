package principal;

import java.util.Scanner;


/**
 *
 * @author baesparza
 */
public class Exception {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        while (true) {
            System.out.println("Ingrese un numero");
            num1 = input.nextInt();
            System.out.println("Ingrese un numero diferente de 0");
            num2 = input.nextInt();
            try {
                num3 = num1/num2;
                System.out.println("Resultado de la division: "+num3);
                break;
            } catch(ArithmeticException e) {
                System.err.println(e);
                // throw e;
            }
        }*/
        Asignacion a = new Asignacion(4);
        System.out.println(a.toString());
        
    }
    
}