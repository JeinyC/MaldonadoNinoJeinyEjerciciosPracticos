package com.mycompany.restaurante;

import com.mycompany.restaurante.models.Platillos;
import com.mycompany.restaurante.persistence.ControladoraPersistencia;
import java.util.List;

public class Restaurante {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Platillos platillo0 = new Platillos("Patatas", "reseta1", 4);
        Platillos platillo1 = new Platillos("Pulpitos", "reseta2", 8);
        Platillos platillo2 = new Platillos("Olivas", "reseta3", 2);
        
        controlPersis.crearPlatillo(platillo0);
        controlPersis.crearPlatillo(platillo1);
        controlPersis.crearPlatillo(platillo2);
        
        controlPersis.eliminarPlatillo(1);
        platillo2.setNombre("Pistacho");
        controlPersis.modificarPlatillo(platillo2);
        
        
        List<Platillos> listaPlatillos = controlPersis.traerPlatillos();
        System.out.println("-- Lista del restaurante --");
        for (Platillos platillo : listaPlatillos) {
            System.out.println(platillo.toString());
        }
    }
}
