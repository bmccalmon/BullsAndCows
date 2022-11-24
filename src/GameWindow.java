import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow extends JFrame {
	private static JButton button;
	private static JLabel label1;
	
	private static final String WINDOW_TITLE = "Bulls and Cows";
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 400;

	public GameWindow() {
		setupComponents();
		setupWindow();
	}
	
	private void setupComponents() {
		button = new JButton("Start");
		button.addActionListener(new ButtonListener(ButtonID.SUBMIT,this));
		
		label1 = new JLabel();
		label1.setText("Not pressed");
	}
	
	private void setupWindow() {
		setLayout(new GridBagLayout());
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle(WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(button);
		add(label1);
		setVisible(true);
	}
	
	public JLabel getLabel1() {
		return label1;
	}
	
	public JButton getButton() {
		return button;
	}
}
