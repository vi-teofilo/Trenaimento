package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {
  public static void main(String[] args) {
// organizando as informções para gerar um arquivo e fazer a manipulação do mesmo 
//	o true informa ao construtor qu etem que criar um arquivo em memoria 
	  File arquivo = new File("saida.txt");
	  FileOutputStream arquivoOutput;	  
	try {
		arquivoOutput = new FileOutputStream(arquivo,true);
		PrintStream gravador = new PrintStream(arquivoOutput);
		  gravador.println("Texto 0");
		  gravador.println("Texto 1");
		  gravador.println("Texto 2");
		  gravador.println("Texto 3");
		  gravador.println("Texto 4");
		  gravador.println("Texto 5");
		  gravador.close();
		  arquivoOutput.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
