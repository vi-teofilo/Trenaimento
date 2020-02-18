package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

//	declarar os componentes de tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;  //
	
	
	public TesteGui3() {
		iniciaGui();	
	}
	
	public void iniciaGui() {
//		Cria a janela (instancia)
		janela = new JFrame();
		
//		criar area de texto 
		area = new JTextArea();
		
//		criar o primeiro botão
		botao1 = new JButton("Clique aqui");
		
//		Adicionar o metodo desenvolvido na classe TextoListerner 
//		addActionListener(new TextoListener()) intancia  o TextoListener e mostra tudo o que tem dentro dela 
		botao1.addActionListener(new TextoListener());
		
//		criar o segundo botao 
		botao2 = new JButton("Troca cor");
		botao2.addActionListener(new CorListener());
		
//		cria um campo para digitar texto 
		campo = new JTextField();
//		Adicionar o metodo desenvolvido na classe TextoListerner		
		campo.addActionListener(new TextoListener());
		
//		adicionar o botao 1 ao painel da janela
//	BorderLayout controlador do java 	
		janela.getContentPane().add(BorderLayout.EAST,botao2);
//		adicionar o botao 2 ao painel da janela	
		janela.getContentPane().add(BorderLayout.SOUTH,botao1);
//		adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER,area);
//		adicionar JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		
//		Configurar o tamanho da tela 
		janela.setSize(300, 300);
//		configurar a visibilade da tela 
		janela.setVisible(true);
//		
	}
//	classe dentro de classe 
	public class TextoListener implements ActionListener {
	
	public void actionPerformed(ActionEvent arg0) {
//		tem função de contatenar o campo e vc adiciona \n para pular uma linha 
//		sempre que o usuario adicionar um texto
		area.append(campo.getText()+"\n");
//		aqui vc esta limpando o campo digitado pelo usuario
		campo.setText(null);
		
	}
		
	}
	
	public class CorListener implements ActionListener{
// mais uma classe criada para adicionar cor 
		public void actionPerformed(ActionEvent e) {
//		se o fundo JTextArea for neutro troca para preto 

		if (area.getBackground().equals(Color.BLACK)) {
//			se for preto vai trocar pra branco
			area.setBackground(Color.WHITE); // troca o fundo 
			area.setForeground(Color.BLACK);//troca a letra 
		}else {
//		troca a cor para preto 	
			area.setBackground(Color.BLACK);
			area.setForeground(Color.WHITE);
		}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new TesteGui3();
	}
}
