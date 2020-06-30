/**
 * 
 */
package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author slockey
 *
 */
public class RadioButtonFrame extends JFrame {

	/**
	 * generated
	 */
	private static final long serialVersionUID = -1963123935597586198L;

	private static final Font PLAIN = new Font("Serif", Font.PLAIN, 14);
	private static final Font BOLD = new Font("Serif", Font.BOLD, 14);
	private static final Font ITALIX = new Font("Serif", Font.ITALIC, 14);
	private static final Font BOLD_ITALIX = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	
	private JTextField textField;
	
	private JRadioButton plainJRadioButton;
	private JRadioButton boldJRadioButton;
	private JRadioButton italicJRadioButton;
	private JRadioButton boldItalicJRadioButton;
	private ButtonGroup radioGroup;
	
	public RadioButtonFrame() {
		
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		// instantiate the text field
		textField = new JTextField("Font style change", 25);
		add(textField);
		
		// instantiate the buttons
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton);
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		// associate the buttons with the button group
		radioGroup = new ButtonGroup();
		radioGroup.add(plainJRadioButton);
		radioGroup.add(boldJRadioButton);
		radioGroup.add(italicJRadioButton);
		radioGroup.add(boldItalicJRadioButton);
		
		// add the handler code
		plainJRadioButton.addItemListener(new JRadioButtonHandler(PLAIN));
		boldJRadioButton.addItemListener(new JRadioButtonHandler(BOLD));
		italicJRadioButton.addItemListener(new JRadioButtonHandler(ITALIX));
		boldItalicJRadioButton.addItemListener(new JRadioButtonHandler(BOLD_ITALIX));
		
		textField.setFont(PLAIN);
	}

	private class JRadioButtonHandler implements ItemListener {

		private final Font font;
		
		public JRadioButtonHandler(Font font) {
			this.font = font;
		}
		
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}
		
	}
}
