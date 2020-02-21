package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TesteGui10 {
//	criar as variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] {"uf","Estado"};
	private String[][] dados = new String[] []{
			{"SP","São Paulo"},
			{"RJ","Rio de Janeiro"},
			{"RN", "Rio Grande do Norte"},
			{"PR","Paraná"}};	
	private JLabel lblIncluirUf;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirUf;
	private JTextField jtfIncluirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

//criar as intancias 
	
public void iniciaGui() {
	janela = new JFrame("Exemplo de Tabela");
	lblIncluirUf = new JLabel("Informe UF:");
	lblIncluirEstado = new JLabel("Informe Estado:");
	jtfIncluirUf = new JTextField();
	jtfIncluirEstado = new JTextField();
	botaoExcluir = new JButton("Excluir");
	botaoIncluir = new JButton("Incluir");
	painelDaJanela=(JPanel) janela.getContentPane();
	
//	criar tabela ao inves de passar os atributos direto 
//	iremos colocar em um modelo de dados 
	DefaultTableModel modelo = new DefaultTableModel(dados,colunas);
	tabela = new JTable(modelo);
	tabela.setEnabled(true);
	
//	instanciando e inserindo a tabela no scroll
	painelDeScroll = new JScrollPane(tabela);
	painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
	painelDeScroll.setBounds(10, 100, 360, 95);
	tabela.setBounds(10, 30, 300, 95);
	botaoExcluir.setBounds(195, 200, 100, 50);
	botaoIncluir.setBounds(75, 200, 100, 50);
	lblIncluirUf.setBounds(15, 20, 70, 25);
	lblIncluirEstado.setBounds(15, 55,90, 25);
	jtfIncluirUf.setBounds(110, 20, 50, 25);
	jtfIncluirEstado.setBounds(110, 55, 260, 25);
	
	
//	adiciona ação do botão
	botaoIncluir.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			adicionaLinha();
		}
	});
	
	botaoExcluir.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			excluirLinha();
		}

	});
	
	painelDaJanela.setLayout(null);
	painelDaJanela.add(lblIncluirUf);
	painelDaJanela.add(lblIncluirEstado);
	painelDaJanela.add(jtfIncluirUf);
	painelDaJanela.add(jtfIncluirEstado);
	painelDaJanela.add(botaoExcluir);
	painelDaJanela.add(botaoIncluir);
	painelDaJanela.add(painelDeScroll);
	
//	configurações da janela 
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setLocationRelativeTo(null);
	janela.setSize(400, 300);
	janela.setVisible(true);
}//fim do metodo iniciaGui.


public void excluirLinha() {
	
//	atribuindo o botao excluir
	if (tabela.getSelectedRow()== -1) {
		JOptionPane.showMessageDialog(null, "Selecione uma linha");
	}else if (tabela.getSelectedRowCount()>1) {
		JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");
	}else {
//		obter o modelo da tabela criada 
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		modelo.removeRow(tabela.getSelectedRow());
		JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
	}
	
	
	
	
}
public void adicionaLinha() {
//consistencia inicial
	if (jtfIncluirUf.getText().equals("")|| jtfIncluirEstado.getText().equals("")) {
		JOptionPane.showMessageDialog(null, "Campo UF e Estado obregário");
	}else {
//		obter o modelo da tabela criada 
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
//		add nova linha com os dados
		modelo.addRow(new String[] {jtfIncluirUf.getText(),jtfIncluirEstado.getText()});
		jtfIncluirUf.setText("");
		jtfIncluirEstado.setText("");
		JOptionPane.showMessageDialog(null, "Dados includos com sucesso!");
		
	}
	
}
	public static void main(String[] args) {
		new TesteGui10().iniciaGui();
	}
	
	
	
}
