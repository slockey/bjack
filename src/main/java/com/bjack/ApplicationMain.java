package com.bjack;

import com.bjack.gui.BJackTableCli;

public class ApplicationMain {

	public static void main(String[] args) {
		BJackTableCli table = new BJackTableCli();
		String text = table.getUserTextAction();
		System.out.println(text);
	}
}