package poo.model;

import poo.domain.BiDimensional;

public class Retangulo extends Figura implements BiDimensional {
	
	public Retangulo() {
		super(5,9, "R");
	}

	@Override
	public void setAlt(int altura) {
		super.setAltura(altura);
	}
	
	@Override 
	public void setLarg(int largura) {
		super.setLargura(largura);
	}
	
	@Override
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(toString ()+ "\n");
		for (int linha = 1; linha <= getAltura(); linha++) {
			for (int coluna = 1; coluna <= getLargura(); coluna++) {
				if(linha == 1 || linha == getAltura() || coluna == 1 || coluna == getLargura()) {
				desenho.append(getSimbolo() + " ");
			} else {
			desenho.append(getFundo() + " ");
			}
		}	
		desenho.append("\n");
		}
		return desenho.toString();
	}
}
