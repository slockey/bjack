/**
 * 
 */
package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * playing with checkboxes
 *
 */
public class CheckBoxFrame extends JFrame {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -8312761739289943024L;

	private static final Font PLAIN = new Font("Serif", Font.PLAIN, 14);
	private static final Font BOLD = new Font("Serif", Font.BOLD, 14);
	private static final Font ITALIX = new Font("Serif", Font.ITALIC, 14);
	private static final Font BOLD_ITALIX = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox italixCheckBox;
	
	public CheckBoxFrame() {
		super("checkbox playing");
		setLayout(new FlowLayout());
		
		// text box
		textField = new JTextField("font will change", 20);
		textField.setFont(PLAIN);
		add(textField);
		
		// check boxes
		boldCheckBox = new JCheckBox("Bold");
		add(boldCheckBox);
		
		italixCheckBox = new JCheckBox("Italic");
		add(italixCheckBox);
		
		// handler
		CheckBoxHandler handler = new CheckBoxHandler();
		boldCheckBox.addItemListener(handler);
		italixCheckBox.addItemListener(handler);
		
	}
	
	/**
	 * Originally I had implemented this using ActionListener,
	 * but the sample text specified ItemListener so I changed it.
	 * 
	 */
	private class CheckBoxHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent event) {

			if (boldCheckBox.isSelected() && italixCheckBox.isSelected()) {
				textField.setFont(BOLD_ITALIX);
			} else if (boldCheckBox.isSelected()) {
				textField.setFont(BOLD);
			} else if (italixCheckBox.isSelected()) {
				textField.setFont(ITALIX);
			} else {
				textField.setFont(PLAIN);
			}
			
		}
		
	}
	
}
