package com.bahar;
//agar adad koochiktar az 1 bashe, miad biroon va return mikone false ro
//

public class PrimeZahl
{
    public static boolean isPrime(int zahl){

        if (zahl <= 1) {
            System.out.println("the number is less than or equal to 1, there fore can not be considered");
            return false;
        }
        else{
            for (int i= 2; i < zahl; i++){
                if (zahl % i == 0){
                    System.out.println("the condition is not satisfied");
                    return false;
                }
            }


        }
        System.out.println("the number is a Prime number");
        return true;
    }



    public static void main( String[] args )
    {
        System.out.println(isPrime(42));
    }
}
