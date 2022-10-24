package mytest;

public class LoanAmount {
    public static int credit(int revenue) {
        double loan = revenue * 0.25;
        if (loan < 40000) {
            loan = 0;
        } else if (loan > 50000) {
            loan = 50000;
        }
        return (int) loan;
    }
}


