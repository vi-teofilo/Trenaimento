package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TesteGui8 {
private JFrame janela;
private JPanel painelDaJanela;
private JLabel jtfSenha;
private JPasswordField jpwSenha;

public void iniciaGui() {
//	criar as intancias 
	janela = new JFrame("Exemplo de Senha:");
	painelDaJanela = (JPanel)janela.getContentPane();
	jtfSenha = new JLabel();
	jpwSenha = new JPasswordField();
	
//configurar a lebel senha 	
	jtfSenha.setText("Senha");
	jtfSenha.setBounds(10, 40, 40, 20);

//	configurar campo de senha 
	jpwSenha.setBounds(60, 40, 100, 20);
//	configurar o painel de senha 
	painelDaJanela.setLayout(null);
	painelDaJanela.add(jtfSenha);
	painelDaJanela.add(jpwSenha);
	
//	configurar a tela 
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(300, 300);
	janela.setVisible(true);
	
	
}


public static void main(String[] args) {
	new TesteGui8().iniciaGui();
}


}
