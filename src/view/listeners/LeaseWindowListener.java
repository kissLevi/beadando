/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.listeners;

import java.awt.event.ActionListener;

/**
 *
 * @author Jana
 */
public interface LeaseWindowListener {
    

	void onNewUserClicked(ActionListener click);

	void onBackClicked(ActionListener click);
	
        void onComputerClicked(ActionListener click);

	void onPayClicked(ActionListener click);

	void onChangeBtnClicked(ActionListener click);

	void onSearchClicked(ActionListener click);

	void onLoginClicked(ActionListener click);

	void onRegistrateClicked(ActionListener click);

	void onLogOffClicked(ActionListener click);

}