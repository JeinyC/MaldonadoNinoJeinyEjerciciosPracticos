package com.example.codigomorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
//Descifra palabras y frases ^^
@RestController
public class CodigoMorseController {
    @GetMapping("/descifrar/{code}")
    public String descifrar(@PathVariable String code) {
        HashMap<String, String> morseCodeMap = new HashMap<>();

        morseCodeMap.put(" ", " ");
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");

        morseCodeMap.put("-----", "0");
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
        
        boolean flag = false;

        StringBuilder codigoDescifrado = new StringBuilder();
        for (String x : code.split(" ")) {
            if(x.trim().isEmpty()){
                if (!flag) {
                    codigoDescifrado.append(" ");
                    flag = true;
                }
            }else {
                for (String key : morseCodeMap.keySet()) {
                    if (x.equalsIgnoreCase(key)) {
                        String p = morseCodeMap.get(key);
                        codigoDescifrado.append(p);
                        flag = false;
                    }
                }
            }
        }
        return "Codigo resuelto : " + codigoDescifrado;
    }
}