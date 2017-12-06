package principal;

/**
 *
 * @author baesparza
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    
    Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
    
}
