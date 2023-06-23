package practiceAll.demo_static;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class DemoStatic {
    static final double PI = 3.14;

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int y, int b, int a) {
        return a + b + y;
    }

    static {
    }
}
