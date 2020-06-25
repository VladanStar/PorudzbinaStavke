package com.company;

public class Kupac {
    private String ime;
    private String prezime;

    public Kupac() {
    }

    public Kupac(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
