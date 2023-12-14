package modelPackage;

public class Electrodomestico {

    int cod;
    String marca;
    int modelo;
    int consumo;
    String color;

    public Electrodomestico() {

    }

    public Electrodomestico(int cod, String marca, int modelo, int consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico -> " +
                " Marca = " + marca + " |" +
                " Modelo = " + modelo + " |" +
                " Consumo = " + consumo + " |";
    }
}
