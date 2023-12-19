package modelPackage;

public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int tel;

    public Persona(int id, String nombre, int edad, String direccion, int tel) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                " Nombre = " + nombre+
                " Edad = " + edad +
                " Direccion = " + direccion +
                " tel = " + tel;
    }
}
