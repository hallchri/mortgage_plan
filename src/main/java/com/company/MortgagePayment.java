package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MortgagePayment {
    public double calculateMortgage(double U, double b, int t) {
        double E;

        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        df.setMinimumFractionDigits(0);
        df.setMaximumFractionDigits(2);

        b = (b / 100) / 12;
        t = t * 12;

        // Mortgage formula
        E = (U * b) / (1 - power(1+b, -t));

        E = Double.parseDouble(df.format(E));
        return E;
    }

    private double power(double base, int exp) {

        /*
        Assuming the period (years) is always an integer, per prospects.txt values.
        Future improvements would be handling double values as well for years,
        but since assuming years is always an integer value, this is so far not necessary to handle
         */

        double total = 1.0;

        if(exp > 0) {
            for(int i = 1 ; i <= exp ; i++) {
                total *= base;
            }
        }
        else {
            for(int i = -1 ; i >= exp ; i--) {
                total /= base;
            }
        }

        return total;
    }
}
