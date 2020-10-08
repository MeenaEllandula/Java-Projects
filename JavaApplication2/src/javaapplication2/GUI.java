/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author meena
 */
public class GUI extends JPanel {

    private JLabel lblName;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4, label5;
    private JTextField textfield1, textfield2;
    private JButton Add, butModify;
    private int custID;
    private String custname;
    private JButton find, load;
    CustDBOperations customerlist = new CustDBOperations();
    private JTextField textfield3, textfield4, textfield5;
    private String custphone, custemail, postalCode;

    public GUI() {
        lblName = new JLabel("Customer Management");
        label1 = new JLabel("Customer ID");
        label2 = new JLabel("Customer Name");
        label3 = new JLabel("Customer Phone");
        label4 = new JLabel("Customer Email");
        label5 = new JLabel("Customer PostalCode");
        textfield1 = new JTextField();
        textfield2 = new JTextField();
        textfield3 = new JTextField();
        textfield4 = new JTextField();
        textfield5 = new JTextField();
        Add = new JButton("Add");

        find = new JButton("Find");

        this.setSize(200, 300);
        this.setLayout(new GridLayout(6, 2));

        this.add(label1);
        this.add(textfield1);
        this.add(label2);
        this.add(textfield2);
        this.add(label3);
        this.add(textfield3);

        this.add(label4);
        this.add(textfield4);
        this.add(label5);
        this.add(textfield5);
        this.add(Add);

        this.Add.addActionListener(e -> addCustomer());

    }

    public void searchCustomer() {

    }

    public void addCustomer() {

        boolean tempp = true;
        while (tempp) {

            int temp = 0, newcust;
            try {
                custID = Integer.parseInt(textfield1.getText());
            } catch (NumberFormatException ime) {
                JOptionPane.showMessageDialog(null, "Incorrect Customer ID");
                tempp = true;
                break;
            }

            tempp = false;

            if (textfield2.getText() == "") {
                JOptionPane.showMessageDialog(null, "invalid  Name");
                tempp = true;
                break;
            } else {
                custname = textfield2.getText();
                tempp = false;
            }

            if (textfield3.getText() == "") {
                JOptionPane.showMessageDialog(null, "Invalid phone number");
                tempp = true;
                break;

            } else {
                custphone = textfield3.getText();
                tempp = false;
            }
            if (textfield4.getText() == "") {
                JOptionPane.showMessageDialog(null, "Invalid email address");
                tempp = true;
                break;

            } else {
                custemail = textfield4.getText();
                tempp = false;

            }
            if (textfield5.getText() == "") {
                JOptionPane.showMessageDialog(null, "Invalid postal code");
                tempp = true;
                break;

            } else {
                postalCode = textfield5.getText();
                tempp = false;

            }

        }

        if (tempp == false) {
            customerlist.addCustomers(new Customer(custID, custname, custphone, custemail, postalCode));
            JOptionPane.showMessageDialog(null, "Record is saved successfully");
        }
    }

}
