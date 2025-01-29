package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultimiMethod {

    //Multimi: array, list, map

    @Test
    public void testMethod(){

        //courseColleagues();
        //courseColleaguesList();
//        objectCategories();
        tariOrase();
    }

    //exemplu array
    public void courseColleagues(){
        String[] colleagues = new String[6];
        colleagues[0] = "Paul";
        colleagues[1] = "Calin";
        colleagues[2] = "Alin";
        colleagues[3] = "Alex";
        colleagues[4] = "Ana";
        colleagues[5] = "Andrei";
        for (int i=0; i<colleagues.length; i++){
            System.out.println("Colegi sunt: " + colleagues[i]);
        }
    }

    //exemplu lista
    public void courseColleaguesList(){
        List<String> colleagues = new ArrayList<>();
        colleagues.add("Paul");
        colleagues.add("Calin");
        colleagues.add("Alin");
        colleagues.add("Alex");
        colleagues.add("Ana");
        colleagues.add("Andrei");
        int index = 0;
        while (index<colleagues.size()){
            System.out.println("Colegii sunt: " + colleagues.get(index));
            index++;
        }
    }

    //exemplu map
    //map -> cheie = valoare
    //prima chestie din hashmap este cheia, iar a doua reprezinta valoarea
    public void objectCategories(){
        HashMap<String, String> objects = new HashMap<>();
        objects.put("obiect","Laptop");
        objects.put("fruct", "Mar");
        objects.put("floare", "Lalea");
        for(String key: objects.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + objects.get(key));
        }
    }

    //exemplu la o cheie sa fie mai multe valori
    public void tariOrase(){
        HashMap<String, List<String>> clasification = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Alba");
        oraseRomania.add("Zalau");
        oraseRomania.add("Sibiu");
        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Florenta");
        oraseItalia.add("Napoli");
        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Malaga");

        clasification.put("Romania", oraseRomania);
        clasification.put("Italia", oraseItalia);
        clasification.put("Spania", oraseSpania);
        for(String key : clasification.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasification.get(key));
        }

    }

}
