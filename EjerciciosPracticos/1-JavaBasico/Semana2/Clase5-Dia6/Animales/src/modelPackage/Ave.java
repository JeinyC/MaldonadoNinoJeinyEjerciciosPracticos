package modelPackage;

public class Ave extends Animal{

    private String envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoComida, String envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoComida);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Ave() {
    }

    public void saludar() {
        System.out.println("Hola, soy un Ave");
    }
}
