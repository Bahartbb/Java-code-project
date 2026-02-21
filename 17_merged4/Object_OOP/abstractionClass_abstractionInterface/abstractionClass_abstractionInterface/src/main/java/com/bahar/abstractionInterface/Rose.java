package com.bahar.abstractionInterface;
//baraye inke yek class az yek interface betoone ers bebare ya ghabeliyat hash ro piyade sazi kone
//bayad az kamaleye implement estefade konim
//inja tamame methodhaye interface bayad piyade sazi behsn, chon hamegi abstract hastan, va vaghtyi dare override mishe poshte methodha public miad dar subclass
//bodye method ha mitoonan harchizi begiran dar subclass (code bezanim)
//2 halate estena az java 8 be bad mitoonan override dar subclass nashan
//vali voroodie method nemitoone taghir kone, har chi ke classe pedar un method voroodi gerefte ro migire

public class Rose implements Flower{
    @Override
    public void getColor(String color) {

    }

    @Override
    public int sum(int golBarg) {
        return 0;
    }

    @Override
    public String printName(String flowerName) {
        return "";
    }


    //default method ha  mitoonan override beshan ya nashan, optional
    @Override
    public void smell() {
        Flower.super.smell();
    }

    @Override
    public String isSharp(boolean sharpness) {
        return Flower.super.isSharp(sharpness);
    }



    //static methodha: aval methode main ya har methode dgei misazi
    //bad ba estefade az esme interfacd(ina Flpwer) . mizari be method dastresi peyda mikoni

    public static void main(String[] args) {

        Flower.getAge(3);
        Flower.pick();
    }

}
