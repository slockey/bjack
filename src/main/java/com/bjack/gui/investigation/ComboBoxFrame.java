/**
 * 
 */
package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author slockey
 *
 */
public class ComboBoxFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5426517130052413714L;

	private JComboBox<String> comboBox;
	private JTextField textField;

	private static final String[] names = {"bug1", "bug2", "bug3", "bug4"};
	
	public ComboBoxFrame () {
		super("JComboBox testing");
		setLayout(new FlowLayout());
		
		textField = new JTextField("text will change", 20);
		add(textField);
		
		comboBox = new JComboBox<String>(names);
		comboBox.setMaximumRowCount(3);
		
		comboBox.addItemListener(
				new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent event) {
						if (event.getStateChange() == ItemEvent.SELECTED) {
							textField.setText(names[comboBox.getSelectedIndex()]);
						}
					}
				}
		);
		add(comboBox);
	}
}
