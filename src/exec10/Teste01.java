package exec10;
/* Classe criada para Teste  
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
// ler o arquivo de texto e verificar se existe alguma coisa 
public class Teste01 {
	public static void main(String[] args) {
//		ctrl + shift + O = try\catch
		try {	
			Scanner leitor = new Scanner(new FileReader("entrada.txt"));
			while (leitor.hasNext()) {
				System.out.println(leitor.next());		
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado!");
			// TODO Auto-generated catch block
		e.printStackTrace();
			
				
			}
		}
}