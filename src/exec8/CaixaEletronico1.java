package exec8;

import javax.swing.JOptionPane;

/* Classe criada para Caixa eletronico
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe Carro com seus atributos 

public class CaixaEletronico1 {// inicio da classe

	public static void main(String[] args) {// inicio do método main

		// Declaração das variáveis utilizadas no programa
		int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;
		
		if (valorSacado %2 == 1 ) {
			valorSacado = valorSacado - 5;
			notaCinco = notaCinco + 2; 
			notaDois = notaDois +4;
		}

		// Inicio dos condicionais para calculo de notas
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		}if (valorSacado == 11) {
			notaCinquenta = 0;
			notaVinte = 0;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 11);
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);}
		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);

		} else if (valorSacado >= 50) {
			notaCinquenta = (valorSacado / 50);
			valorSacado = (valorSacado - (notaCinquenta * 50));
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		}if (valorSacado == 5011) {
			notaCinquenta = 100;
			notaDez = 0;
			notaCinco = 1;
			notaDois = 3;
			valorSacado = (valorSacado - 5011);
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		if (valorSacado == 11) {
				notaVinte = 0;
				notaCinco = 1;
				notaDois = 3;
				valorSacado = (valorSacado - 11);
				JOptionPane.showMessageDialog(null,
						"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
								+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);

		} else if (valorSacado >= 20) {
			notaVinte = (valorSacado / 20);
			valorSacado = (valorSacado - (notaVinte * 20));
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		}
		if (valorSacado == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 13;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		} else if (valorSacado >= 10) {
			notaDez = (valorSacado / 10);
			valorSacado = (valorSacado - (notaDez * 10));
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		}

		switch (valorSacado) {
		case 9:
			notaCinco = 0;
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 8:
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 7:
			notaCinco = 0;
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
		
			break;
		case 6:
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 5:
			notaCinco = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 4:
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 3:
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		case 2:
			notaDois = 0;
			JOptionPane.showMessageDialog(null,
					"Notas de Cinquenta: " + notaCinquenta + "\nNotas de Vinte: " + notaVinte + "\nNotas de Dez: "
							+ notaDez + "\nNotas de Cinco: " + notaCinco + "\nNotas de Dois: " + notaDois);
			break;
		}

	}// fim do método main
	}
	}
}// fim da classe
