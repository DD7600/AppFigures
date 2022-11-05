import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		/*Object ScreenSize*/
		ScreenSize taille = new ScreenSize ();
				
		/*Object ChoiceColor*/
		ChoiceColor color = new ChoiceColor () ;
		
		/*Obkect ChoiceShape*/
		ChoiceShape shape = new ChoiceShape();
		
		/*Object Window*/
		Window win = new Window(taille,color,shape);
		
		/*Center*/
		win.setLocationRelativeTo(null);
		
		/*Visibility*/
		win.setVisible(true);
		
		/*kill process*/
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
