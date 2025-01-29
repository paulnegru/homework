package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        readNotes();
    }

    public static void readNotes(){
        //ca sa putem citi valori din terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o nota:");
        int nota = scanner.nextInt();

        while (nota<0||nota>10){
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Introdu o valoare corespunzatoare:");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " introdusa este valida.");
    }
}