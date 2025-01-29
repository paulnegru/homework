package MethodVariables;

import org.testng.annotations.Test;

import java.util.Scanner;

public class AlternativeStructures {

    /*
    Structuri alternative = if - then - else; switch-case
    if-then-else:

     */

    @Test
    public void testMethod(){

//        checkNumberMethod(15);
//        checkNumberMethod(3);
//        checkNumberMethod(5);

//        checkValueNumberMethod(8);
//        checkValueNumberMethod(-5);
//        checkValueNumberMethod(9);
//        checkValueNumberMethod(-12);
//        checkValueNumberMethod(0);

//        weekDays(3);

//        readNotes();

//        printValues();
//
//        printValuesWithDoWhile();

        printValueWithFor();

    }

    // verificam un numar mai mare decat 5 'if'
    public void checkNumberMethod(int val){
        if (val>5){
            System.out.println("Nr " + val + " este mai mare decat 5");
        } else if (val<5){
            System.out.println("Nr " + val + " este mai mic decat 5");
        } else {
            System.out.println("Nr " + val + " este egal 5");
        }
    }

    //verificam daca un numar este pozitiv sau negativ par sau impar if-else
    public void checkValueNumberMethod(int number){

        if (number>0){
            if (number%2==0){
                System.out.println("Nr " + number + " este par pozitiv");
            } else {
                System.out.println("Nr " + number + " este impar pozitiv");
            }
        } else if (number<0){
            if (number%2==0){
                System.out.println("Nr " + number + " este par negativ");
            } else {
                System.out.println("Nr " + number + " este impar negativ");
            }
        } else if (number==0){
            System.out.println("numarul este 0");
        }

    }

    //exemplu switch-case
    public void weekDays(Integer day){
        switch (day){
            case 1:
                System.out.println("Azi e luni");
                break;
            case 2:
                System.out.println("Azi e marti");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break;
            case 4:
                System.out.println("Azi e joi");
                break;
            case 5:
                System.out.println("Azi e vineri");
                break;
            case 6:
                System.out.println("Azi e sambata");
                break;
            case 7:
                System.out.println("Azi e duminica");
                break;
            default:
                System.out.println("Nu mai sunt cazuri");
        }
    }

    //while loop
    public void readNotes(){
        //ca sa putem citi valori din terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o nota:");
        int nota = scanner.nextInt();

        System.out.println("Introdu o nota:");
        while (nota<0||nota>10){
            System.out.println("Nota" + nota + " trebuie sa fie intre 1 si 10. Introdu o valoare corespunzatoare:");
            nota = scanner.nextInt();
        }
        System.out.println("Nota" + nota + " introdusa este valida.");
    }

    public void printValues(){
        int val = 6;
        while (val <= 5){
            System.out.println("Valoarea este: " + val);
            val++;
        }
        System.out.println("val de dupa parcurgerea while este: " + val);
    }

    //do while loop
    public void printValuesWithDoWhile(){
        int inc = 6;
        do {
            System.out.println("Valoarea este: " + inc);
            inc++;
        } while (inc<=5);
        System.out.println("val de dupa parcurgerea do-while este: " + inc);
    }

    //for loop
    public void printValueWithFor(){
        //int val = 1;
        for(int val = 1;val<=5;val++){
            System.out.println("Valoarea este: " + val);
        }

        /*
        var 1:
        for(int val = 1;val<=5;val++){
            System.out.println("Valoarea este: " + val);
        }

        var 2:
        int val = 1;
        for(;val<=5;val++){
            System.out.println("Valoarea este: " + val);
        }

        var 3:
        for(int val = 1;val<=5;){
            System.out.println("Valoarea este: " + val);
            val++;
        }

        var4:
        int val = 1;
        for(;val<=5;){
            System.out.println("Valoarea este: " + val);
            val++;
        }

         */
    }


}
