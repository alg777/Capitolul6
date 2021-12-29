package com.itfactory.mostenire;

public class IngrijirePersonala extends Produs{
    boolean returnabil;

    public IngrijirePersonala(String numeProdus, double pret, int discount, boolean returnabil) {
        super(numeProdus, pret, discount);
        this.returnabil = returnabil;
    }
    //getter returnabil


    public boolean getReturnabil() {
        return returnabil;
    }
}
