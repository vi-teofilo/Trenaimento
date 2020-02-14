package exer3;
/* Classe criada para Caneca que extends de Produto
* @author vfurtado
* @since 11/02/2020
* @version 0.1
*/
public class Caneca extends Produto {
	boolean estampa;
	String material="Porcelana";
	String medida="250ml";
	
	public void exibirCaneca(){
//foi criado um if else para pergutar se tem estampa na caneca.
		if (estampa==true) {
			System.out.println("Estampa sim");
		}else {
			System.out.println("Sem Estampa");
		}
// e foi declarada os valores para printar na tela 
		System.out.println(material);
		System.out.println(medida);
		
		exibirTudo();
	}
}
