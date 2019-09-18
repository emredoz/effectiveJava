package com.efectivejava.utility;

public class CustomerUtility {

    private CustomerUtility() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        CustomerUtility.getCustomerName(1l);
        CustomerUtility customerUtility = new CustomerUtility();
    }

    public static String getCustomerName(Long id){
        return "Emre";
    }
}
