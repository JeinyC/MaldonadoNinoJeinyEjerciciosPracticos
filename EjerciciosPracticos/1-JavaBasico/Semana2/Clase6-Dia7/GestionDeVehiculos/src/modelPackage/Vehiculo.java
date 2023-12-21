package modelPackage;

public abstract class Vehiculo {
    //Vehiculo con los siguientes atributos:
    // id, placa, marca, modelo, año, costo.
    // Establecer un método abstracto para calcular la antigüedad del vehiculo.

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.costo = costo;
    }

    public Vehiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Informacion -> " +
                "| Id:" + id +
                "| Placa:" + placa +
                "| Marca:" + marca +
                "| Modelo:" + modelo +
                "| Costo:" + costo +
                "| Año:" + anio;
    }

    public abstract void calcularAntiguedad();
}
