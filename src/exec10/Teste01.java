package exec10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teste01 {
	public static void main(String[] args) {
//		ctrl + shift + O = try\catch
		try {	
			Scanner leitor = new Scanner(new FileReader("entrada.txt"));
			while (leitor.hasNext()) {
				System.out.println(leitor.next());		
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada n�o encontrado!");
			// TODO Auto-generated catch block
//			e.printStackTrace();
			
				
			}
		}
}