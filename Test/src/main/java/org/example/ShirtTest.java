package org.example;

public class ShirtTest {
    public static void main(String[] args) {
        Shirt cs=new Shirt();

        cs.setFiberName("cotton");
        cs.setFiberWeight((short) 189);
        cs.setFiberUOM("Kilograms");
        cs.setYarnBundle((short) 10);
        cs.setYarnUOM("Bundles");
        cs.setYarnWastage((short) 4);
        cs.setFabricLength((short) 18);
        cs.setFabricUOM("Metres");
        cs.setFabricWastage((short) 2);
        cs.setNo_of_Raw_Materials((short) 1);
        cs.setMaterialComposition("100% Cotton");
        cs.setColorName("White");
        cs.setArticleType("PartyWear");
        cs.setSeasonName("FestiveTime");
        cs.setProductName("Pure Cotton");
        cs.setNo_of_Products((short) 50);
        cs.setProductUOM("Pieces");

        cs.SCM(cs);

        cs.fiberName="polyester";
        cs.fiberWeight=123;
        cs.fiberUOM="Kilograms";
        cs.yarnBundle=17;
        cs.yarnUOM="Bundles";
        cs.yarnWastage=1;
        cs.fabricLength=35;
        cs.fabricUOM="Metres";
        cs.fabricWastage=6;
        cs.No_of_Raw_Materials=1;
        cs.materialComposition="100% Polyester";
        cs.colorName="Blue";
        cs.articleType="CasualWear";
        cs.seasonName="Usual";
        cs.productName="Polyester";
        cs.No_of_Products=28;
        cs.productUOM="Pieces";

        cs.SCM(cs);

    }
}
