package modelPackage;

public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int tipo;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, String marca, int tipo, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto -> " +
                "codigo=" + codigo +
                " | nombre=" + nombre +
                " | marca=" + marca +
                " | tipo=" + tipo +
                " | precio=" + precio +
                " | stock=" + stock +
                " | ";
    }
}
