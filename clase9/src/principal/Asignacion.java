package principal;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Asignacion {
    private Estudiante[] estudiantes;
    private double[] notas_matematica;
    private double[] notas_socicales;
    
    private Scanner input = new Scanner(System.in);
    
    public Asignacion(int size) {
        // inicializamos nuestras variables
        this.estudiantes = new Estudiante[size];
        this.notas_matematica = new double[size];
        this.notas_socicales = new double[size];
        
        // llenamos nuestros arreglos con las respectivas variables
        for (int i = 0; i < size; i++) {
            this.estudiantes[i] = new Estudiante(
                    // creamos un nuevo estudiante y enviamos su nombre y apellido
                    this.inputWithMessage("Ingrese el nombre del estudiante"),
                    this.inputWithMessage("Ingrese el apellido del estudiante")
            );
            // para cada arreglo double verificamos que sea un double
            this.notas_matematica[i] = this.checkDouble("Ingrese la nota de matematicas");
            this.notas_socicales[i] = this.checkDouble("Ingrese la nota de sociales");
        }
    }
    
    private String inputWithMessage(String msg) {
        // muestra un mensaje por consola y retorna el valor ingresado por el usuario
        System.out.println(msg);
        return this.input.nextLine();
    }
    
    private double checkDouble(String msg) {
        // verificamos que la entrada del usuario se trate de un doble respectivamente
        // usamos una excepcion por si el usuario ingresa un valor diferente a double
        // segimos preguntando hasta que obtengamos el resultado esperado
        while (true) {
            try {
                return Double.parseDouble(this.inputWithMessage(msg));
            } catch (NumberFormatException e) {
                // System.err.println(e);
                System.out.println("Ingrese un numero");
            }
        }
    }
    
    public double getPromedio(double[] arr) {
        // obtenemos el promedio de un arreglo en especifico
        double res = 0;
        for (double a: arr) res += a;
        return res/arr.length;
    }
    
    public String estudianteToString() {
        // juntamos todos los estudiantes para mostrar sus datos
        String res = "";
        for (int i = 0; i < this.estudiantes.length; i++) {
            res += String.format(
                    "%s\n"
                    + "\tMatematica: %.2f\n"
                    + "\tSociales: %.2f\n"
                    + "\tPromedio: %.2f\n",
                    this.estudiantes[i].toString(),
                    this.notas_matematica[i],
                    this.notas_socicales[i],
                    (this.notas_matematica[i]+this.notas_socicales[i])/2
            );
        }
        return res;
    }

    @Override
    public String toString() {
        // mostramos el reporte final
        return String.format("REPORTE FINAL\n\n"
                + "Lista de Estudiante\n\n"
                + "%s"
                + "Promedios Generales\n\n"
                + "Promedio de Matematicas %.2f\n"
                + "Promedio de Sociales %f.2\n",
                this.estudianteToString(),
                this.getPromedio(this.notas_matematica),
                this.getPromedio(this.notas_socicales));
    }
    
    
}
