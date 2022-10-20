package org.sample.java;

public class TestBOM {
    public static void main(String[] args) {
        BillOfMaterial bom=new BillOfMaterial((short) 2022,"Fall/Winter",54321098,"100% Cotton");
        bom.bomData();

        bom.mlmId=54321099;
        bom.mlmComposition="100% Recycled Polyester";
        bom.materialDetails();
        bom.bomData();

        Material mlm=new Material();
        mlm.materialDetails();

        mlm=new Material(54321001,"100% Lycra");
        mlm.materialDetails();

        mlm.mlmId=54321000;
        mlm.mlmComposition="100% Nylon";
        mlm.materialDetails();
    }
}
