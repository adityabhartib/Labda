package com.bridgelabz;
//interface Sayable{
//    void say();
public class RefTOAnInstanceMethod {
    public void printnMsg(){
        System.out.println("Hello , this is Instance method");
    }
//    public void saySomething(){
//        System.out.println("Hello, this is non-static method.");
//    }
    public static void main(String[] args) {
//        RefTOAnInstanceMethod methodReference = new RefTOAnInstanceMethod(); // Creating object
//        // Referring non-static method using reference
//        Sayable sayable = methodReference::saySomething;
//        // Calling interface method
//        sayable.say();
//        // Referring non-static method using anonymous object
//        Sayable sayable2 = new RefTOAnInstanceMethod()::saySomething; // You can use anonymous object also
//        // Calling interface method
//        sayable2.say();
        Thread t2=new Thread(new RefTOAnInstanceMethod()::printnMsg);
        t2.start();
    }
}
