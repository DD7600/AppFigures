
import java.awt.*;

public class ScreenSize {
	
	/*Attribut width pour la largeur de la fenetre
	 * height pour la hauteur de la fenetre
	 * */
	private int width ;
	private int height;
	
	/*Recupere les proprietes de l'ecran
	 * Dimension ****x**(getDefaultScrennSize)
	 * */
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension dim = tk.getScreenSize();
	
	/*Constructeur sans argument initialise les Attributs
	 * width , height
	 * */
	
	public ScreenSize() {
		
		width = dim.width;
		height = dim.height;
		
	}

/*
 * GETTERS
 * */
	
	
/*Retourne la largeur de l ecran divise par deux
 * */	
	
	public int getWidth() {
		
		
		return width / 2;
	}
	
/*Retourne la hauteur de l ecran diviser par deux*/
	
	public int getHeight() {
		
	return height / 2 ;	
	
	}	
	
/*
 * SETTERS
 */
	
	/*change la largeur de la fenetre (change width)*/
	public void setWidth(int larg) {
	
		width = larg;
	}
	
	/*change largeur de la fenetre (change height)*/
	
	public void setHeight(int haut) {
		
		height = haut;
		
	}
	
	
	
}
