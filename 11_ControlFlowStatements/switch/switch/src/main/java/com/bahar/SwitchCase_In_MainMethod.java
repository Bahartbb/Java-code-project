package com.bahar;

/*
*  دستور switch
دستور switchزمانی استفاده میشود که نیاز به مقایسه یک متغیر با چند مقدار ثابت داریم. این دستور برای مواردی که چندین
حالت وجود دارد )مانند انتخاب گزینهها( مناسب است. در این ساختار از caseبرای تعریف هر حالت و از defaultبرای تعیین
حالتی که هیچکدام از مقادیر برابر نبودند، استفاده میشود. */

//ye switch case baraye roozhaye kariye hafte
//3 rooz az in 5 rooz ro bayd beri sare kar, 1 roozesho miri daneshga
//ma mikhaym un ye roozi k miri daneshga ro peyda koni az bryne in 5 rooz
public class SwitchCase_In_MainMethod
{


    public static void main( String[] args )
    {
        String day = "Saturday";

        switch(day){
            case "Monday":
                System.out.println("Monday is a work day for me");
                break;

            case "Tuesday":
                System.out.println("Tuesday is an uni day for me");
                break;

            case "Wednesday":
                System.out.println("Wednesday is a work day for me");
                break;

            case "Thursday":
                System.out.println("Thursday is a work day for me");
                break;

            case "Friday":
                System.out.println("Friday is a work day for me");
                break;

            default:
                System.out.println("out of range of working days");
                break;
        }
    }
}
