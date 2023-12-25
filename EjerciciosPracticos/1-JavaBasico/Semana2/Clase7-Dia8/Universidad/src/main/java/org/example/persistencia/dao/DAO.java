package org.example.persistencia.dao;

import org.example.model.Estudiante;

import java.sql.*;
import java.util.*;

public class DAO {
    String url = "jdbc:mysql://localhost:3306/universidad"; // URL de la base de datos "clinica"
    String usuario = "root"; // Nombre de usuario de la base de datos
    String contrasenia = ""; // Contraseña de la base de datos
    Connection con = null;

    public Connection getCon() throws Exception {
        this.con = DriverManager.getConnection(this.url, this.usuario, this.contrasenia);
        return con;
    }

    public ArrayList<Estudiante> getEstudiante() throws Exception {

        con = getCon();
        Estudiante estudiante;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        final String GET_DRIVER = "SELECT ID, NOMBRE, EDAD, CALIFICACION FROM UNIVERSIDAD.ESTUDIANTES";

        PreparedStatement statment = con.prepareStatement(GET_DRIVER);
        ResultSet result = statment.executeQuery();

        while (result.next()) {
            estudiante = new Estudiante();
            int id = result.getInt("ID");
            String nombre = result.getString("NOMBRE");
            int edad = result.getInt("EDAD");
            double calificacion = result.getDouble("CALIFICACION");
            estudiante.setId(id);
            estudiante.setNombre(nombre);
            estudiante.setEdad(edad);
            estudiante.setCalificacion(calificacion);
            estudiantes.add(estudiante);
        }
        return estudiantes;
    }

    public void addEstudiante(Estudiante estudiante) throws Exception {

        con = getCon();
        final String ADD_DRIVER = "INSERT INTO ESTUDIANTES (NOMBRE, EDAD, CALIFICACION) VALUES (?,?,?)";

        PreparedStatement statment = con.prepareStatement(ADD_DRIVER);
        statment.setString(1, estudiante.getNombre());
        statment.setInt(2, estudiante.getEdad());
        statment.setDouble(3, estudiante.getCalificacion());
        statment.executeUpdate();
        System.out.println("< Estudiante añadido a la base de datos >");
        con.close();
    }
}

