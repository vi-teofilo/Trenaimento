package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui12 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JList list;
	private JLabel label;
	private JScrollPane scroll;
	
	private String[]diaSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
	
	
	
	
	
	public void iniciaGui() {
		janela = new JFrame("Exemplo de lista");
		painelDaJanela=(JPanel) janela.getContentPane();
		list = new JList(diaSemana);
		label = new JLabel("CTRL para multiseleções",JLabel.CENTER);
		scroll = new JScrollPane(list);
		
//		configura parametro da lista 
		
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				label.setText((String)list.getSelectedValue());
				
			}
		});
		
//		configurações do scroll
		scroll.setBounds(10, 60, 300, 90);

//		atributos da label
		label.setOpaque(true);
		label.setBackground(Color.lightGray);
		label.setForeground(Color.black);
		label.setBounds(10, 10, 300,30);
		
//		configuração do painel
		painelDaJanela.setLayout(null);
		painelDaJanela.add(label);
		painelDaJanela.add(scroll);

//		configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
		
	}//fim do iniciaGui
	
	public static void main(String[] args) {
		new TesteGui12().iniciaGui();
	}
}
