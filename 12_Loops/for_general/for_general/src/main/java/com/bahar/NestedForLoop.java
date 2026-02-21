package com.bahar;

//NestedFor
//5 ta charkh dande vojood dare ke be ezaye yek bar ejraye kamele fore dakheli, halgheye birooni tar
//yek bar ejra mishe va in ravand edame dare ta zamani ke halgheha tamoom mishan
public class NestedForLoop {

    public static void main(String[] args) {

        //fore birooni shamele 5 peymayseh:

        for(int i=1; i<=2; i++)
        {
           for(int j=1; j<=3; j++)
           {
                for(int k=1; k<=4; k++)
                {
                   for (int l=1; l<=5; l++)
                    {
                        for(int m=1; m<=6; m++)
                        {

                            System.out.println("m :" + " " + m);
                        }
                        System.out.println("l :" + " " + l);
                    }
                    System.out.println("k :" + " " + k);
                }
                System.out.println("j :" + " " + j);
            }
            System.out.println("i :" + " " + i);
        }
    }
}
