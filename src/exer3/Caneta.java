package exer3;
/* Classe criada para Caneta que extends de Produto
* @author vfurtado
* @since 11/02/2020
* @version 0.1
*/
public class Caneta extends Produto {
//	declara a variavel e atribui valor 
	String formato="Formato BIC";
	String cor="Preto";
	String marca="BIC";
	
	public void exibirCaneta(){
//sysout para mostrar as informacões 
		System.out.println(formato);
		System.out.println(cor);
		System.out.println(marca);
		
		exibirTudo();
		
	}
	
}
