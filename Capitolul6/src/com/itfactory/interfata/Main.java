package com.itfactory.interfata;

import java.util.Scanner;
// ATENTIE de refacut cu citire TOATE datele persoanei de la tastatura
//si de modificat constructorul sa fie fara parametri, de verificat daca am getters si ?setters
public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Ali", 123456, 7000);
        UnitateBancara banca1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta: ");
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("Persoana nu este eligibila pentru un credit");
        }else if(18<age && age<40){
            banca1= new BancaLocuinte();
            banca1.calcCredit(persoana1);
            banca1.dobCredit(persoana1);
            System.out.println("Credit: "+banca1.calcCredit(persoana1) );
            System.out.println("Dobanda calculata de 5% este: "+banca1.dobCredit(persoana1) );

        }else{
            banca1 = new BancaNevoiPersonale();
            System.out.println("Credit: "+banca1.calcCredit(persoana1) );
            System.out.println("Dobanda calculata de 8% este: "+banca1.dobCredit(persoana1) );

        }


    }
}
