package modelPackage;

public class Persona {
    /*
    *     * Crear una clase Persona, que tenga los siguientes atributos: id, nombre,
     * edad, dirección y número de teléfono (tener en cuenta todos sus atributos,
     *  constructores y métodos getters y setters).*/
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int tel;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String direccion, int tel) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTel() {
        return tel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(int tel) {
        this.tel = tel;
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
