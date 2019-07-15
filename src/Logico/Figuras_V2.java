package Logico;


public class Figuras_V2 {
	
	//METODO DESENHAR QUADRADO
	public static void desenharQuadrado(int altura, int largura) {
		String[][] quadrado = new String[altura][largura];
		
		System.out.println("Quadrado ("+altura+" x " +largura+")");
		for (int linha = 0; linha < quadrado.length; linha++) {
			for (int coluna = 0; coluna < quadrado.length; coluna++) {
				quadrado[linha][coluna] = "* ";
			}
		}
		
		for (int linha = 0; linha < quadrado.length; linha++) {
			for (int coluna = 0; coluna < quadrado.length; coluna++) {
				System.out.print(quadrado[linha][coluna]);
			}
			System.out.println();
		}
	}
	
	//METODO DESENHAR RETANGULO
	
	
	public static void main(String[] args) {
		System.out.println("*** ESTE É UM PROGRAMA QUE IRA DESENHAR FIGURAS NA TELA ***");
		System.out.println();
		
		Figuras_V2.desenharQuadrado(7, 7);
		Figuras_V2.desenharQuadrado(10, 10);
		Figuras_V2.desenharQuadrado(10,10 );
		
		String[][] retangulo = new String[5][9];
		
		System.out.println("Retângulo (5 x 9)");
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				
				if(linha == 0 || linha == retangulo.length-1 || coluna == 0 || coluna == retangulo[linha].length-1) {
					retangulo[linha][coluna] = "* ";
				} else {
					retangulo[linha][coluna] = "  "; 
				}
			}
		}
		
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				System.out.print(retangulo[linha][coluna]);
			}
			System.out.println();
		}
		
	}
}