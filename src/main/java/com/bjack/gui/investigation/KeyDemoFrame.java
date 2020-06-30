package com.bjack.gui.investigation;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -949837405359992023L;

	private String line1 = "";
	private String line2 = "";
	private String line3 = "";
	private JTextArea textArea;
	
	public KeyDemoFrame() {
		super("Demo'ing keystroke events");
		
		textArea = new JTextArea(10,15);
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea);
		
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent event) {
		line1 = String.format("Key typed: %s", event.getKeyChar());
		setLines2And3(event);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLines2And3(event);
	}

	@Override
	public void keyReleased(KeyEvent event) {
		line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLines2And3(event);
	}
	
	private void setLines2And3(KeyEvent event) {
		line2 = String.format("This key is %san action key.", (event.isActionKey()? "" : "not "));
		
		String tmp = KeyEvent.getKeyModifiersText(event.getModifiers());
		
		line3 = String.format("Modifier keys pressed: %s", (tmp.equals("") ? "none" : tmp));
		
		textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
	}

}
