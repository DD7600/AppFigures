import javax.swing.JComboBox;
import javax.swing.JComponent;

/**
 * 
 * @author Doudou Diawara
 *@Date 20/11/21
 *
 *@class : this class create a object ChoiceColor who goal is to make your color of choice
 */

public class ChoiceColor extends JComponent {

	/*attribute color */
	private String [] color = {"white","red", "yellow" , "grenn" , "blue" , "orange" };
	private JComboBox <String> box ;
	
	/**@Constructor with no param who initialise object ChoiceColor with default Color
	 * 
	 */
	public ChoiceColor() {
		
		
		box = new JComboBox <String> (color) ;
	
		
		
	}

	/**
	 * 
	 * @param String [] color who initialise object ChoiceColor with your choice of color in
	 * param
	 */
	public ChoiceColor(String [] couleur) {
		
		box = new JComboBox <String> (couleur) ;
		
	}
	/***************
	 * GETTERS
	 * 
	 */
	public JComboBox getColor() {
 		
		return box ;
	}
	
	/*****************
	 * SETTERS
	 */
	public void setColor(String [] color) {
		
		this.color = color ;
		
	}
	
}
