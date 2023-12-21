package modelPackage;

import interfacePackage.Electrico;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto() {

    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Auto -> " +
                "| capacidadBateria:" + capacidadBateria +
                "| autonomia:" + autonomia;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Recargando energia electrica");
    }
    @Override
    public void calcularAntiguedad() {
        System.out.println("El auto tiene una antiguedad de : " + (2023-getAnio()));

    }
}
