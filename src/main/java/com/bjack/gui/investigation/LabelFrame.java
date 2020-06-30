/**
 * 
 */
package com.bjack.gui.investigation;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * JFrame sample
 */
public class LabelFrame extends JFrame {

	/**
	 * generated serial uid
	 */
	private static final long serialVersionUID = 4491312294656423515L;

	private JLabel label1; // just text
	private JLabel label2; // text and icon
	private JLabel label3; // added text and icon

	/**
	 * @throws HeadlessException
	 */
	public LabelFrame() throws HeadlessException {

		super("Testing JLabel");
		setLayout(new FlowLayout());

		label1 = new JLabel("Label with text");
		label1.setToolTipText("Label1 tool tip text");
		add(label1);

		Icon bug1 = new ImageIcon(getClass().getResource("bug1.jpeg"));
		label2 = new JLabel("Label with text and icon", bug1, SwingConstants.LEFT);
		label2.setToolTipText("Label2 tool tip text");
		add(label2);

		label3 = new JLabel();
		label3.setText("Label with text and icon at bottom");
		label3.setIcon(bug1);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.BOTTOM);
		label3.setToolTipText("Label3 tool tip text");
		add(label3);

	}

}
