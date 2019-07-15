package poo.model;

import poo.domain.UniDimensional;

public class Quadrado extends Figura implements UniDimensional {

	public Quadrado() {
		super(5, "A");
	}
	
	@Override
	public void setLado(int lado) {
		setAltura(lado);
		setLargura(lado);
	}
	@Override
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(toString()+ "\n");
		for (int linha = 1; linha <= getAltura(); linha++) {
			for (int coluna = 1; coluna <= getLargura(); coluna++) {
				desenho.append(getSimbolo() + " ");
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}

}
