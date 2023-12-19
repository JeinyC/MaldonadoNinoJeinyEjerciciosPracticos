package modelPackage;

public class Mamifero extends Animal{
    private int numPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoComida, int numPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoComida);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Mamifero() {

    }

    public void saludar() {
        System.out.println("Hola, soy un Mamifero");
    }
}
