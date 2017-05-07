/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.window.*;
/**
 *
 * @author Jana
 */
public class Main {
    private MainWindowView mainWindow;
    private ComputerWindowsView computerWindow;
    private LeaseWindowView leaseWindow;
    
    
    public Main(){
        mainWindow = new MainWindowView();
        computerWindow = new ComputerWindowsView();
        leaseWindow = new LeaseWindowView();
        mainWindow.setVisible(true);
        
        
        mainWindow.onComputerClicked(new changeScreen(this.mainWindow,this.computerWindow));
        mainWindow.onUserClicked(new changeScreen(this.mainWindow,this.leaseWindow));
        
        leaseWindow.onBackClicked(new changeScreen(leaseWindow,mainWindow));
        //leaseWindow.on
        
        computerWindow.onBackClicked(new changeScreen(computerWindow,mainWindow));
    }
    
    
    
    public static void main(String args[]){
        //Window main = new LeaseWindowView();
        //main.setVisible(true);
        //mainWindow
        new Main();
        
    }
}
