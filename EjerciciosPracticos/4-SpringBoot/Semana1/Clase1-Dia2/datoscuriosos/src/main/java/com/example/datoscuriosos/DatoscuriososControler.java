package com.example.datoscuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class DatoscuriososControler {
    @GetMapping("/datoCurioso")
    public String datooCurioso () {
        ArrayList<String> datosCuriososExistencialismo = new ArrayList<>();

        // Agregar datos curiosos sobre existencialismo
        datosCuriososExistencialismo.add("El existencialismo es una corriente filosófica que destaca la importancia de la existencia individual y la libertad personal.");
        datosCuriososExistencialismo.add("Jean-Paul Sartre, Albert Camus y Søren Kierkegaard son algunos de los principales exponentes del existencialismo.");
        datosCuriososExistencialismo.add("El existencialismo aborda cuestiones como la angustia, la libertad, la responsabilidad y el sentido de la vida.");
        datosCuriososExistencialismo.add("La famosa frase de Sartre 'La existencia precede a la esencia' resalta la idea de que cada individuo define su propio propósito en la vida.");
        datosCuriososExistencialismo.add("El mito de Sísifo, abordado por Camus, explora la idea de encontrar significado en una vida aparentemente absurda.");
        datosCuriososExistencialismo.add("El existencialismo influyó en diversas áreas, incluyendo la literatura, el cine y la psicología.");
        datosCuriososExistencialismo.add("La noción de 'angustia existencial' refleja la ansiedad asociada con la libertad y la responsabilidad de tomar decisiones.");
        datosCuriososExistencialismo.add("La filosofía existencialista aboga por la autenticidad, instando a las personas a vivir de acuerdo con sus valores y elecciones personales.");
        datosCuriososExistencialismo.add("El existencialismo a menudo se asocia con el concepto de 'absurdo', la idea de que la vida carece de un significado intrínseco y que cada individuo debe crear su propio significado.");
        datosCuriososExistencialismo.add("La existencia humana se caracteriza por la 'náusea' según Sartre, una sensación de vértigo al enfrentarse a la libertad y la falta de significado predefinido.");
        Random random = new Random();
        int indiceAleatorio = random.nextInt(datosCuriososExistencialismo.size());

        // Devolver el dato curioso aleatorio
        return datosCuriososExistencialismo.get(indiceAleatorio);
    }
}

