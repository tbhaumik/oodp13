package poly;

public class Mystery {
    public static void main(String[] args) {
        Snow var1 = new Sleet();
        Snow var2 = new Rain();
        Sleet var3 = new Fog();


        var1.method2();              // a)

        var2.method1();              // b)

        var2.method2();              // c)

        var3.method2();              // d)

        var3.method3();              // e)

        ((Rain) var2).method1();     // f)

        ((Sleet) var1).method3();    // g)

        ((Sleet) var1).method1();    // h)

        ((Sleet) var2).method3();    // i)
    }
}