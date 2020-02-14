package exec5;

import java.util.Scanner;

/* Classe criada para Alugar um filme  
 * @author vfurtado
 * @since 12/02/2020
 * @version 0.1
 */
public class AlugaFilme {
	// variaveis para declarar se o filme está disponivel
	double valoraluguelDiario = 10;
	double valorpago;
	int quantidadedia;
	String filme;
	boolean filmInceptionD;
	boolean filmStolenD;

	Scanner sc = new Scanner(System.in);
// metodo criado para executar o processar e seus atributos 
	public void processar() {
		leitura();
		if (verificaF(filme)) {
			CalValor();
		}
	}

	public void leitura() {
		System.out.println("Digite para escolher o filme:");
		filme = sc.nextLine();
	}

// no metodo boolean foi criado um retorno para verificar se os filmes estao disponiveis 
	public boolean verificaF(String filmeD) {
		if (filmeD.equals("1")) {
			if (filmInceptionD) {
				return true;
			} else {
				return false;
			}
		} else if (filmeD.equals("2")) {
			if (filmStolenD) {
				return true;
			} else {
				return false;
			}
		}
		if (filmeD != "1" && filmeD != "2") {
			System.out.println("Filme Indisponivel!!");

		}
		return false;

	}

// Logo após de ve a disponibilidade do filme é feito um calculo para verificar o valor total e ver se ele é suficiente para o valor do filme e se necessario devolva troco
	public void CalValor() {
		System.out.println("Informe valor pago:");
		valorpago = sc.nextDouble();
		System.out.println("Digite a quantidade de Dias:");
		quantidadedia = sc.nextInt();
		double total = valoraluguelDiario * quantidadedia;

		if (valorpago < total) {
			System.out.println("Valor pago Insuficiente!!");
		} else if (valorpago > total) {
			double troco = valorpago - total;
			System.out.println("o valor do troco é R$ " + troco);
			System.out.println("Filme alugado com sucesso!!");

		} else {
			System.out.println("Filme alugado com sucesso!!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlugaFilme pessoa1 = new AlugaFilme();
		pessoa1.processar();

	}
}
