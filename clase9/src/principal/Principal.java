package principal;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        
        // salida de datos
        System.out.println("Tu nombre es "+nombre);
        System.out.println("Tu edad es "+edad);
    }
    
}
