package com.itfactory.interfata;

public class BancaLocuinte implements UnitateBancara{

    @Override
    public double calcCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet()*100;
        return credit;

    }

    @Override
    public double dobCredit(Persoana persoana) {
        double dobanda = persoana.getSalariuNet()*0.05;
        return dobanda;

    }
}
