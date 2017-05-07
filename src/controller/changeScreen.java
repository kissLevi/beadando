/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Jana
 */


//navigates from first to second
public class changeScreen implements ActionListener{
     private JFrame first;
     private JFrame second;
     private final Dimension dim;
     
     //first is active window second is currently unvisible window which we are going to show
     public changeScreen(JFrame first,JFrame second){
         this.first = first;
         this.second = second;
         this.dim = Toolkit.getDefaultToolkit().getScreenSize();
  
     }   

    @Override
    public void actionPerformed(ActionEvent e) {
        second.setLocation(dim.width/2-second.getSize().width/2, dim.height/2-second.getSize().height/2);
        first.setVisible(false);
        second.setVisible(true);
    }
    

}