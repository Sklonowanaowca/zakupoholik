package com.example.monia.zakupoholik;

/**
 * Created by Monia on 2017-12-20.
 */

public class ListData {
    public int idLista;
    public String nazwaListy;
    public String dataZakupow;
    public double kosztZakupow;

    public ListData(){

    }

    public  String getNazwaListy(){
        return nazwaListy;
    }

    public String getDataZakupow(){
        return dataZakupow;
    }
}