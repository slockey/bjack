package com.bjack.gui.investigation;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1053829349111575092L;

	private static final String[] colorNames = {"Black","Blue","Cyan","Dark Gray","Gray","Green",
			"Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
	private static final Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,
			Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};
	
	private JList<String> colorJList;

	public ListFrame() {
		super("List Sample");
		setLayout(new FlowLayout());
		
		colorJList = new JList<String>(colorNames);
		colorJList.setVisibleRowCount(5);
		
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add to the JFrame
		add(new JScrollPane(colorJList));
		
		// add the listener
		colorJList.addListSelectionListener(
			new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent event) {
					getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
				}
			}
		);
	}
	
}
