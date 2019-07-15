package Logico;

public class FiguraTriangulo {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 1; contador ++) {
			int resto = contador % 2;
			
			
			if( resto == 0) {
				System.out.println("     *");
			}else {
				System.out.println("    ***");
				if (resto == 0) {
				}else {
			System.out.println("   *****");
			if (resto == 0) {
			}else {
				System.out.println("  *******");
				if (resto <= 0) {
				}else {
					System.out.println(" *********");
					
				}
			}
				}
			}
		}
	}
}
