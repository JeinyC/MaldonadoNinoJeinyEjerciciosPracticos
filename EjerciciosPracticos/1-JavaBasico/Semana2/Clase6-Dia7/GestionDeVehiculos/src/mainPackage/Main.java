package mainPackage;

import modelPackage.Auto;
import modelPackage.Camioneta;
import modelPackage.Moto;
import modelPackage.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculoArrayList = getVehiculos();

        System.out.println();
        System.out.println("-- Vehiculos del sistema --");
        System.out.println();

        for (Vehiculo vehiculo : vehiculoArrayList) {
            if(vehiculo instanceof Auto auto){
                System.out.println(auto);
                auto.calcularAntiguedad();
                auto.cargarEnergia();
                System.out.println("_____________________________________________________________________");
            }
            if(vehiculo instanceof Camioneta camioneta){
                System.out.println(camioneta);
                camioneta.calcularAntiguedad();
                camioneta.recargarCombustible();
                System.out.println("_____________________________________________________________________");
            }
            if(vehiculo instanceof Moto moto){
                System.out.println(moto);
                moto.calcularAntiguedad();
                moto.recargarCombustible();
                System.out.println("_____________________________________________________________________");
            }
        }
    }

    private static ArrayList<Vehiculo> getVehiculos() {

        ArrayList <Vehiculo> vehiculoArrayList = new ArrayList<>();

        Auto autoElectrico = new Auto(1, "ABC123", "Tesla", "Model S", 2020, 80000, 75000, 10);
        Auto autoElectrico1 = new Auto(2, "ABC123", "Tesla", "Model S", 2020, 80000, 75000, 10);
        Auto autoElectrico2 = new Auto(3, "DEF456", "Nissan", "Leaf", 2019, 60000, 65000, 8);

        Camioneta camionetaCombustion = new Camioneta(4, "DEF456", "Toyota", "Hilux", 2019, 40000, 60, 15);
        Camioneta camionetaCombustion1 = new Camioneta(5, "GHI789", "Toyota", "Hilux", 2018, 40000, 60, 15);
        Camioneta camionetaCombustion2 = new Camioneta(6, "JKL012", "Ford", "Ranger", 2017, 45000, 65, 14);


        Moto motoCombustion = new Moto(7, "GHI789", "Honda", "CBR", 2021, 12000, 500, "De 4 tiempos");
        Moto motoCombustion1 = new Moto(8, "MNO345", "Honda", "CBR", 2020, 12000, 500, "De 4 tiempos");
        Moto motoCombustion2 = new Moto(9, "PQR678", "Kawasaki", "Ninja", 2021, 14000, 550, "De 2 tiempos");

        vehiculoArrayList.add(autoElectrico);
        vehiculoArrayList.add(autoElectrico1);
        vehiculoArrayList.add(autoElectrico2);
        vehiculoArrayList.add(camionetaCombustion);
        vehiculoArrayList.add(camionetaCombustion1);
        vehiculoArrayList.add(camionetaCombustion2);
        vehiculoArrayList.add(motoCombustion);
        vehiculoArrayList.add(motoCombustion1);
        vehiculoArrayList.add(motoCombustion2);

        return vehiculoArrayList;
    }
}