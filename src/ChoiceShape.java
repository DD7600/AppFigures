
import javax.swing.*;

/**
 * 
 * @author DOUDOU DIAWARA
 * @DATE 5/12/2021
 * 
 * @ENG this class ChoiceShape help user to choose shape to draw
 *
 */
public class ChoiceShape {
	
	


	/*rectangle shape / forme rectangle*/
	private JCheckBox rectangle;
	
	/*ovale shape / forme ovale*/
	private JCheckBox ovale;
	
	/*Line shape / forme droite*/
	private JCheckBox line ;
	
	/**@Construct without params initialize attributes  JCheckBox in the class 
	 */
	
	public ChoiceShape() {
		
		rectangle = new JCheckBox ("Rectangle");
		ovale = new JCheckBox ("Ovale");
		line = new JCheckBox("Line") ;
		
		
	}
	
	/**
	 * @GETTERS
	 */
	
	public JCheckBox getRectangle() {
		return rectangle;
	}
	
	public JCheckBox getOvale() {
		return ovale;
	}
	
	public JCheckBox getLine () {
		
		return line ;
	}
	
}
