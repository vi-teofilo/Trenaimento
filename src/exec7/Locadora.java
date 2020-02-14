
import javax.swing.JOptionPane;
//import javax.swing.text.StyledEditorKit.ForegroundAction;

/* Classe criada para Locadora ligada a carro
 * @author vfurtado
 * @since 13/02/2020
 * @version 0.1
 */
//Classe Carro com seus atributos 
public class Locadora {
	static Carro vetorCarro[];
	static int vetorAux[];

// foi criado um metodo Locadora para abrir as opções ao usuario, primeiro foi criado com if else logo após 
//	apliquei switch case para fazer a mesma função.
	public Locadora() {
		processar();
	}
	
	public void processar(){
		try {
			int opcao =0;
			while (opcao != 9) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"Informe a Opção: \n\n1 - Pesquisa por Modelo\n2 - Pesquisa por Velocidade\n3 - Pesquisa por Combustivel\n4 - Relatório de Carros\n5 - Burcar Cor\n6 - Comprar\n9 - Sair"));

				switch (opcao) {
				case 1:
					String modelo = JOptionPane.showInputDialog("Informe o modelo: ").toUpperCase();
					buscarModelo(modelo);
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
					String cor = JOptionPane.showInputDialog("Informe a Cor desejada: ").toUpperCase();
					buscarCor(cor);
					break;
				case 6:
					comprarCarro(vetorCarro);
					break;
				case 9:
					opcao = 9;
				default:
					
					break;
				}

			} 

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite o NÚMERO da opção!");
			processar();
		}
		
	}
	

	public void organizar() {
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
	public void buscarModelo(String modelo) {

		boolean encontrou = false;
		int j= 0;
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false && vetorCarro[i].modeloCarro.equals(modelo)) {
				vetorAux[j]=i;
				
					message = message + "\nModelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
							+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:"
							+ vetorCarro[i].valor + "\n";
					encontrou = true;
				}
				

			
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "O carro Informado não foi encontrado");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

//foi feito um medtodo para buscar por velocidade se o usuario asssim preferir 
	public void buscarVelocidade() {
		organizar();
		boolean encontrou = false;

		int velocidade = Integer.parseInt((JOptionPane.showInputDialog("Informe a Velocidade: ")).toUpperCase());
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].velocidadeMaxima == velocidade) {
					message = message + "\nModelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
							+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:"
							+ vetorCarro[i].valor + "\n";
					encontrou = true;
				}
			}
		}

		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Velocidade não encontrada!!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

// o mesmo foi feito para Combustivel usando condições como for e if 
	public void buscarCombustivel() {

		organizar();
		String message = "";
		boolean encontrou = false;
		String combustivel = JOptionPane.showInputDialog("Informe o tipo de Combustivel: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].combustivel.equals(combustivel)) {
					message = message + "\nModelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
							+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:"
							+ vetorCarro[i].valor + "\n";
					encontrou = true;
				}
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Combustivel não corresponde!!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

// aqui está listado cada carro que possui no sistema 
	public void buscarListaCarro() {
		String message = "";
		boolean encontrou = false;
		for (int i = 0; i < vetorCarro.length; i++) {
			message = message + "\nModelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
					+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
					+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:" + vetorCarro[i].valor
					+ "\n";
			encontrou = true;
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não está na lista!!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

// metodo de cor foi feito para buscar cor desejada 
	public void buscarCor(String cor) {
		organizar();
		String message = "";
		boolean encontrou = false;
		
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].cor.equals(cor)) {
					message = message + "\nModelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
							+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:"
							+ vetorCarro[i].valor + "\n";
					encontrou = true;
				}
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Cor não encontrada!!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

//metodo criado p/ listar os carros do mais barato para o mais caro 
	public void comprarCarro(Carro elementos[]) {
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
		String modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ").toUpperCase();
		
		String cor = JOptionPane.showInputDialog(null, "Digite o Cor: ").toUpperCase();
		buscarCorModelo(modelo,cor);
		
		
		
		
		
		
		
		
	}
	
	
	public void buscarCorModelo(String modelo, String cor) {
		boolean encontrou = false;
		int aux = 1;
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {
				if (vetorCarro[i].modeloCarro.equals(modelo)&&vetorCarro[i].cor.equals(cor)) {
					message = message + "\n Opção de compra " + aux+"Modelo do carro: " + vetorCarro[i].modeloCarro + "\nPlaca do Carro: "
							+ vetorCarro[i].placaCarro + "\nVelocidade do Carro: " + vetorCarro[i].velocidadeMaxima
							+ "\nCombustivel do Carro:" + vetorCarro[i].combustivel + "\nValor do Carro:"
							+ vetorCarro[i].valor + "\n";
					encontrou = true;
				}

			}
			
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Carro não encontrado!!");
		} else {
			comprarCarro(vetorCarro);
		}
	}

// metodo main criado para armazenar os carros e suas características
//	foi criado um vetor para
	public static void main(String[] args) {

		vetorCarro = new Carro[10];
		vetorAux = new int [10];

		Carro carro1 = new Carro("HONDA CIVIC", "KKK-4575", 200, "FLEX", 97.900, "PRETO", false);
		vetorCarro[0] = carro1;

		Carro carro2 = new Carro("HONDA CIVIC", "VIX-6636", 145, "FLEX", 46.700, "PRETO", false);
		vetorCarro[1] = carro2;

		Carro carro3 = new Carro("HILUX", "CAR-0612", 250, "FLEX", 300.90, "AZUL", false);
		vetorCarro[2] = carro3;

		Carro carro4 = new Carro("OPALA", "ROS-7545", 200, "ALCOOL", 200.000, "PRETO", false);
		vetorCarro[3] = carro4;

		Carro carro5 = new Carro("ONIX", "FEL-4588", 135, "GASOLINA", 25.900, "AMARELO", false);
		vetorCarro[4] = carro5;

		Carro carro6 = new Carro("AUDI A4", "VAI-6060", 200, "FLEX", 90.900, "LARANJA", false);
		vetorCarro[5] = carro6;

		Carro carro7 = new Carro("POLO", "GAB-2102", 200, "FLEX", 53.830, "PRETO", false);
		vetorCarro[6] = carro7;

		Carro carro8 = new Carro("CAMARO", "WEL-4503", 250, "GASOLINA", 97.900, "AMARELO", false);
		vetorCarro[7] = carro8;

		Carro carro9 = new Carro("CLIO", "VID-7149", 130, "GASOLINA", 20.000, "CINZA", false);
		vetorCarro[8] = carro9;

		Carro carro10 = new Carro("VELOSTER", "JAO-4455", 200, "FLEX", 90.450, "ROXO", false);
		vetorCarro[9] = carro10;

		new Locadora();

	}

}
