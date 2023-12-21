package modelPackage;

import interfacePackage.Combustion;

public class Camioneta extends Vehiculo implements Combustion {

    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Camioneta -> " +
                "| capacidadTanque:" + capacidadTanque +
                "| consumoCombustible:" + consumoCombustible;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible");
    }

    @Override
    public void calcularAntiguedad() {
        System.out.println("La camioneta tiene una antiguedad de : " + (2023-getAnio()));
    }
}
