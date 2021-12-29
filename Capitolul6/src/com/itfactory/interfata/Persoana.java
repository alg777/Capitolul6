package com.itfactory.interfata;

public class Persoana {
    public Persoana(String nume, int cnp, int salariuNet) {
        this.nume = nume;
       // this.age = age;
        this.cnp = cnp;
        this.salariuNet = salariuNet;
    }

    private String nume;
    private int age;
    private int cnp;
    private int salariuNet;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

//    public int getAge() {
//        return age;
//    }

//   // public void setAge(int age) {
//        this.age = age;
//    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public int getSalariuNet() {
        return salariuNet;
    }

    public void setSalariuNet(int salariuNet) {
        this.salariuNet = salariuNet;
    }
}
