package com.bahar;

public class Main_2 {

    public static void main(String[] args) {

        Data_2 data = new Data_2();

        data.setFirstName("Bahar");
        System.out.println(data.getFirstName());


        data.setLastName("tbb");
        System.out.println(data.getLastName());


        data.setAge(33);
        System.out.println(data.getAge());


        data.setMarried();
        System.out.println(data.getMarried("yes"));
    }
}
