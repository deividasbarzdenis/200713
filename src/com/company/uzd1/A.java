package com.company.uzd1;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public A() {

    }

    public int method(int x){
        try {
            return this.b.method(x);
        }catch (ArithmeticException e){
            System.out.println("Error: dalyba is nulio negalima");
        }
        return x;
    }
}
