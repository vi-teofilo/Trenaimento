package exec6;

import java.time.Year;
/* Classe criada para Aluno  
 * @author vfurtado
 * @since 12/02/2020
 * @version 0.1
 */
// atributos criados para classe Aluno 
public class Aluno {
	String nome;
	int anoNasc;
	String dataNasc;
	String curso;
	String cidade;

//foi criado um construtor vazio 
	public Aluno() {

	}

//logo após clica no vazio depois do construtor com o potão direito vc procura por Source, gerent fileds, seleciona as variaveis 

	public Aluno(String nome, int anoNasc, String dataNasc, String curso, String cidade) {
	this.nome = nome;
	this.anoNasc = anoNasc;
	this.curso = curso;
	this.cidade = cidade;
	this.dataNasc = dataNasc;
}
//aqui vai verificar o ano para 
	public int verificarDat() {
		Year y = Year.now();
		int ano = y.getValue();
		return ano - anoNasc;
	}
	
	


	public int calDataCompleta() {	
	String data = (new java.text.SimpleDateFormat("ddMMyyyy").format(new java.util.Date(System.currentTimeMillis())));	
	int dT = Integer.parseInt(data);
	
	String datas[] = dataNasc.split("/");
	String d= datas[2] + datas[1] + datas[0];
	
	int dU = Integer.parseInt(d);
	
	int idade = ((dT - dU))/10000;
	
	System.out.println(idade);
	return idade;
	
	}
	
	public void exibirTudo() {
		System.out.println(nome);
		System.out.println(verificarDat());
		System.out.println(calDataCompleta());
		System.out.println(curso);
		System.out.println(cidade);
		System.out.println(calDataCompleta());

	}

}
