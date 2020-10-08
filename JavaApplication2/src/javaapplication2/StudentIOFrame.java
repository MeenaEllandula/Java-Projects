/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author meena
 */
public class StudentIOFrame extends JInternalFrame{
    private JPanel studentIOGUI;
    public StudentIOFrame(JPanel studentIOPanel){
     studentIOGUI = studentIOPanel ;
     this.add(studentIOGUI);
     this.setSize(500,200);
     this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
     this.setVisible(true);
     this.setClosable(true);
     this.setResizable(true);
    }
}