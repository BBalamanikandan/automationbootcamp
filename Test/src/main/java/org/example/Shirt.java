package org.example;

public class Shirt {

    //sample class to record its member data and behaviors using getters/setters

    String fiberName,fiberUOM,yarnUOM,fabricUOM,productName,productUOM,colorName,articleType,seasonName,materialComposition;
    short fiberWeight,yarnBundle,yarnWastage,fabricLength,fabricWastage,No_of_Raw_Materials,No_of_Products;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaterialComposition() {
        return materialComposition;
    }

    public void setMaterialComposition(String materialComposition) {
        this.materialComposition = materialComposition;
    }

    public short getFiberWeight() {
        return fiberWeight;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public void setFiberWeight(short fiberWeight) {
        this.fiberWeight = fiberWeight;
    }

    public String getFiberUOM() {
        return fiberUOM;
    }

    public void setFiberUOM(String fiberUOM) {
        this.fiberUOM = fiberUOM;
    }

    public String getFiberName() {
        return fiberName;
    }

    public void setFiberName(String fiberName) {
        this.fiberName = fiberName;
    }

    public String getYarnUOM() {
        return yarnUOM;
    }

    public void setYarnUOM(String yarnUOM) {
        this.yarnUOM = yarnUOM;
    }

    public String getFabricUOM() {
        return fabricUOM;
    }

    public void setFabricUOM(String fabricUOM) {
        this.fabricUOM = fabricUOM;
    }

    public String getProductUOM() {
        return productUOM;
    }

    public void setProductUOM(String productUOM) {
        this.productUOM = productUOM;
    }

    public Short getYarnBundle() {
        return yarnBundle;
    }

    public void setYarnBundle(Short yarnBundle) {
        this.yarnBundle = yarnBundle;
    }

    public Short getYarnWastage() {
        return yarnWastage;
    }

    public void setYarnWastage(Short yarnWastage) {
        this.yarnWastage = yarnWastage;
    }

    public Short getFabricLength() {
        return fabricLength;
    }

    public void setFabricLength(Short fabricLength) {
        this.fabricLength = fabricLength;
    }

    public Short getFabricWastage() {
        return fabricWastage;
    }

    public void setFabricWastage(Short fabricWastage) {
        this.fabricWastage = fabricWastage;
    }

    public Short getNo_of_Raw_Materials() {
        return No_of_Raw_Materials;
    }

    public void setNo_of_Raw_Materials(Short no_of_Raw_Materials) {
        No_of_Raw_Materials = no_of_Raw_Materials;
    }

    public Short getNo_of_Products() {
        return No_of_Products;
    }

    public void setNo_of_Products(Short no_of_Products) {
        No_of_Products = no_of_Products;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    void SCM(Shirt sh) {
        System.out.println("-------------------------$$$$$$$$$$$$$$$$$$--------------------");
        System.out.println("SCM (Supply Chain Management) Data to trace how actually a product been delivered as follows....");
        System.out.println(sh.getFiberWeight() + " " + sh.getFiberUOM() + " of " + sh.fiberName + " been used to generate " + sh.getYarnBundle() + " " + sh.getYarnUOM() + " of yarn out of which " + sh.getYarnWastage() + " " + sh.getFiberUOM() + " is the fiber wastage during yarn generation.");
        System.out.println(sh.getYarnBundle() + " " + sh.yarnUOM + " of yarn been used to generate " + sh.getFabricLength() + " " + sh.getFabricUOM() + " of " + sh.getProductName() + " fabric.");
        System.out.println(sh.getNo_of_Products() + " " + sh.getProductUOM() + " of " + sh.getColorName() + " colored " + sh.getArticleType() + " " + sh.getProductName() + " shirts been produced for the " + sh.getSeasonName() + ", out of which " + sh.getFabricWastage() + " " + sh.getFabricUOM() + " is the fabric wastage during cutting and weaving process.");
        System.out.println("Only " + sh.No_of_Raw_Materials + " (" + sh.getMaterialComposition() + ") raw material been used to generate the product.");
        System.out.println("-------------------------$$$$$$$$$$$$$$$$$$--------------------");

    }


}
