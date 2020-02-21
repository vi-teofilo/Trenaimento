package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TesteGui11 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JTabbedPane painelComAbas;
	private JPanel primeieraAba;
	private JPanel segundaaAba;
	private JPanel terceiraaAba;
	
	public void iniciaGui() {
		janela = new JFrame("Exemplo de Painel com Abas");
		painelDaJanela=(JPanel) janela.getContentPane();
		painelComAbas = new JTabbedPane();
		primeieraAba = new JPanel();
		segundaaAba = new JPanel();
		terceiraaAba = new JPanel();
		
//		configurar e adicionar as abas 
		painelComAbas.addTab("Aba 1", primeieraAba);
		painelComAbas.addTab("Aba 2", segundaaAba);
		painelComAbas.addTab("Aba 3", terceiraaAba);
		painelComAbas.setBounds(14,21, 342, 200);
		
//		inserir texto nas abas 
		primeieraAba.add(new JLabel("Está é a primeira aba:"));
		segundaaAba.add(new JLabel("Está é a segunda aba:"));
		terceiraaAba.add(new JLabel("Está é a terceira aba:"));
		
//		configurações do painel da janela 
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);
		
//		configurações da janela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);
		
		
		
		
		
		
	}//fim do iniciaGUi
	
	public static void main(String[] args) {
		new TesteGui11().iniciaGui();
	}
	
	
	
}
