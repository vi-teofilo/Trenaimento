package exec10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
// Lendo a primeira linha do seu arquivo 
public class Teste04 {
	public static void main(String[] args) {
	
	try {		
		InputStream is = new FileInputStream("entrada.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader leitor = new BufferedReader(isr);
		String texto = leitor.readLine();
		 
		while (texto !=null) { 
			System.out.println(texto);
			texto = leitor.readLine();
			
			
		} 
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo de entrada n�o encontrado!");	
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
		
		
}
}
