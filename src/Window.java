/**
 * 
 * @author Doudou Diawara
 *@version 23 decembre 2021
 *@class : this class create a object Window where you can draw your shape with some features
 */
import java.awt.BorderLayout
;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


public class Window extends JFrame implements ActionListener {
	
	
	private final String title ="FIGURES" ;
	private JComboBox actionColor ;
	private Dessin panUn = new Dessin ();
	private Dessin panDeux = new Dessin () ;
	private JLabel champ = new JLabel("DIMENSION") ;
	private JTextField weidht = new JTextField (3);
	private JTextField height = new JTextField (3);
	private int larg = 20 ;
	private int haut = 20;
	ChoiceShape tmpShape ;
	
	
	/**Constructeur qui prend en parametre un 
	 * @param  Object ScrennZise qui donne la taille de la fenetre
	 * @param Object ChoiceColor qui construit la liste des couleurs
	 * @param Object ChoiceShape qui permet de choisir les formes a dessiner
	 * 
	 * */
	
	public Window(ScreenSize size,ChoiceColor color , ChoiceShape shape) {
		
		/*title*/
		setTitle(title);
		
		/*Size window*/
		setSize(size.getWidth(),size.getHeight());
		
		//Handaling panel
		
		Container contenu = getContentPane() ;
		contenu.setLayout(new BorderLayout());
	
		
		/*add panUn background color*/
	
		panUn.setBackground(Color.WHITE);
		contenu.add(panUn);
	
		
		/*JPanel temporairy for border*/
		JPanel tmp = new JPanel();
		JPanel tmpDeux = new JPanel();
		JPanel tmpTrois = new JPanel();
		
		tmp.setBackground(Color.gray) ;
		tmpDeux.setBackground(Color.gray);
		tmpTrois.setBackground(Color.gray);
		contenu.add(tmpDeux , BorderLayout.WEST); 
		contenu.add(tmp , BorderLayout.EAST);
		contenu.add(tmpTrois , BorderLayout.NORTH);

	
		/*add panDeux*/
		
		panDeux.setPreferredSize(new Dimension (50,50));
		contenu.add(panDeux,"South");
		panDeux.setBackground(Color.gray);
		
		//add JComboBox to panelDeux
		
		actionColor = color.getColor() ;
		FlowLayout left = new FlowLayout(FlowLayout.LEFT);
		panDeux.setLayout(left);
	
		
		//Adding component to panel panDeux
		panDeux.add(actionColor); /*JComboBox*/
		
		weidht.setEditable(true);
		height.setEditable(true);
		
	
		
		/*add JLabel*/
		champ.setBackground(Color.WHITE);
		champ.setForeground(Color.red);
		panDeux.add(champ);
		
		/*JTextField*/
		weidht.setPreferredSize(new Dimension(80,20));
		height.setPreferredSize(new Dimension(80,20));
		panDeux.add(weidht);
		panDeux.add(height);
		
		
		
		//Handling ChoiceShape
		
	
		tmpShape = shape ;
		shape.getRectangle().setForeground(Color.red);
		shape.getOvale().setForeground(Color.red) ;
		shape.getLine().setForeground(Color.red);
		
		panDeux.add(shape.getRectangle());
		panDeux.add(shape.getOvale());
		panDeux.add(shape.getLine()) ;
		
		/*Handling Event*/
		
		actionColor.addActionListener(this);
		weidht.addActionListener(this);
		height.addActionListener(this);
		
		shape.getRectangle().addActionListener(this);
		shape.getOvale().addActionListener(this);
		shape.getLine().addActionListener(this);
		
	}
	
/*
 * HANDLING EVENT
 */
	@Override
	public void actionPerformed(ActionEvent act) {
		
	 String choice = (String) actionColor.getSelectedItem()	;	
	 /*Handling background color choice*/
	 
	 switch (choice) {
	 
	 case "white":
		 panUn.setBackground(Color.white);
		 break;
	 
	case "red":
		
		panUn.setBackground(Color.red);
		break;
		
	case "yellow":
		panUn.setBackground(Color.yellow);
		break;
	case "grenn":
		panUn.setBackground(Color.green);
		break;
		
	case "blue":
		panUn.setBackground(Color.blue);
		break;
	case "orange":
		panUn.setBackground(Color.orange);
		break;

	default:
		break;
	}
	 
	 /*Handling input dimension to draw*/
	 
	if (act.getSource() == weidht) {
		
		
	larg = Integer.parseInt(weidht.getText());
	
	panUn.setLarg(larg);
	
	}
	
	if (act.getSource() == height) {
		
		haut = Integer.parseInt(height.getText());
		
		panUn.setHaut(haut);
		
		}
	
	/*drawing Rectangle*/
	if (act.getSource() == tmpShape.getRectangle() ) {
		
		
		
		panUn.setRectangle(tmpShape.getRectangle().isSelected()) ;
	
		

	
		/*update paintComponent*/
	panUn.repaint();
		
		

	
		
	}
	 
	/*drawing Ovale*/
	if (act.getSource() == tmpShape.getOvale() ) {
		
      
		panUn.setOvale(tmpShape.getOvale().isSelected()) ;
		
	
		/*update paintComponent*/
		panUn.repaint();
	}
	
	/*drawing line*/
	if (act.getSource() == tmpShape.getLine() ) {
		
		
		 
		panUn.setLine(tmpShape.getLine().isSelected()) ;
		
		/*update paintComponent*/
		panUn.repaint();
	}
	
	

		
	}
	


}



	



