/*
 * Author: Benjamin McCalmon
 * Version: alpha-1.0
 * Date last modified: 11/23/2022
 * Bulls and Cows McCalmon implementation all rights reserved
 */

import javax.swing.*;

public class App {
	
	private static JFrame frame;
	private static JButton button;
	
	private static final String WINDOW_TITLE = "Bulls and Cows";
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 400;
	private static final int BUTTON_WIDTH = 75;
	private static final int BUTTON_HEIGHT = 20;
	
	public static void createWindow() {
		frame = new JFrame();
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setTitle(WINDOW_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("Play");
		button.setBounds((WINDOW_WIDTH/2)-(BUTTON_WIDTH/2)-1,(WINDOW_HEIGHT/2)-(BUTTON_HEIGHT)-1,BUTTON_WIDTH,BUTTON_HEIGHT);
		button.addActionListener(new ButtonListener(ButtonID.SUBMIT));
		frame.add(button);
	}
	
	public static void main(String[] args) {
		createWindow();
	}

}
