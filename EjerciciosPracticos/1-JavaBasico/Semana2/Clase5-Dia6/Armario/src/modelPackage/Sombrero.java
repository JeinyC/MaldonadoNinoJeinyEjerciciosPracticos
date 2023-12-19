package modelPackage;

public class Sombrero extends Vestimenta {
    private int tipo;
    private double tamano;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, int tipo, double tamano) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public void mensaje(){
        System.out.println("Este sombrero es de marca: " + getMarca());
    }
}
