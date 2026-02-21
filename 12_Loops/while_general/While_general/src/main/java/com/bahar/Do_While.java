package com.bahar;

// حلقهی while-doشبیه به حلقه whileاست، با این تفاوت که شرط در انتهای حلقه بررسی میشود. این بدان معناست که دستورات
//داخل حلقه حداقل یک بار اجرا میشوند، حتی اگر شرط برقرار نباشد.

// do {
//         command    (ye seri dastoorate ghabele ejra)
// } while(condition);

//soal: esme bahar ro be tedade 10 bar chap kone vali be yek shart, be sharti ke hade aghal yek bar esme bahar chap beshe

public class Do_While {

    public static void main(String[] args) {

        int number = 1;
        do {
            System.out.println("Bahar");  //badaneye shart inja miad
            number++;

        } while (number <= 10);     //khode shart ya condition inja miad
    }

}
