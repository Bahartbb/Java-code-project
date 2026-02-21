package com.bahar.AmoozesheEquals;

import com.bahar.Rechteck;

import java.util.Arrays;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this. width = width;
    }

    //Methode equals: mige aya classe Rectangle yek Obj az classe pedar yani Object hast ya na
    //intance of: mikhaym bbinim aya in classe Rectangle nemoonei ya type az classe Object hast dar java?

    public boolean equals (Object obj){  //ye voroodi migire az jense classe Object ke ye esm ham mizarim vasash(obj)

        if((obj instanceof Rectangle) &&  //age obj az jense Rectangle bashe
                (((Rectangle) obj).length == this.length) &&   //chon obj khodesh length width nadare, va chon Rectangle khodesh zirmajoome Object hast, mitunim inja ba amale cast kardan be motagheyer haye aan dastresi dashte bahim
                (((Rectangle) obj).width == this.width))        //alan inja ba amale cast kardan migim obj ham hamoon length va width ro dare
        {
            return true;
        } else {
            return false;
        }

    }


    //raveshe 2vome neveshtane equals

    public boolean equals2 (Object obj){

        return (obj instanceof Rectangle) &&
                (((Rectangle) obj).length == this.length) &&
                (((Rectangle) obj).width == this.width);
    }



    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12 , 14);

        Rectangle rectangle1 = new Rectangle(45 , 87);

        String name = "bahar";

        int[] numbers = new int[5];


        //faghat zamani true mide ke type obj azjenste Rectangle bashe, (obj yani hamoon chizi ke too () jelo method minvisim)

        System.out.println(rectangle.equals(rectangle));  //ba khdesh moghayese mikonim
        System.out.println(rectangle.equals(name));         //aya rectangle typesh mesle name hast? na chon name Stringe

        System.out.println(rectangle.equals2(name));
        System.out.println(rectangle.equals2(numbers));

        System.out.println(rectangle.equals2(rectangle1));   //false chon moshakhaste rectangle1 ba rectangle mitune fargh kone, hatta age type har2 Rectangle bashe
    }
}
