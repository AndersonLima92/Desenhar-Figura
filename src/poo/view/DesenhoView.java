package poo.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DesenhoView extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextArea area;
	
	public DesenhoView() {
		initCompontents();	//INICIA COMPONENTES DE TELA
		initView();			//ORGANIZA COMO SERAO APRESENTADOS(LAYOUT)
		init();				//DEFINI INFORMAÇÕES SOBRE A JANELA
	}

	public void preenchertextArea(String desenho) {
		area.setText(desenho);
		this.setVisible(true);
	}
	
	public void limparTextArea() {
		area.setText("");
	}
	
	private void init() {
		this.setTitle("Impacta Desenho");				//NOME DA JANELA
		this.setSize(650, 450);							//TAMANHO DA JANELA
		this.setLocationRelativeTo(null);				//PARA ABRIR A JANELA NO CENTRO DA TELA
		this.setResizable(false);						//NAO DEIXA ALTERAR O TAMNAHO DA JANELA
		
	}

	private void initView() {
		JScrollPane painel = new JScrollPane(area);
		area.setEditable(false);
		area.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
		
		this.add(painel);
	}

	private void initCompontents() {
		area = new JTextArea();
		
	}
}
