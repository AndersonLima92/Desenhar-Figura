package Logico;

public class Figuras {
	public static void main(String[] args) {
		/*
		 *   QUADRADO (5 X 5)
		 *   * * * * *
		 *   * * * * *
		 *   * * * * *
		 *   * * * * *
		 *   
		 */
		String[][] quadrado = new String[5][5];
		
		System.out.println("Quadrado (5 x 5)");
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
		
		// ----------------- FIM DO QUADRADO ----------------------//
		
		/*
		 *   RETANGULO (5 X 9)
		 *   * * * * * * * * *
		 *   *               *
		 *   *               *
		 *   *               *
		 *   * * * * * * * * *
		 */
		
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
		
		// ----------------- FIM DO RETANGULO ----------------//
		
		// FALTA O TRINAGULO!!!
		
	}
}
