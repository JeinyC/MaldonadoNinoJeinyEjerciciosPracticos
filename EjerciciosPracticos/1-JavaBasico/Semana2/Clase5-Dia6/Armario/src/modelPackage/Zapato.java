package modelPackage;

public class Zapato extends Vestimenta {
    private String material;
    private int tipoCierre;

    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, int tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public Zapato() {

    }

    public void mensaje(){
        System.out.println("Estos zapatos son de marca: " + getMarca());

    }
}
