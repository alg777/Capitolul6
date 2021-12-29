package com.itfactory.mostenire;

public class Produs {
    private String numeProdus;
    private double pret;
    private int discount;

    public Produs(String numeProdus, double pret, int discount) {
        this.numeProdus = numeProdus;
        this.pret = pret;

        //Verific daca se incadreaza discountul.
        // Daca valoarea nu se incadreaza ramane setat pe 0
        if(discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }
//metoda pt pret final
    public double pretFinal(){ return pret - (pret*discount)/100;}
//getter pt nume, pret, discount
    public String getNumeProdus() {return numeProdus;  }

    public double getPret() {return pret;  }

    public int getDiscount() { return discount;  }
//setter pt discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
