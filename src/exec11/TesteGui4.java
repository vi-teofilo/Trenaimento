package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TesteGui4 {
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton bntVerificar;
// JPanel serve para segurança e organização, deixar a coisas mais 
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void iniciaGui() {
// criar as instancia
		janela = new JFrame("Exemplo de Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		bntVerificar = new JButton();
//	quando vc precisa passar uma informação pra uma variavel diferente vc usa (int) ou Integer.parse nesse casso
//	voce usa cast (JPanel)
		painelDaJanela = (JPanel) janela.getContentPane();

		// cria o obgjeto de grupo de botões
//	sempre separa para nao confundir 
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

//	configurações da label Escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil:");
		lblEscolha.setBounds(82, 18, 230, 18);

//	configuração do botao solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

//	configuração do botao casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

//	configuração do botao viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

//	configuração do botao Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);

//	configurações do botao 
		bntVerificar.setText("Verificar");
		bntVerificar.setBounds(126, 176, 83, 28);

//	adicionar ação do botao 

//	configurações do painel da tela 
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(lblEscolha);

		painelDaJanela = (JPanel) janela.getContentPane();

		// cria o obgjeto de grupo de botões
//	sempre separa para nao confundir 
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

//	configurações da label Escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil:");
		lblEscolha.setBounds(82, 18, 230, 18);

//	configuração do botao solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);
//	configuração do botao casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

//	configuração do botao viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

//	configuração do botao Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);

//	configurações do botao 
		bntVerificar.setText("Verificar");
		bntVerificar.setBounds(126, 176, 83, 28);

//	adicionar ação do botao 
		bntVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				verificarSelecionado();

			}
		});

//	configurações do painel da tela 
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(bntVerificar);

//	configurações da janela 
//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); fecha a janela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

	}

	public void verificarSelecionado() {
//	varificar qual radio button foi selecionado 
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
//	troca a cor da fonte para vermelho
		if (!resposta.equals("")) {
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);			
		}
		resposta = "";
	}

	public static void main(String[] args) {
		new TesteGui4().iniciaGui();
	}

}
