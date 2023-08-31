package com.dio.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
    public static <Collection> void main (String[] args){

        System.out.println("Crie um dicionário que relacione os modelos com seus respectivos valores: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("Polo", 14.4);
           put("Onix", 15.6);
           put("HB20", 16.1);
           put("Argo", 14.5);
           put("208", 14.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Subistitua o consumo do Polo por 15.2km/l: ");
        carrosPopulares.put("Polo", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Creta está no dicionário: " + carrosPopulares.containsKey("Creta"));

        System.out.println("Exiba o consumo do Argo: " + carrosPopulares.get("Argo"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        java.util.Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o mais econômico: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);

    }
}
