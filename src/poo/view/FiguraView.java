package poo.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import poo.domain.BiDimensional;
import poo.domain.UniDimensional;
import poo.model.Figura;

public class FiguraView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel figuraLabel;
	private JComboBox<Figura>figuraComboBox;
	private JLabel simboloLabel;
	private JTextField simboloTextField;
	private JLabel alturaLabel;
	private JSpinner alturaSpinner;
	private JLabel larguraLabel;
	private JSpinner larguraSpinner;
	private JButton desenharButton;
	private JButton limparButton;
	private DesenhoView desenhoView;
	
	public FiguraView() {
		initComponents();	// INICIA COMPONTENTES DE TELA
		initView();			// ORGANIZA COMO SERÃO APRESENTADAS(layout)
		init();				// DEFINI INFORMAÇÕES SOBRE A JANELA
		
	}

	public void escolherFigura(ActionEvent e) {
		//DEFINIÇÃO DE UMA VARIAVEL DE REFERENCIA DO TIPO FIGURA
		Figura f;
		
		//CAPTURANDO O ITEM COMBOBOX(OBJECT) E CONVRETENDO PARA O TIPO FIGURA
		f = (Figura)figuraComboBox.getSelectedItem();
		
		//DE ACORDO COM A ESCOLHA DA FIGURA A TELA É MODIFICADA
		simboloTextField.setText(f.getSimbolo());
		
		if(f instanceof UniDimensional ) {
		
			alturaLabel.setText("Lado: ");
			alturaSpinner.setValue(f.getAltura());
			larguraLabel.setVisible(false);
			larguraSpinner.setVisible(false);
		} else if(f instanceof BiDimensional) {
			
			alturaLabel.setText("Altura: ");
			larguraLabel.setVisible(true);
			larguraSpinner.setVisible(true);
			alturaSpinner.setValue(f.getAltura());
			larguraSpinner.setValue(f.getLargura());
			
		}
			
		limparFigura(e);	
	}
	
	public void desenharFigura(ActionEvent e) {
		Figura f;
		f = (Figura) figuraComboBox.getSelectedItem();
		
		f.setSimbolo(simboloTextField.getText());
		
		if(f instanceof UniDimensional) {
			UniDimensional d = (UniDimensional) f;
			d.setLado((int) alturaSpinner.getValue());
		} else if(f instanceof BiDimensional) {
			BiDimensional d = (BiDimensional) f;
			d.setAlt((int) alturaSpinner.getValue());
			d.setLarg((int) larguraSpinner.getValue());
		}
		
		desenhoView.preenchertextArea(f.desenhar());
		limparButton.setEnabled(true);
	}
	
	public void limparFigura(ActionEvent e) {
		desenhoView.limparTextArea();
		limparButton.setEnabled(false);
	}
	
	private void init() {
		
		escolherFigura(null);		// PASSAR UM VALOR DE PARAMETRO PARA O MÉTODO
		limparButton.setEnabled(false);
		figuraComboBox.addActionListener(e -> escolherFigura(e));
		desenharButton.addActionListener(e -> desenharFigura(e));
		limparButton.addActionListener(e -> limparFigura(e));
		
		this.setTitle("Impacta Figura");				//NOME DA JANELA
		this.setSize(380,250);							//TAMANHO DA JANELA
		this.setResizable(false);						//NAO DEIXA ALTERAR O TAMANHO DA JANELA
		this.setLocationRelativeTo(null);				//PARA INICIAR A JANELA NO CENTRO DA TELA
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//PARA ENCERRAR O PRORAMA QUANDO CLICAR NO (X) PARA FECHAR
		
	}

	private void initView() {
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(0,2));
		
		painel.add(figuraLabel);
		painel.add(figuraComboBox); 
		painel.add(simboloLabel); 
		painel.add(simboloTextField); 
		painel.add(alturaLabel); 
		painel.add(alturaSpinner); 
		painel.add(larguraLabel); 
		painel.add(larguraSpinner); 
		painel.add(desenharButton); 
		painel.add(limparButton);
		
		this.add(painel);
	}

	
	
	private void initComponents() {
		figuraLabel = new  JLabel ("Figura: ");
		figuraComboBox = new FiguraComboBox();
		simboloLabel = new JLabel("Simbolo: ");
		simboloTextField = new JTextField ("*");
		alturaLabel = new JLabel ("Altura: ");
		alturaSpinner = new JSpinner ( new SpinnerNumberModel(5, 0, 50, 1));
		larguraLabel = new JLabel ("Largura: ");
		larguraSpinner = new JSpinner( new SpinnerNumberModel(9, 0, 50, 1));
		desenharButton = new JButton ("Desenhar");
		limparButton = new JButton ("limpar");
		desenhoView = new DesenhoView();
	}
}
