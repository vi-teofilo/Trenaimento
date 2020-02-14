package exer3;
/**
 * Classe criada para Produto responsavel por armazenar atributos e metodos 
 * @author vfurtado
 * @since 11/02/2020
 * @version 0.1
 */
public class Produto {	 
		// TODO Auto-generated method stub
		String nome;
		double quantidade;
		double custo;
		double quanV;
		double percenL;

	public void exibirNome() {
	if(nome!=null) {
		System.out.println(nome);
	}else{
		System.out.println("O campo nome é nulo!!");
	}	
}
// O valor é o percentual de lucro multiplicado por custo bruto mais o custo final,logo depois foi criado um If else para ver se o valor é nulo
	public void exibirValor() {
		if((custo>0)&&(percenL>0) ){
		System.out.println((custo*percenL)+custo);
		}else {
			System.out.println("O campo valor é nulo!!");
		}		
}	
//O lucro é o custo do produto multiplicado pelo percentual de lucro, logo depois foi criado um If else para ver se o lucro é nulo
	public void exibirLucro() { 
		if((custo>0)&&(percenL>0) ){
			System.out.println(percenL*custo);
		}else {
			System.out.println("O campo Lucro é nulo!!");
		}			
}	
	// exibir todos os resultados 	
	public void exibirTudo() {
// acessar os metodos e exibir tudo!!
		exibirNome();
		exibirValor();
		exibirLucro();
	}
		
}

