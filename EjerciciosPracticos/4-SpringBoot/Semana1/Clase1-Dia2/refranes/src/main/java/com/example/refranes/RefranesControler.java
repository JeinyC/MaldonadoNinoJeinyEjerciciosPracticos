package com.example.refranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RefranesControler {

    @GetMapping
    public String refran(){
        String[] refranes = {
                "No hay mal que por bien no venga",
                "Al que madruga Dios lo ayuda",
                "Más vale tarde que nunca",
                "A caballo regalado no se le mira el dentado",
                "Tirar una cana al aire"
        };

        Random random = new Random();
        int indiceAleatorio = random.nextInt(refranes.length);

        return refranes[indiceAleatorio];
    }
}


