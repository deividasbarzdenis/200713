package com.company;

class A{
    public int metodas(int x){
        try {
            B b  = new B();
            b.meto(x);
        }catch (ArithmeticException e){
            System.out.println("Error: Dalyba is nulio negalima");
        }
        return x;
    }
}
class B{
    public int meto(int x){
        C c = new C();
        c.met(x);
        return x;
    }

}
class C{
    public int met(int x){
        x/=0;
        return x;
    }
}

public class Main {

    public static void main(String[] args) {
	A a = new A();
	a.metodas(4);
    }
}
