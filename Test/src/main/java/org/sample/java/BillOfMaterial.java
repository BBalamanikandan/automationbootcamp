package org.sample.java;

public class BillOfMaterial extends Material{
    short year=2022; String season="Fall/Winter";

    BillOfMaterial(short yr,String ss,int mlm,String comp){
        super(mlm,comp);
        this.year=yr;
        this.season=ss;
    }

    void bomData(){
        materialDetails();
        System.out.println("\n\n Year :"+year+"\nSeason :"+season);
    }



}
