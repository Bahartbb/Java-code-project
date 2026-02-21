import com.sun.corba.se.spi.activation.ActivatorHelper;

public class X {


//In this exercise, you are to determine whether three numbers are a so-called Pythagorean triple.
//Three numbers a, b, and c are a Pythagorean triple if and only if a^2 + b^2 = c^2.

    public boolean checkTriple(int a, int b, int c){

        int left_a = (int)Math.pow(a,2);
        int left_b = (int)Math.pow(b,2);
        int right_c = (int)Math.pow(c,2);
        int left_total = left_a + left_b;

        if (left_total == right_c){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        X x = new X();

        System.out.println(x.checkTriple(2,3,4));
        System.out.println(x.checkTriple(3,4,5));
    }
}


