package com.itfactory.interfata;

public class BancaNevoiPersonale implements UnitateBancara{

    @Override
    public double calcCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet()*10;
        return credit;
    }

    @Override
    public double dobCredit(Persoana persoana) {
        double dobanda = persoana.getSalariuNet()*0.08;
        return dobanda;
    }
}
