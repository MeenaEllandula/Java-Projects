/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.Customer;

/**
 *
 * @author meena
 */
public class CustDBOperations {
    private ArrayList<Customer> customerArray;

    public ArrayList<Customer> getCustomerList() {
        return customerArray;
    }
    public int getSize(){
        return this.customerArray.size();
    }
   
    public Customer customer(int id){
       return customerArray.get(id);
        
    }
   
 
    public void addCustomerList(Customer cust){
        customerArray.add(cust);
    }
public CustDBOperations(){
    customerArray  = new ArrayList<Customer>();
}
            


   public void addCustomers(Customer customer1){
        DataOutputStream outFile = null;
        try {
            outFile = new DataOutputStream(new FileOutputStream("customers1.txt",true));
            outFile.writeUTF(Integer.toString(customer1.getCustomerID()));
            outFile.writeUTF(customer1.getName());
            outFile.writeUTF(customer1.getEmail());
            outFile.writeUTF(customer1.getPhone());
            outFile.writeUTF(customer1.getPostalCode());
        } catch (Exception ex) {
            Logger.getLogger(CustDBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                outFile.close();
            } catch (IOException ex) {
                Logger.getLogger(CustDBOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
   public void Custload(){
        File myFile = new File("customers1.txt");
        if (myFile.exists()){
            try {
                DataInputStream dataIn = new DataInputStream(new FileInputStream(myFile));
                while(dataIn.available()>0){
                    Customer cust = new Customer();
                    cust.setCustomerID(Integer.parseInt(dataIn.readUTF()));
                    cust.setName(dataIn.readUTF());
                    cust.setEmail(dataIn.readUTF());
                    cust.setPhone(dataIn.readUTF());
                    cust.setPostalCode(dataIn.readUTF());
                    customerArray.add(cust);
                    
                }
                dataIn.close();
            } catch (Exception ex) {
              Logger.getLogger(CustDBOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
     

