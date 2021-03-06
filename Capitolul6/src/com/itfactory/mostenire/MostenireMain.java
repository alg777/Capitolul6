package com.itfactory.mostenire;


import com.itfactory.utils.Utils;

public class MostenireMain {
    public static void main(String[] args) {
        Imbracaminte imbracaminte = Utils.citesteImbracaminte();
        switch (imbracaminte.getTipImbracaminte().toLowerCase()) {
            case "pantaloni":
                imbracaminte.setDiscount(10);
                break;
            case "bluza":
                imbracaminte.setDiscount(20);
                break;
            case "accesoriu":
                imbracaminte.setDiscount(30);
                break;
        }
        System.out.println("Pretul produsului de tip imbracaminte este: " + imbracaminte.pretFinal());


        IngrijirePersonala ingrijirePersonala = Utils.citesteProdusDeIngrijirePersonala();
        if (!ingrijirePersonala.getReturnabil()) {
            ingrijirePersonala.setDiscount(20);
        }
        System.out.println("Pretul produsului de tip ingrijire personala este: " + ingrijirePersonala.pretFinal());


        Electronice electronice = Utils.citesteElectronice();
        int voltaj = electronice.getVoltaj();
        if (voltaj >= 220 && voltaj <= 240) {
            System.out.println("Pretul produsului de tip electronice este: " + electronice.pretFinal());
        } else {
            System.out.println("Produsul nu se incadreaza in valori permise pentru voltaj");
        }

    }
}
