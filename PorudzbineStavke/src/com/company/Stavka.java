package com.company;

public class Stavka {
    private String ime;

    public Stavka() {
    }

    public Stavka(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Stavka{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
