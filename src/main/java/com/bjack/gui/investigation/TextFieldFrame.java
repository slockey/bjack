package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {

	/**
	 * generated serial uid
	 */
	private static final long serialVersionUID = 4545819000465012000L;

	private JTextField textField1;			// text field with set size
	private JTextField textField2;			// text field constructed with text
	private JTextField textField3;			// text field with text and size
	private JPasswordField passwordField;	// pwd field with text
	
	public TextFieldFrame() {
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout());
		
		textField1 = new JTextField(10);	// 10 columns
		add(textField1);
		
		textField2 = new JTextField("Enter text here");
		add(textField2);
		
		textField3 = new JTextField("Uneditable text field", 21);
		textField3.setEditable(false);
		add(textField3);
		
		passwordField = new JPasswordField("Hidden text");
		add(passwordField);

		// add the field handler...
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class TextFieldHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if (event.getSource() == textField1) {
				string = String.format("text field 1: %s", event.getActionCommand());
				
			} else if (event.getSource() == textField2) {
				string = String.format("text field 2: %s", event.getActionCommand());
				
			} else if (event.getSource() == textField3) {
				string = String.format("text field 3: %s", event.getActionCommand());
				
			} else if (event.getSource() == passwordField) {
				string = String.format("password field: %s", event.getActionCommand());
				
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
}