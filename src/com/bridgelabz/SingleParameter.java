package com.bridgelabz;
interface  sayable{
    public  String say(String name);
}
public class SingleParameter {
    public static void main(String[] args) {

        sayable s1=(name)->{
            return "Hello "+name;
        };

        System.out.println(s1.say("Aditya"));
    }
}
