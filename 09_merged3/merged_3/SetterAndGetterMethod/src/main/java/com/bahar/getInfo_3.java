package com.bahar;

public class getInfo_3 {


    public static void main(String[] args) {

        Info_3 info = new Info_3();

        info.setSubject("math");
        System.out.println(info.getSubject());

        info.setGrade(2.88);
        System.out.println(info.getGrade());

        info.setIspassed(true);
        System.out.println(info.getIsPassed(5.88));

    }
}
