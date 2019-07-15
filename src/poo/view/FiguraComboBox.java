package poo.view;

import javax.swing.JComboBox;

import poo.model.Figura;
import poo.model.Quadrado;
import poo.model.Retangulo;
import poo.model.Triangulo;

public class FiguraComboBox extends JComboBox<Figura> {

	private static final long serialVersionUID = 1L;

	public FiguraComboBox() {
	super (new Figura[] { 
			new Quadrado(), 
			new Retangulo()}); 
			//new Triangulo()});
	}
}