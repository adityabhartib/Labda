package com.bridgelabz;

import java.util.function.BiFunction;

//interface Sayable{
//    void say();
//}
//public class ReftoStaticMethod {
//    public static void saySomething(){
//        System.out.println("Hello, this is static method.");
//    }
//    public static void main(String[] args) {
//        // Referring static method
//        Sayable sayable = ReftoStaticMethod::saySomething;
//        // Calling interface method
//        sayable.say();
class Airthmetic{
    public static int add(int a, int b){
        return a+b;
    }
}
public class ReftoStaticMethod {
    public static void main(String[] args) {
        BiFunction<Integer, Integer,Integer>adder=Airthmetic::add;
        int result =adder.apply(10,20);
        System.out.println(result);
}
}
