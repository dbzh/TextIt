package com.hwz.textit.gui;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
		frame.setSize(800, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildAboutPannel(frame);

		// Display the window.
		frame.setVisible(true);
	}

	private void buildAboutPannel(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton cancelButton = new JButton(Constants.CANCEL);
		ImageIcon image1 = new ImageIcon(getClass().getResource("TextIt1.jpg"));
		ImageIcon image2 = new ImageIcon(getClass().getResource("TextIt2.jpg"));
		ImageIcon image3 = new ImageIcon(getClass().getResource("TextIt3.jpg"));
		JLabel label1 = new JLabel(image1);
		JLabel label2 = new JLabel(image2);
		JLabel label3 = new JLabel(image3);

	
/*
		label1.setBounds(10, 10, 240, 320);
		label2.setBounds(10, 350, 240, 320);
		label3.setBounds(10, 700, 240, 320);
		cancelButton.setBounds(10, 1050, 100, 25);
	*/	
		
		
		//add to panel
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(cancelButton);
		
		cancelButton.addActionListener(setCancelButtonListener(frame));

	}
	// Cancle button redirectes to StartGui

		public static ActionListener setCancelButtonListener(JFrame frame) {
			ActionListener cancelButtonListener = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					new StartGUI();
				}

			};

			return cancelButtonListener;
		}
}
