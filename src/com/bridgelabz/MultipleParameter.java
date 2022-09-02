package com.bridgelabz;

interface Calc{
    int calc(int a, int b);}
public class MultipleParameter {
    public static void main(String[] args) {
         Calc add=(a,b)->(a+b);
        System.out.println(add.calc(10,20));
        Calc sub=(a,b)->(a-b);
        System.out.println(sub.calc(50,30));
        Calc Mult=(a,b)->(a*b);
        System.out.println(Mult.calc(40,30));
//        With return Keyboard----
        Calc add1=(int a,int b)->{
            return (a+b);
        };
        System.out.println(add1.calc(5000,1000));
    }
}
