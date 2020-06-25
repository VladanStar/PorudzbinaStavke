package com.company;

import java.util.ArrayList;
import java.util.List;

public class Porudzbine {
    private Kupac kupac;
    private List<Stavka> stavke = new ArrayList<>();

    public Porudzbine() {
    }

    public Porudzbine(Kupac kupac) {
        this.kupac = kupac;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public List<Stavka> getStavke() {
        return stavke;
    }

    public void setStavke(List<Stavka> stavke) {
        this.stavke = stavke;
    }
    public void dodajPorudzbinu(Stavka stavka){
        stavke.add(stavka);
    }
}
