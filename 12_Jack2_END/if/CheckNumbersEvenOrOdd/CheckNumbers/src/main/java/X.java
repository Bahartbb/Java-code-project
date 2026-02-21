public class X {


    public static String checkEven(int num){

        if (num % 2 == 0){
            return "the given number is even";
        } else {
            return "the given number is odd";
        }
    }



    public static String checkOdd(int num){

        if (num % 2 != 0){
            return "the given number is odd";
        } else{
            return "the given number is even";
        }
    }

    public static void main(String[] args) {

        System.out.println(checkEven(12));
        System.out.println(checkEven(13));


        System.out.println(checkOdd(15));
        System.out.println(checkOdd(16));
    }

}
