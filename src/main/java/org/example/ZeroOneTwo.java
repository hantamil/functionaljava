package org.example;

import java.time.LocalDate;

public class ZeroOneTwo {
    public interface ZeroArgument {
        public void myFunc();
    }


    //tager func som parameter
    public static void printZero(ZeroArgument z0){
        z0.myFunc();
    }

    public interface OneArgument{
        public void myFunc(String str);
    }
    public interface OneArgumentStr{
        String myFunc(String str);
    }

    public interface TwoArgument{
        public int myFunc(int a, int b);
    }

    public static void printOne(OneArgument z1, String str){
        z1.myFunc(str);
    }

    public static void printToday(OneArgument z1){
        LocalDate ld = LocalDate.now();
        z1.myFunc("today");
    }

    public static String printTodayStr(OneArgumentStr z1){
        LocalDate ld = LocalDate.now();
        return z1.myFunc(ld.toString());
    }

    public static void main(String[] args) {
        ZeroArgument z0 = () -> System.out.println("interface");
        printZero(z0);

        OneArgument z1 = (str) -> System.out.println(str);
        z1.myFunc("one arg");

        OneArgumentStr z1str = (str) -> "i dag er det: " + str;
        String ss = printTodayStr(z1str);
        System.out.println(ss);
    }
}
