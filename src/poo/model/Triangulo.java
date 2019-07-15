package poo.model;

import poo.domain.UniDimensional;

public class Triangulo extends Figura implements UniDimensional {
	
	public Triangulo() {
		super(5,9, "T");
	}
	
	@Override
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		//TODO RESOLVER A LÓGICA DEPOIS
		return desenho.toString();
	}

	@Override
	public void setLado(int lado) {
		// TODO Auto-generated method stub
		
	}

}
