package com.itfactory.mostenire;

public class Electronice extends Produs{
    private int voltaj;

    public Electronice(String numeProdus, double pret, int discount, int voltaj) {
        super(numeProdus, pret, discount);
        this.voltaj = voltaj;
    }

//    public void setVoltaj(int voltaj) {
//        if(voltaj!=220 || voltaj!=240) {
//            System.out.println("Voltaj neconform cu reglementarile europene.");
//        }else{
//        this.voltaj = voltaj;}
//    }

    public int getVoltaj() { return voltaj;}
}
