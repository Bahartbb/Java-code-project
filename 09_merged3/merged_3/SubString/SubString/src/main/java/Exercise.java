public class Exercise {


    public static void main(String[] args) {

        String example = "My name is Bahar";

        String subSting1 = example.substring(3); //name is Bahar
        System.out.println(subSting1);


        String subString2 = example.substring(3, 7);   //name
        String subString3 = example.substring(11,16);  //bahar
        System.out.println(subString2 + " " + subString3);

    }

}
