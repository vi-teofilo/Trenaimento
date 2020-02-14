package exec7;

import javax.swing.JOptionPane;
	//import javax.swing.text.StyledEditorKit.ForegroundAction;

	/* Classe criada para Locadora ligada a carro
	 * @author vfurtado
	 * @since 13/02/2020
	 * @version 0.1
	 */
	//Classe Carro com seus atributos 
public class Locadora1 {
		static Carro vetorCarro[];

	// foi criado um metodo Locadora para abrir as opções ao usuario, primeiro foi criado com if else logo após 
//		apliquei switch case para fazer a mesma função.
		public Locadora1() {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe a Opção: \n\n1 - Pesquisa por Modelo\n2 - Pesquisa por Velocidade\n3 - Pesquisa por Combustivel\n4 - Relatório de Carros\n5 - Pesquisar Cor\n6 - Lista de Carros"));

//			if (opcao == 1) {
//				bucarModelo();
//			} else if (opcao == 2) {
//				buscarVelocidade();
//			} else if (opcao == 3) {
//				buscarCobustivel();
//			} else if (opcao == 4) {
//				buscarListaCarro();
//			} else {
//				JOptionPane.showMessageDialog(null, "Opção Invalida!");
//			}
//		}
			switch (opcao) {
			case 1:
				bucarModelo();
				break;
			case 2:
				buscarVelocidade();
				break;
			case 3:
				buscarCombustivel();
				break;
			case 4:
				buscarListaCarro();
				break;
			case 5:
				buscarCor();
				break;
			case 6:
				listaCarro(vetorCarro);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}

		}
		
		
		public void organizar(){
			Carro aux;
			int cont;
			for (int i = 0; i < vetorCarro.length; i++) {
				for (cont = 0; cont < vetorCarro.length - 1; cont++) {
					if (vetorCarro[cont].valor < vetorCarro[cont + 1].valor) {
						aux = vetorCarro[cont];
						vetorCarro[cont] = vetorCarro[cont + 1];
						vetorCarro[cont + 1] = aux;
					}
				}
			}
		}

	//o busrcarModelo foi criado para buscar o modelo de cada carro e suas caracteristica.
		public void bucarModelo() {
			
			boolean encontrou = false;

			String modelo = JOptionPane.showInputDialog("Informe o modelo: ").toUpperCase();
			String message= "";
			for (int i = 0; i < vetorCarro.length; i++) {
				if (vetorCarro[i].modeloCarro.equals(modelo)) {
					message = message + "\nModelo do carro: "+vetorCarro[i].modeloCarro + "\nPlaca do Carro: " + vetorCarro[i].placaCarro+"\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+"\nCombustivel do Carro:" + vetorCarro[i].combustivel+"\nValor do Carro:" +vetorCarro[i].valor + "\n";
					
					
//					System.out.println("Modelo do Carro: " + vetorCarro[i].modeloCarro);
//					System.out.println("Placa do Carro: " + vetorCarro[i].placaCarro);
//					System.out.println("Velocidade do Carro: " + vetorCarro[i].velocidadeMaxima);
//					System.out.println("Combustivel do Carro: " + vetorCarro[i].combustivel);
//					System.out.println("Valor do Carro: " + vetorCarro[i].valor);
					encontrou = true;
				}

			}
			if (!encontrou) {
				JOptionPane.showMessageDialog(null, "O carro Informado não foi encontrado");
			}else {
				JOptionPane.showMessageDialog(null, message);
			}
		}

	//foi feito um medtodo para buscar por velocidade se o usuario asssim preferir 
		public void buscarVelocidade() {
			organizar();
			boolean encontrou = false;

			int velocidade = Integer.parseInt((JOptionPane.showInputDialog("Informe a Velocidade: ")).toUpperCase());
			String message="";
			for (int i = 0; i < vetorCarro.length; i++) {
				
				if (vetorCarro[i].velocidadeMaxima == velocidade) {
					message = message + "\nModelo do carro: "+vetorCarro[i].modeloCarro + "\nPlaca do Carro: " + vetorCarro[i].placaCarro+"\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+"\nCombustivel do Carro:" + vetorCarro[i].combustivel+"\nValor do Carro:" +vetorCarro[i].valor+"\n";
					
//					System.out.println("Velociade Maxima do Carro: " + vetorCarro[i].velocidadeMaxima);
//					System.out.println("Placa do Carro: " + vetorCarro[i].placaCarro);
//					System.out.println("Modelo do Carro: " + vetorCarro[i].modeloCarro);
//					System.out.println("Combustivel do Carro: " + vetorCarro[i].combustivel);
//					System.out.println("Valor do Carro: " + vetorCarro[i].valor);
					
					encontrou = true;
				}
			}

			if (!encontrou) {
				JOptionPane.showMessageDialog(null, "Velocidade não encontrada!!");
			}else {
				JOptionPane.showMessageDialog(null, message);
			}
		}

	// o mesmo foi feito para Combustivel usando condições como for e if 
		public void buscarCombustivel() {

			organizar();
			String message="";
			boolean encontrou = false;
			String combustivel = JOptionPane.showInputDialog("Informe o tipo de Combustivel: ").toUpperCase();
			for (int i = 0; i < vetorCarro.length; i++) {
				if (vetorCarro[i].combustivel.equals(combustivel)) {
					message = message + "\nModelo do carro: "+vetorCarro[i].modeloCarro + "\nPlaca do Carro: " + vetorCarro[i].placaCarro+"\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+"\nCombustivel do Carro:" + vetorCarro[i].combustivel+"\nValor do Carro:" +vetorCarro[i].valor + "\n";
					
//					System.out.println("Combustivel do Carro: " + vetorCarro[i].combustivel);
//					System.out.println("Placa do Carro: " + vetorCarro[i].placaCarro);
//					System.out.println("Velocidade Máxima do Carro: " + vetorCarro[i].velocidadeMaxima);
//					System.out.println("Modelo do Carro: " + vetorCarro[i].modeloCarro);
//					System.out.println("Valor do Carro: " + vetorCarro[i].valor);
					encontrou = true;
				}
				if (!encontrou) {
					JOptionPane.showMessageDialog(null, "Combustivel não corresponde!!");
				}else {
					JOptionPane.showMessageDialog(null, message);	
				}
			}
		}

	// aqui está listado cada carro que possui no sistema 
		public void buscarListaCarro() {
			String message="";
			boolean encontrou = false;
			for (int i = 0; i < vetorCarro.length; i++) {
				message = message + "\nModelo do carro: "+vetorCarro[i].modeloCarro + "\nPlaca do Carro: " + vetorCarro[i].placaCarro+"\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
						+"\nCombustivel do Carro:" + vetorCarro[i].combustivel+"\nValor do Carro:" +vetorCarro[i].valor + "\n";
				
//				System.out.println("Modelo do Carro: " + vetorCarro[i].modeloCarro);
//				System.out.println("Placa do Carro: " + vetorCarro[i].placaCarro);
//				System.out.println("Velocidade Máxima do Carro: " + vetorCarro[i].velocidadeMaxima);
//				System.out.println("Combustivel do Carro: " + vetorCarro[i].combustivel);
//				System.out.println("Valor do Carro: " + vetorCarro[i].valor);
				encontrou = true;
			}
			if (!encontrou) {
				JOptionPane.showMessageDialog(null, "Não está na lista!!");
			}else {
				JOptionPane.showMessageDialog(null, message);
			}
		}

	// metodo de cor foi feito para buscar cor desejada 
		public void buscarCor() {
			organizar();
			String message="";
			boolean encontrou = false;
			String cor = JOptionPane.showInputDialog("Informe a Cor desejada: ").toUpperCase();
			for (int i = 0; i < vetorCarro.length; i++) {
				if (vetorCarro[i].cor.equals(cor)) {
					message = message + "\nModelo do carro: "+vetorCarro[i].modeloCarro + "\nPlaca do Carro: " + vetorCarro[i].placaCarro+"\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+"\nCombustivel do Carro:" + vetorCarro[i].combustivel+"\nValor do Carro:" +vetorCarro[i].valor + "\n";
				
//					System.out.println("Cor do Carro: " + vetorCarro[i].cor);
//					System.out.println("Combustivel do Carro: " + vetorCarro[i].combustivel);
//					System.out.println("Placa do Carro: " + vetorCarro[i].placaCarro);
//					System.out.println("Velocidade Máxima do Carro: " + vetorCarro[i].velocidadeMaxima);
//					System.out.println("Modelo do Carro: " + vetorCarro[i].modeloCarro);
//					System.out.println("Valor do Carro: " + vetorCarro[i].valor);
					encontrou = true;
				}
				if (!encontrou) {
					JOptionPane.showMessageDialog(null, "Cor não encontrada!!");
				}else {
					JOptionPane.showMessageDialog(null, message);
				}
			}
		}

	//metodo criado p/ listar os carros do mais barato para o mais caro 
		public void listaCarro(Carro elementos[]) {
			Carro aux;
			int cont;
			for (int i = 0; i < vetorCarro.length; i++) {
				for (cont = 0; cont < vetorCarro.length - 1; cont++) {
					if (elementos[cont].valor < elementos[cont + 1].valor) {
						aux = elementos[cont];
						elementos[cont] = elementos[cont + 1];
						elementos[cont + 1] = aux;
					}
				}
			}
			for (int a = 0; a < vetorCarro.length; a++) {
				System.out.println("Modelo do carro: " + vetorCarro[a].modeloCarro);
				System.out.println("R$" + vetorCarro[a].valor);
			}
		}

		public void comprarCarro() {

		}

	// metodo main criado para armazenar os carros e suas características
//		foi criado um vetor para
		public static void main(String[] args) {

			vetorCarro = new Carro[10];

			Carro carro1 = new Carro("HONDA CIVIC", "KKK-4575", 200, "FLEX", 97.900, "PRETO",false);
			vetorCarro[0] = carro1;

			Carro carro2 = new Carro("HB20", "VIX-6636", 145, "FLEX", 46.700, "PRETO",false);
			vetorCarro[1] = carro2;

			Carro carro3 = new Carro("HILUX", "CAR-0612", 250, "FLEX", 300.90, "AZUL",false);
			vetorCarro[2] = carro3;

			Carro carro4 = new Carro("OPALA", "ROS-7545", 200, "ALCOOL", 200.000, "PRETO",false);
			vetorCarro[3] = carro4;

			Carro carro5 = new Carro("ONIX", "FEL-4588", 135, "GASOLINA", 25.900, "AMARELO",false);
			vetorCarro[4] = carro5;

			Carro carro6 = new Carro("AUDI A4", "VAI-6060", 200, "FLEX", 90.900, "LARANJA",false);
			vetorCarro[5] = carro6;

			Carro carro7 = new Carro("POLO", "GAB-2102", 200, "FLEX", 53.830, "PRETO",false);
			vetorCarro[6] = carro7;

			Carro carro8 = new Carro("CAMARO", "WEL-4503", 250, "GASOLINA", 97.900, "AMARELO",false);
			vetorCarro[7] = carro8;

			Carro carro9 = new Carro("CLIO", "VID-7149", 130, "GASOLINA", 20.000, "CINZA",false);
			vetorCarro[8] = carro9;

			Carro carro10 = new Carro("VELOSTER", "JAO-4455", 200, "FLEX", 90.450, "ROXO",false);
			vetorCarro[9] = carro10;

			new Locadora();

		}

	}


