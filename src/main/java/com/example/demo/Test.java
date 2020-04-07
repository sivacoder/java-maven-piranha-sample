package com.example.demo;

public class Test {

    public void test() {
        if(Test.getldvalue("dummy-flag")) {
            System.out.println("success");
        }
    }

    public static boolean getldvalue(String flag) {
        return true;
    }
}
