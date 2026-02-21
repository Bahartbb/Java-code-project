package com.bahar.abstractionClass;

//shape ye chizae kolli bud, hala mikhaym az classe shape ers bari konim, be soorate:
//ba kalameye kilidiye extends, chon har 2 calss hastan
//vaghti classi ke mikhaym azash ersbari koni abstarct bashe,2 halat darim:
// 1- agar methodhaye abstract dashte bshim dar classe pedar, piyade sazi dar in class ejbarie
//2- va agar method ha abstarct nabashan dar classe pedar, piyade sazi dar inja ejbari nist

//bade extend kardan, ba zadane gozineye implement, khodesh hameye methodhaye abstract ro miyare
//mitunim dar bodye methodha harchi mesle formool va .. ezafe konim, va azashun estefade konim

public class Rectangle extends Shape{


    @Override
    void area(double a, double b) {

    }

    @Override
    public void heightCalculator() {

    }

    @Override
    double deepCalculator() {
        return 0;
    }

//in yeki ro az tarighe implement natunestim ijad konim, chon behesh ehtiyaj darim,
//az tarighe generate + override miyarimesh
    @Override
    void printName(String name) {
        super.printName(name);
    }
}
