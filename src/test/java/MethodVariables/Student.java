package MethodVariables;

import org.testng.annotations.Test;

import java.util.Dictionary;

public class Student {

    /*
    Clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    intrun fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun
    sa avem mai multe clase cu acelesi nume)
    intro clasa putem defini proprietatile si actiunile entitatii

    Variabila = proprietatea unei clase
    Variabilele pot sa fie de 2 feluri: Globale si Locale

    Variabilele Globale = sunt vizibile peste tot in proiect
    Variabilele Locale = sunt vizibile doar in locul unde sunt declarate

    Ca sa definim o var globala: accesscontrol(public) tip_variabila nume_variabila
    accesscontrol = Public/Private/Protected/Default
    tip_variabila = cum ar intelege calculatorul o anumita variabila pe care o definim.

    in momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    Metoda = este actiunea unei clase
    Exista 2 tipuri de metode: void si return

    Pentru un concept de automation framework sa gandim testele in asa fel incat sa fie independente unele de altele
    Intro clasa sa avem un singur @Test

    Variabile locale: tip_variabila nume_variabila
     */

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

    @Test
    public void prezentareStudent(){
        Nume = "Negru";
        Prenume = "Paul";
        Varsta = 26;
        Adresa = "Anton Pann, Cluj";
        Inaltime = 1.89;
        Greutate = 107.5F;
        Sex = 'M';
        AreDiploma = true;

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa: " + Adresa);
        System.out.println("Inaltimea: " + Inaltime);
        System.out.println("Greutatea: " + Greutate);
        System.out.println("Sexul: " + Sex);
        System.out.println("Are diploma?: " + AreDiploma);

        medieStudent();
        System.out.println(getSalary());

    }

    public void medieStudent(){
        Integer nota1 = 6;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1+nota2+nota3)/3;

        System.out.println("Media studentului este: " + medie);
    }

    //metoda cu return
    public Integer getSalary(){
        Integer salary = 10000;
        return salary;
    }

}
