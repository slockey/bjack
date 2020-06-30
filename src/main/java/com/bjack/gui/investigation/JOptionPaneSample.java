package com.bjack.gui.investigation;

import javax.swing.JOptionPane;

/**
 * Input 2 numbers and sum
 */
public class JOptionPaneSample {

	public static void main(String[] args) {

		String firstInput = JOptionPane.showInputDialog("Enter an integer");
		String secondInput = JOptionPane.showInputDialog("Enter another integer");

		int firstInt = Integer.parseInt(firstInput);
		int secondInt = Integer.parseInt(secondInput);
		int sum = firstInt + secondInt;

		JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);

	}
}
