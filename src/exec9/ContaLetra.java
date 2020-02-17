package exec9;

/* Classe criada para contar letras 
* @author vfurtado
* @since 13/02/2020
* @version 0.1
*/
//Classe Carro com seus atributos
public class ContaLetra {

	public static void main(String[] args) {
		String lista[]= new String[5];
		lista[0]="Java";
		int cont = lista[0].length();
		System.out.println("A lista "+lista[0]);
		System.out.println("Possui "+cont+" caracteres");
	}
}
