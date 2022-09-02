package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("Aditya");
        list.add("Takesh");
        list.add("Ram");

        list.forEach(
                (n)-> System.out.println(n));
    }
}
