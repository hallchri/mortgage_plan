package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Output {
    public Output(String path) {
        List<String> result = FileInput.readFile(path);
        List<Customer> customers = new ArrayList<Customer>();

            for(int i = 0; i < result.size(); i++) {
                List<String> customerInfo = Arrays.asList(result.get(i).split(","));
                Customer customer = new Customer(customerInfo.get(0),
                                        Double.parseDouble(customerInfo.get(1)),
                                        Double.parseDouble(customerInfo.get(2)),
                                        Integer.parseInt(customerInfo.get(3)));
                customers.add(customer);

                String prospectNum = String.format("Prospect %d:", (i+1));
                String customerName = customers.get(i).getName();
                double loanAmount = customers.get(i).getLoan();
                int totalYears = customers.get(i).getYears();
                double mortgageAmount = customer.getMortgagePayment();

                String prospect = String.format("%s %s wants to borrow %s€ for a period of %s years and pay %s€ each month",
                                                prospectNum, customerName, loanAmount, totalYears, mortgageAmount);

                System.out.println("\n*********************************************************************************************\n");
                System.out.println(prospect);
        }
            System.out.println("\n*********************************************************************************************\n");
    }
}
