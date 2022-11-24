import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow extends JFrame {
	private static JButton button;
	private static JLabel label1;
	
	private static final String WINDOW_TITLE = "Bulls and Cows";
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 400;
	
	private static final int BUTTON_WIDTH = 75;
	private static final int BUTTON_HEIGHT = 20;
	
	private static final int LABEL_WIDTH = 6;
	private static final int LABEL_HEIGHT = 20;

	public GameWindow() {
		setupComponents();
		setupWindow();
	}
	
	private void setupComponents() {
		button = new JButton("Start");
		button.addActionListener(new ButtonListener(ButtonID.SUBMIT));
		
		label1 = new JLabel();
		label1.setText("Christ");
	}
	
	private void setupWindow() {
		setLayout(null);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle(WINDOW_TITLE);
		button.setBounds((WINDOW_WIDTH/2)-(BUTTON_WIDTH/2),(WINDOW_HEIGHT/2)-(BUTTON_HEIGHT/2),75,20);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(button);
		add(label1);
		setVisible(true);
	}
}
