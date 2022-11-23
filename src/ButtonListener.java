import java.awt.event.*;

/**
 * Event handler for buttons. Determines what to do based on its constructor parameter.
 * @see ButtonID
 */
public class ButtonListener implements ActionListener {
	
	private ButtonID id;
	
	/**
	 * @param buttonType Sets the ID of the action
	 * @see ButtonID
	 */
	public ButtonListener(ButtonID id) {
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (id) {
			case SUBMIT:
				System.out.println("Button pressed: Submit");
				break;
			case NEW_GAME:
				System.out.println("Button pressed: New Game");
				break;
			case QUIT:
				System.out.println("Button pressed: Quit");
				break;
		}
	}

}
