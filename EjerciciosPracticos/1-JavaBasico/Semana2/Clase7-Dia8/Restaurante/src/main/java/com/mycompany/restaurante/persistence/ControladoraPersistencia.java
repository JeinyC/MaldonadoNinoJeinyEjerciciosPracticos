package com.mycompany.restaurante.persistence;

import com.mycompany.restaurante.models.Platillos;
import com.mycompany.restaurante.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatillosJpaController platilloJpa = new PlatillosJpaController();

    public void crearPlatillo(Platillos platillo) {
        platilloJpa.create(platillo);
    }

    public void eliminarPlatillo(int id) {
        try {
            platilloJpa.destroy(id);
            System.out.println("Platillo con ID " + id + " eliminado exitosamente.");
        } catch (NonexistentEntityException e) {
            System.err.println("Error al intentar eliminar el platillo con ID " + id + ": " + e.getMessage());
        }
    }

    public void modificarPlatillo(Platillos platillo) {

        try {
            platilloJpa.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Platillos> traerPlatillos () {
      return platilloJpa.findPlatillosEntities();
  }

}
