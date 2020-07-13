package com.company.uzd1;

public class B {
    private C c;

    public B(C c) {
        this.c = c;
    }
    public int method(int x){
        return this.c.method(x);
    }
}
