package exer3;
/* Classe criada para Carro que extends de Produto
* @author vfurtado
* @since 11/02/2020
* @version 0.1
*/
public class Carro extends Produto{
//	declara as variaveis e atribui valor 
	String marca="Honda";
	String modelo = "Honda Civic";
	String ano = "2020";
	String cor ="cinza";
	String motor="3.0";
	
	public void exibirCarro(){
//		sysout para exibir valores atribuidos 
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
		System.out.println(cor);
		System.out.println(motor);
		
		exibirTudo();
		
	}
}
