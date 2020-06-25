package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kupac k = new Kupac("Stefan","Biocanin");
        Stavka s1 = new Stavka("fliper");
        Stavka s2 = new Stavka("gruppi");
        Stavka s3 = new Stavka("Dell");
        Stavka s4 = new Stavka("Glorija");
        Stavka s5 = new Stavka("Linoleum");

        Porudzbine p = new Porudzbine(k);
        p.dodajPorudzbinu(s1);
        p.dodajPorudzbinu(s2);
        p.dodajPorudzbinu(s3);
        p.dodajPorudzbinu(s4);
        p.dodajPorudzbinu(s5);
        System.out.println(p.getStavke());
    }
}
