package mytest;

public class Main {

    public static void main(String[] args) {
       int revenue = 220_000;
       double loanAmount = LoanAmount.credit(revenue);
       int gs = 200_000;
       double bbr = 0.05;
       int years = 5;
        System.out.println("Loan amount is: " + loanAmount);
        double base = Rate.base(revenue, gs, loanAmount, bbr);
        System.out.println("Rate is: " + base * 100);
        double ppy = loanAmount * base;
        double percent = PercentAmount.percent(years, ppy);
        System.out.println("Percent per year is: " + ppy);
        System.out.println("Total percent amount for x years is: " + percent);
    }
}
