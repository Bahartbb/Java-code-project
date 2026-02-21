package com.bahar;


public class App 
{
    public static void main( String[] args ) {


        //4 ta amale asli ro rooye 2 ta voroodi anjam bede

        int a = 12;
        int b = 6;

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;

        System.out.println("the summation is: " + sum + ","
                + " the subtraction is: " +  sub + ","
                + " the multiplication is: " + mult + ","
                + " the division is: " + div);


        //remainder % :
        a = 43;  //initialize kardane mojadade a
        int remainder = a%b;
        System.out.println("the remainder is: " + remainder);

//_________________________________________________________________________________________________________________________


        //increment vs decrement

        int x = 10;
        int y = 20;
        x++;  //x++ = x+1
        System.out.println("x++ : " + x);
        y++;  //y++ = y+1
        System.out.println("y++ : " + y);
        x--;  //x-- = x-1
        System.out.println("x-- : " + x);
        y--;  //y-- = y-1
        System.out.println("y-- : " + y);




        int w = 10;
        int z = 20;
        ++w;  //w++ = w+1
        System.out.println("++w1 : " + w);
        ++w;
        System.out.println("++w2 : " + w);
        ++w;
        System.out.println("++w3 : " + w);
        ++w;
        System.out.println("++w4 : " + w);


        ++z;  //z++ = z+1
        System.out.println("++z1 : " + z);
        ++z;  //z++ = z+1
        System.out.println("++z2 : " + z);
        ++z;  //z++ = z+1
        System.out.println("++z3 : " + z);
        ++z;  //z++ = z+1
        System.out.println("++z4 : " + z);


        int t=10;
        int s=20;
        --t;  //t-- = t-1
        System.out.println("--t1 : " + t);
        --t;  //t-- = t-1
        System.out.println("--t2 : " + t);
        --t;  //t-- = t-1
        System.out.println("--t3 : " + t);
        --t;  //t-- = t-1
        System.out.println("--t4 : " + t);



        --s;  //s-- = s-1
        System.out.println("--s1 : " + s);
        --s;  //s-- = s-1
        System.out.println("--s2 : " + s);
        --s;  //s-- = s-1
        System.out.println("--s3 : " + s);
        --s;  //s-- = s-1
        System.out.println("--s4 : " + s);

//_________________________________________________________________________________________________________________________


        //comparison operator

        int num1 = 15;
        int num2 = 34;

        boolean isCorrect = (num1 == num2);  //equals to
        System.out.println("isCorrect== : " + isCorrect);

        isCorrect = (num1 == num1);  //equals to
        System.out.println("isCorrect== : " + isCorrect);

        isCorrect = (num1 != num2);  //not equal to
        System.out.println("isCorrect!= : " + isCorrect);

        isCorrect = (num1 > num1);  // greater than >
        System.out.println("isCorrect> : " + isCorrect);

        isCorrect = (num1 < num1);  // less than <
        System.out.println("isCorrect< : " + isCorrect);

        isCorrect = (num1 >= num1);  // greater than or equals to >=
        System.out.println("isCorrect>= : " + isCorrect);

        isCorrect = (num1 <= num1);  // less than or equals to <=
        System.out.println("isCorrect<= : " + isCorrect);

//_________________________________________________________________________________________________________________________


        //logical operators:

        boolean value1 = true;
        boolean value2 = false;

        //logical operator : ! --> not , && --> if both values are correct/1 , || --> only one value has to be correct/1

        value2 = !value1;
        System.out.println("isValid! : " + value2);

        boolean values = value1 && value2;
        System.out.println("isValid&& : " + values);

        values = value1 || value2;
        System.out.println("isValid|| : " + values);


    }
}
