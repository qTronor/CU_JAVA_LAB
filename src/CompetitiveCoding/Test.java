package CompetitiveCoding;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        func();
    }
    static void func(){
        String n = "Hello";
        System.out.println(n);
        bar(n);
        System.out.println(n);
    }
    static void bar(String n){
        n += "World";
        System.out.println(n + 13);
    }
}
