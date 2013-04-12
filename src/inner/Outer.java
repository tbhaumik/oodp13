package inner;

public class Outer {
    private int n;

    class Inner {
        int ten = 10;

        void setNToTen() {
            n = ten;
        }
    }

    void setN() {
        new Inner().setNToTen();
    }
}