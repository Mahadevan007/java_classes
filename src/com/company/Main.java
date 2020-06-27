package com.company;

public class Main {

    public static void main(String[] args) {
	    VipCustomer vip1 = new VipCustomer();
        System.out.println("Name: "+vip1.getName()+" CreditLimit: "+vip1.getCreditlimit()+" EmailAddress: "+vip1.getEmailaddress());
        VipCustomer vip2 = new VipCustomer("vip2",3000);
        System.out.println("Name: "+vip2.getName()+" CreditLimit: "+vip2.getCreditlimit()+" EmailAddress: "+vip2.getEmailaddress());
        VipCustomer vip3 = new VipCustomer("vip3",4000,"vip3@gmail.com");
        System.out.println("Name: "+vip3.getName()+" CreditLimit: "+vip3.getCreditlimit()+" EmailAddress: "+vip3.getEmailaddress());
    }
}
