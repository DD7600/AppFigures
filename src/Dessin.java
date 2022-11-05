
import java.awt.Graphics;

import javax.swing.*;
/**
 * 
 * @author Doudou DIAWARA
 *@Class this class help draw a shape of your choice 
 */
class Dessin extends JPanel {
	
	private boolean rectangle = false, ovale = false , line = false ;
	private int haut  ; 
    private int larg  ;
	
	
	@Override
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g) ;
		
			if (rectangle) {
				
				g.drawRect (302, 119, larg, haut) ;
			
			}
			
			if (ovale) {
				
				g.drawOval (302, 119, larg, haut) ;
				
			}
			
			if(line) {
				
				g.drawLine (302, 119, larg, haut) ;
				
			}
	}
	
/**
 * 	SETTERS
 */
	
	public void setRectangle(boolean b) {
		
		rectangle = b ;
		
	
		
	}
	
public void setOvale(boolean b) {
		
		ovale = b ;
		
	
		
	}

public void setLine(boolean b) {
	
	line = b ;
	
	
	
}
	
public void setLarg(int l) {
		
		this.larg = l ;
		
		
	}

public void setHaut(int h) {
	
	this.haut = h ;
	
}
	
		

		}
