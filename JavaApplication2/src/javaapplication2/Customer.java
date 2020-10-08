/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author meena
 */
public class Customer {
    private String email, name  , postalCode , phone;
    private int customerID;
    

    public Customer(int custid , String custname ,String phone, String email , String postalcode ){
        this.setCustomerID(custid);
        this.setName(custname);
        this.setPhone(phone);
        this.setEmail(email);
        this.setPostalCode(postalcode);
    }
    
    public Customer(){
        super();
    }
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Customer{" + "Name is" + name + "phone = " + phone +" Email is " + email + "postalcode = "+postalCode + '}';
    }
    
}
