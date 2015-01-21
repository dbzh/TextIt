package com.hwz.textit.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.hwz.textit.gui.*;
import com.hwz.textit.lib.Constants;

public class About {
	public About(){
		showAbout();
	}

	private void showAbout() {
		// Create and set up the window.
		JFrame frame = new JFrame("About");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildAboutPannel(frame);

		// Display the window.
		frame.setVisible(true);
	}

	private void buildAboutPannel(JFrame frame) {
		JPanel panel = new JPanel();
		JButton cancelButton = new JButton(Constants.CANCEL);


		
		panel.setLayout(null);
		
		cancelButton.addActionListener(setCancelButtonListener(frame));

	}
}
