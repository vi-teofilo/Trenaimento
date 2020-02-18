package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {

//		definir a tela e suas caracteristica 
		JFrame janela = new JFrame();
		janela.setTitle("Titulo da minha janela");
		janela.setSize(300, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

//		definir o componente Jbutton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(160, 120, 100, 20);
		
//		definir o componente JLabel de rotulo
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 40, 40, 20);
		
//		 definir o campo de texto
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
//		adicionar os componentes na tela 
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
//		informar a visibilidade da tela 
		janela.setVisible(true);
		

	}

}
