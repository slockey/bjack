/**
 * 
 */
package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * playing with buttons
 */
public class ButtonFrame extends JFrame {

	/**
	 * generated id
	 */
	private static final long serialVersionUID = -5575758598606141064L;

	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrame() {
		super("playing with buttons");
		setLayout(new FlowLayout());
		
		// plain button
		plainButton = new JButton("Plain button");
		add(plainButton);
		
		// fancy button
		Icon bug1 = new ImageIcon(getClass().getResource("bug1.jpeg"));
		// this should be a different image...
		Icon bug2 = new ImageIcon(getClass().getResource("bug1.jpeg"));
		fancyButton = new JButton("Fancy button", bug1);
		fancyButton.setRolloverIcon(bug2);
		add(fancyButton);
		
		// button handler - action listeners
		ButtonHandler handler = new ButtonHandler();
		plainButton.addActionListener(handler);
		fancyButton.addActionListener(handler);
		
	}

	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed %s", event.getActionCommand()));
			
		}
		
	}
}
