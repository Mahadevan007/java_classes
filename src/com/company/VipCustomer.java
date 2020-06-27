package com.company;

public class VipCustomer {
    private String name;
    private int creditlimit;
    private String emailaddress;

    public VipCustomer(){
        this("newaccount",2000, "newaccount@email.com");
    }

    public VipCustomer(String name,int creditlimit){
        this(name,creditlimit,"newaccount2@gmail.com");
    }

    public VipCustomer(String name,int creditlimit,String emailaddress){
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
