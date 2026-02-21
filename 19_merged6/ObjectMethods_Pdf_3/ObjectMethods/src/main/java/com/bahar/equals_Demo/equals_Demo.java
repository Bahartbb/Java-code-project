package com.bahar.equals_Demo;

public class equals_Demo {

    String title;


    public equals_Demo(String title){
        this.title = title;
    }

    //yani classe Object be onvane voroodi roosh amaliyat e equlas anjam beshe va be ma true/false bede



    public boolean equals(Object obj){

        if(obj == null) return false;

        equals_Demo equalsDemo = (equals_Demo) obj;
            return this.title.equals(equalsDemo.title);
    }


    public static void main(String[] args) {


        equals_Demo b1 = new equals_Demo("java");
        equals_Demo b2 = new equals_Demo("java");
        equals_Demo b3 = new equals_Demo("python");

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));


    }

}
