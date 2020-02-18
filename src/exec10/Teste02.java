package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/* Classe criada para Professor  
* @author vfurtado
* @since 18/02/2020
* @version 0.1
*/
public class Teste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Texto");
			gravador.println("oi");
			gravador.println("Te");
			gravador.println("liguei");
			gravador.println("deve");
			gravador.println("Ta ocupadinho");
			gravador.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
