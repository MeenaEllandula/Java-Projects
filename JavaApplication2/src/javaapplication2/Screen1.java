/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author meena
 */
public class Screen1 extends JPanel {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    public static JTextField txtfield1;
    public static JTextField txtfield2;
    public static JTextField txtfield3;
    public static JTextField txtfield4;
    private JButton Add;
    private JButton butSearch;
   

    public JTextField gettxtfield1() {
        return txtfield1;
    }

    public JTextField getTxtProductName() {
        return txtfield2;
    }

    public JTextField getTxtProductPrice() {
        return txtfield3;
    }

    public JTextField getTxtQuantity() {
        return txtfield4;
    }
    
    public Screen1(){
    
    lbl1 = new JLabel("Product Id");
    txtfield1 = new JTextField(20);
    lbl2 = new JLabel("Product Name");
    txtfield2 = new JTextField(20);
    lbl3 = new JLabel("Product Price");
    txtfield3 = new JTextField(20);
    lbl4 = new JLabel("Quantity");
    txtfield4 = new JTextField(20);
    Add = new JButton("Add");
    butSearch = new JButton("Search");
   
    this.setLayout(new GridLayout(5,2));
    this.add(lbl1);
    this.add(txtfield1);
    this.add(lbl2);
    this.add(txtfield2);
    this.add(lbl3);
    this.add(txtfield3);
    this.add(lbl4);
    this.add(txtfield4);
    this.add(Add);
    this.add(butSearch);
    Add.addActionListener(new EventHandler());
    butSearch.addActionListener(new EventHandler());
   
    }
    private class EventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Add )
        {
                    Product p = new Product();
                    ProductDB db = ProductDB.getProductDB();
                    db.AddProduct(p);
                    p.setProductId(Integer.parseInt(txtfield1.getText())); 
                    p.setProductName(txtfield2.getText());
                    p.setProductPrice(Double.parseDouble(txtfield3.getText())) ;
                    p.setQuantity(Integer.parseInt(txtfield4.getText()));
                    JOptionPane.showMessageDialog(null, "New Record is added");
        }
        else if(e.getSource() == butSearch)
        {
               ProductDB db = ProductDB.getProductDB();               
               Product p1 = new Product();
               boolean success = db.FindProductByProductId(Integer.parseInt(txtfield1.getText()));
               if(success == false)
                   JOptionPane.showMessageDialog(null, "Record is not found");
               else
               {
                p1.setProductId(Integer.parseInt(txtfield1.getText())); 
                    p1.setProductName(txtfield2.getText());
                    p1.setProductPrice(Double.parseDouble(txtfield3.getText())) ;
                    p1.setQuantity(Integer.parseInt(txtfield4.getText()));
                  db.AddProduct(p1);
                   JOptionPane.showMessageDialog(null, "Record is edited successfully");
               }
        }
        }
    }
}

