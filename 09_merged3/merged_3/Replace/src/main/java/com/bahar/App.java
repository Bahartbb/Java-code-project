package com.bahar;

//public String replace(CharSequence target, CharSequence replacement)
//string barmigardoone,
//yani ye data type az noe String ijad mikoni, ke yek khane az hafeze ro eshghal mikone,
// va meghdare khorooji ro toosh zakhire mikone, ke ba String bazam moarefish mikonim
public class App 
{
    public static void main( String[] args ) {

        String example = "Mississippi";

        String replace = example.replace("s" , "i");
        System.out.println(replace);

        String replace2 = example.replace("b" , "i"); //chon b nadarim taghiri nmide
        System.out.println(replace2);

        String replace3 = example.replace("i" , "b"); //chon target i ro darim ghabool mikone
        System.out.println(replace3);



    }
}
