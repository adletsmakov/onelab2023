package kz.one.onelab2023;

public class Example {
    public static void main(String[] args) {
        try {
            A a1 = (A) Class.forName("A").newInstance();
            a1.show();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}

class A {
    void show() {
        System.out.println("A show()");
    }
}