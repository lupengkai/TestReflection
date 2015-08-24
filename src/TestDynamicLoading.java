/**
 * Created by tage on 15-8-13.
 */
public class TestDynamicLoading {
    public static void main(String[] args) {
        new A();
        System.out.println("--------");
        new B();
        new C();
        new C();
        new D();
        new D();

    }



}

class A {};
class B {};

class C {
    static {
        System.out.println("CCCCCCC");
    }
}

class D {
    {
        System.out.println("DDDDDDDDD");
    }
}
