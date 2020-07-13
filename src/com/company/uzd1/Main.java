package com.company.uzd1;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        B b = new B(c);
        A a =new A();
        a.method(4);
    }

}
