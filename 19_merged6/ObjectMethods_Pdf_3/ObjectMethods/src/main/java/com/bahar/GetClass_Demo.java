package com.bahar;


public class GetClass_Demo
{
    //getClass(): type ya jense class ro baramoon barmigardoone
    //faghat zamani behemoon jense class ro barmigardoone ke variable haro az jense wrapper moarefi konim




    public static void main( String[] args )
    {
     String name = "bahar";
     Integer age = 35;

        System.out.println(name.getClass()); //bayad bede jense name String hast
        System.out.println(age.getClass());  //bayad bede jense age Integer hast

    }
}
