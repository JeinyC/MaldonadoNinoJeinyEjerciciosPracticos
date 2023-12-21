package modelPackage;

import interfacePackage.Combustion;

/*e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion.
Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor.
 Implementa los métodos abstractos de la clase abstracta y los de la interfaz.*/
public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Moto -> " +
                "| cilindrada:" + cilindrada +
                "| tipoMotor:" + tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible");
    }

    @Override
    public void calcularAntiguedad() {
        System.out.println("La moto tiene una antiguedad de : " + (2023-getAnio()));
    }
}
