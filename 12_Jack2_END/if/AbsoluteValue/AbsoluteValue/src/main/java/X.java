public class X {

    public static void main(String[] args) {

        System.out.println("the absolute value of the given number is: " + abs(-12));
        System.out.println("the absolute value of the given number is: " + abs(0));
        System.out.println("the absolute value of the given number is: " + abs(12));

    }

    public static int abs(int value){

        if (value < 0){
            value = -value;
            return value;
        }

        if (value > 0) {
            value = value;
            return value;
        }

        if (value == 0){
            value = 0;
            return 0;
        }

        return value;

    }


}
