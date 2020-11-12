package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class SecondInheritance {

    public static void main(String args[]) {

        A a = new A();
        B b = new B();

        System.out.println("a.i=" + a.i);
        System.out.println("a.increment(a.i)=" + a.increment(a.i));
        System.out.println("b.i=" + b.i);
        System.out.println("b.j=" + b.j);
        System.out.println("b.increment(b.j)=" + b.increment(b.j));

    }
}

class A {
    int i;

    int increment(int x) {
        return ++x;
    }
}

class B extends A {
    int j;
}

