package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui5 {
// declarações de variaveis 
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;
	
	
	public void iniciaGui () {
// criar as instancia 
		janela = new JFrame("Exemplo de Check Box:");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel)janela.getContentPane();
		
		
//		configurações da label escolha 
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de Pagamento:");
		lblEscolha.setBounds(42, 15, 208, 18);

		
//		configurações da label Resposta  
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42, 230, 300, 18);
		
//	configurações da Check box de Cartão de Credito 
		cbCC.setText("Cartão de Crédito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

//		configurações da Check box de Deposito Bancario 
		cbDB.setText("Depósito Bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);
		
//		configurações da Check box de Boleto bancario	
		cbBB.setText("Boleto Bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);
		
//		configurações do botao
		btnResposta.setText("Resposta");
		btnResposta.setBounds(140, 196, 95, 28);
		
//		adicionar ação do botao 
			btnResposta.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					verificarSelecionado();
				}	
			});
//		adicionar componentes no painel de tela 
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);
		
//	configuração da tela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);
		
	}
	public static void main(String[] args) {
		new TesteGui5().iniciaGui();
	}
	
	
	public void verificarSelecionado() {
//		varificar qual radio button foi selecionado 
			String resposta = "";
			if (cbCC.isSelected()) {
				resposta += cbCC.getText();
			}
			if (cbDB.isSelected()) {
				resposta += cbDB.getText();
			}
			if (cbBB.isSelected()) {
				resposta += cbBB.getText();
			}
			
//		troca a cor da fonte para vermelho
			if (!resposta.equals("")) {
				lblResposta.setText(resposta);			
			}
			resposta = "";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
