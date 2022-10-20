package org.sample.java;

public class Material {
    int mlmId;
    String mlmComposition;

    Material(int x,String y){
        this.mlmId=x;
        this.mlmComposition=y;
    }

    Material(){
        System.out.println("\n\nmaterial created");
        this.mlmId=54321097;
        this.mlmComposition="80% Cotton 20% Polyester";
    }

    void materialDetails(){
        System.out.println("\n\nMaterial ID :"+this.mlmId);
        System.out.println("Composition :"+mlmComposition);
    }

}
