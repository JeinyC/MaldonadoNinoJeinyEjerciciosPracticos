package modelPackage;

public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }
    public void mensaje(){
        System.out.println("Estos pantalones son de marca: " + getMarca());
    }
}
