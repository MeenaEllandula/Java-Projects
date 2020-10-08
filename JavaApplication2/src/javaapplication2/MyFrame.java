/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import static java.awt.SystemColor.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javaapplication2.Screen1.txtfield1;
import static javaapplication2.Screen1.txtfield2;
import static javaapplication2.Screen1.txtfield3;
import static javaapplication2.Screen1.txtfield4;
import javax.swing.JDesktopPane;

/**
 *
 * @author meena
 */
public class MyFrame extends JFrame {

    private JMenuBar menu;
    private JMenu file;
    private JMenu product;
    private JMenu customer;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem exit;
    private JMenuItem add;
    private JMenuItem find, addcus, findcus;
    private JDesktopPane desktop;
    ProductDB products1 = new ProductDB();

    public MyFrame() {
        menu = new JMenuBar();
        file = new JMenu("File");
        customer = new JMenu("Customer");
        file.setMnemonic(KeyEvent.VK_F);
        product = new JMenu("Product");
        product.setMnemonic(KeyEvent.VK_C);
        load = new JMenuItem("Load");
        addcus = new JMenuItem("Add customer");
        findcus = new JMenuItem("Find Customer");
        customer.add(addcus);
        customer.add(findcus);
        load.setMnemonic(KeyEvent.VK_L);
        save = new JMenuItem("Save");
        save.setMnemonic(KeyEvent.VK_S);
        exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_X);
        add = new JMenuItem("Add product");
        add.setMnemonic(KeyEvent.VK_A);
        find = new JMenuItem("Find Product");
        find.setMnemonic(KeyEvent.VK_E);
        menu.add(file);
        desktop = new JDesktopPane();
        this.add(desktop);
        product.add(add);
        product.add(find);
        menu.add(product);
        menu.add(customer);
        file.add(load);
        file.add(save);
        file.add(exit);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(menu);
        this.add(desktop);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addcus.addActionListener(e -> this.addcustomer());
        this.findcus.addActionListener(e -> this.findcustomer());
        add.addActionListener(e -> this.addpro());
        save.addActionListener(new EventHandler());
        exit.addActionListener(new EventHandler());
        load.addActionListener(new EventHandler());
    }

    public void addpro() {
        Screen1 screen = new Screen1();
        System.out.println("hello");
        JInternalFrame jIF = new StudentIOFrame(screen);
        jIF.setTitle("Add product");
        this.desktop.add(jIF);

    }

    public void addcustomer() {
        System.out.println("hello");
        GUI cus = new GUI();
        System.out.println("hello");
        JInternalFrame jIF = new StudentIOFrame(cus);
        jIF.setTitle("Add Customer");
        this.desktop.add(jIF);

    }

    public void findcustomer() {
        SearchCust cus = new SearchCust();

        JInternalFrame jIF = new StudentIOFrame(cus);
        jIF.setTitle("Search Customer");
        this.desktop.add(jIF);

    }

    private class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                Product p3 = new Product();
                ProductDB db = ProductDB.getProductDB();
                db.AddProduct(p3);
                p3.setProductId(Integer.parseInt(txtfield1.getText()));

                p3.setProductName(txtfield2.getText());
                p3.setProductPrice(Double.parseDouble(txtfield3.getText()));
                p3.setQuantity(Integer.parseInt(txtfield4.getText()));
                JOptionPane.showMessageDialog(null, "New Record is added");
            } else if (e.getSource() == save) {
                ProductDB db = ProductDB.getProductDB();
                db.SaveProducts();
                JOptionPane.showMessageDialog(null, "Records have been saved successfully");
            } else if (e.getSource() == find) {
                ProductDB db = ProductDB.getProductDB();

                Product p4 = new Product();
                boolean success = db.FindProductByProductId(Integer.parseInt(txtfield1.getText()));
                if (success == false) {
                    JOptionPane.showMessageDialog(null, "Record is not found");
                } else {
                    p4.setProductId(Integer.parseInt(txtfield1.getText()));
                    p4.setProductName(txtfield2.getText());
                    p4.setProductPrice(Double.parseDouble(txtfield3.getText()));
                    p4.setQuantity(Integer.parseInt(txtfield4.getText()));
                    db.AddProduct(p4);
                    JOptionPane.showMessageDialog(null, "Record is edited successfully");
                }
            } else if (e.getSource() == exit) {
                System.exit(0);
            } else if (e.getSource() == load) {
                ProductDB db = ProductDB.getProductDB();
                db.LoadProducts();
                JOptionPane.showMessageDialog(null, "Records are loaded successfully");
            }
        }
    }
}
