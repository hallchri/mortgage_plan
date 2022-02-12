package com.company;

public class Customer {
    private String name;
    private double loan;
    private double interest;
    private int years;
    private double payment;

    public Customer(String n, double l, double i, int y) {
        setName(n);
        setLoan(l);
        setInterest(i);
        setYears(y);
        setMortgagePayment();
    }

    public String getName() { return name; }

    public void setName(String n) { name = n; }

    public double getLoan() { return loan; }

    public void setLoan(double l) { loan = l; }

    public double getInterest() { return interest; }

    public void setInterest(double i) { interest = i; }

    public int getYears() { return years; }

    public void setYears(int y) { years = y; }

    private void setMortgagePayment() {
        double U = this.getLoan();
        double b = this.getInterest();
        int p = this.getYears();

        payment = new MortgagePayment().calculateMortgage(U, b, p);
    }

    public double getMortgagePayment() { return payment; }

}
