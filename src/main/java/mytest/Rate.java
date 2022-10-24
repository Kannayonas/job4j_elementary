package mytest;

public class Rate {
    public static double base(int revenue, int gs, double loan, double bbr) {
        int ebitda = revenue - gs;
        double risk = 0;
        for (int i = 0; i < loan / ebitda; i++) {
            risk += i / 2;
        }
        return bbr + risk / 100;
    }
}
