package MethodVariables;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;


    @Test
    public void metodaTest(){
        dateMasina("Audi", "RS6", 2020);
        dateMasina("VW", "Arteon", 2022);

        calculMedie(7.6 , 9.2);
        calculMedie(6.0, 8.5);
    }


    public void dateMasina(String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masini este: " + marca);
        System.out.println("Modelul masini este: " + model);
        System.out.println("An farbricatie este: " + anFabricatie);
    }

    //calculam media la 2 numere

    public void calculMedie(Double nota1, Double nota2){
        Double medie = (nota1 + nota2)/2;
        System.out.println("Media celor 2 note este: " + medie);

    }
}
