import java.awt.event.*;

/**
 * Event handler for buttons. Determines what to do based on its constructor parameter.
 * @see ButtonID
 * @see ButtonListener#ButtonListener(ButtonID)
 */
public class ButtonListener implements ActionListener {
	
	private ButtonID id;
	private GameWindow frame;
	
	/**
	 * Event handler for buttons. Determines what to do based on its ID.
	 * <ul>
	 * <li>
	 * <code>ButtonID.SUBMIT</code> Submits the current input as an answer
	 * </li>
	 * 
	 * <li>
	 * <code>ButtonID.NEW_GAME</code> Closes the current game and starts a new one
	 * </li>
	 * 
	 * <li>
	 * <code>ButtonID.QUIT</code> Exits the game
	 * </li>
	 * </ul>
	 * @param id Sets the ID of the button listener
	 * @see ButtonID
	 */
	public ButtonListener(ButtonID id, GameWindow frame) {
		this.id = id;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (id) {
			case SUBMIT:
				
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
