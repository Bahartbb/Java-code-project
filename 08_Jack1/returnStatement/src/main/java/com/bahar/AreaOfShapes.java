package com.bahar;

public class AreaOfShapes {

    //This task is about calculating the area of geometric shapes such as rectangles and circles.

    public static void main(String[] args) {
        circleArea(2);
        circleArea(50);
        rectangleArea(3,6);
    }

    // a(cir) = 3.14 * r * r
    // a(rec) = w * l

    public static double circleArea(int r){
       double result = 3.14 * r * r;
        System.out.println("The area of circle is: " + result);
       return result;
    }

    public static double rectangleArea(int w , int l){
        double result = w * l;
        System.out.println("The area of rectangle is: " + result);
        return result;

    }


}


