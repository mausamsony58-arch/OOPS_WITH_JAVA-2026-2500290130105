public class constructor {

    int a;
    float b;
    String c;

    constructor() {
        System.out.println("Default");
    }

    constructor(int a) {
        this.a = a;
    }

    constructor(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {

        constructor obj1 = new constructor();
        constructor obj2 = new constructor(5);
        constructor obj3 = new constructor(5, 5.5f, "mausam");

        System.out.println("inside object a: " + obj1.a);
        System.out.println("inside object b: " + obj2.a);
        System.out.println("inside object c: " + obj3.a);
    }
}