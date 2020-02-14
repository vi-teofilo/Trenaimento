package exer3;
/* Classe criada para computadsor que extends de Produto 
* @author vfurtado
* @since 11/02/2020
* @version 0.1
*/
public class Computador extends Produto {
	String processador ="Intel";
	String memoria = "32GB de RAM";
	String tela = "14p";
	String hd ="2TB";
	String placaV="RTX 2080";
	
	public void exibirComputador(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(placaV);
		
		exibirTudo();
		
	}
}
