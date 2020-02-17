package exec8;

import javax.swing.JOptionPane;
/* Classe criada para Caixa eletronico
* @author vfurtado
* @since 13/02/2020
* @version 0.1
*/
//Classe Carro com seus atributos 
public class CaixaEletronico {
	static int notas50;
	static int notas20;
	static int notas10;
	static int notas5;
	static int notas2;	
	static int quantidade;
	double saque;
	
	

	public static void caixaEletronico() {
		double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Saque "));

		if (saque % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Não existem notas disponiveis");

		} else if (saque % 50 == 0) {
			quantidade = (int) (saque / 50);
			JOptionPane.showMessageDialog(null,
					"Numero de notas retornado é:\nNotas de 50:"+notas50+"\nNotas de 20:"+notas20+"\nNotas de 10:"+notas10+"\nNotas de 5:"+notas5+"\nNotas de 2:"+notas2 +"\n VALOR DO SAQUE FOI :" + saque);
		} else if (saque % 20 == 0) {
			quantidade = (int) (saque / 20);
			JOptionPane.showMessageDialog(null,
					"Numero de notas retornado é:\nNotas de 20:"+notas50+"\nNotas de 20"+notas20+"\nNotas de 10"+notas10+"\nNotas de 5"+notas5+"\nNotas de 2:"+notas2+ quantidade + "  VALOR DO SAQUE FOI :" + saque);

		} else if (saque % 10 == 0) {
			quantidade = (int) (saque / 10);
			JOptionPane.showMessageDialog(null,
					"Numero de notas retornado é:\nNotas de 50: " + quantidade + "  VALOR DO SAQUE FOI :" + saque);

		} else if (saque % 5 == 0) {
			quantidade = (int) (saque / 5);
			JOptionPane.showMessageDialog(null,
					"Numero de notas retornado é: " + quantidade + "  VALOR DO SAQUE FOI :" + saque);

		}else if (saque % 2 == 0) {
			quantidade = (int) (saque / 2);
			JOptionPane.showMessageDialog(null,
					"Numero de notas retornado é: " + quantidade + "  VALOR DO SAQUE FOI :" + saque);
	}
	}
	public static void main(String[] args) {
		caixaEletronico();
}
}
