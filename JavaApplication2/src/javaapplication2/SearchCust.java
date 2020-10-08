/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author meena
 */
public class SearchCust extends JPanel{
    private JComboBox  combobox;  
    private JTextArea outputtxt;
private JLabel  label1 ;


private CustDBOperations array;
public SearchCust(){
    array = new CustDBOperations();
    this.combobox();
    
        this.loadcustomers();
       
        combobox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputtxt.setText(array.customer(combobox.getSelectedIndex()).toString());
            }
            
        });
}


private void combobox(){
 
    combobox = new JComboBox();
    label1 = new JLabel("Customer ID");
    this.setLayout(new GridLayout(5,2));
     this.setSize(100,100);
      outputtxt = new JTextArea();
      outputtxt.setEditable(false);
      this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(combobox);
        JPanel panel1 = new JPanel();
         this.add(panel,BorderLayout.NORTH);
        this.add(outputtxt,BorderLayout.CENTER);
}
public void loadcustomers(){
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
                     array.addCustomerList(cust);
                    System.out.println(cust.getName());
                    System.out.println(cust.getPhone());
                    combobox.addItem(cust.getName());                    
                }
                dataIn.close();
            } catch (Exception ex) {
               Logger.getLogger(SearchCust.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }   }
