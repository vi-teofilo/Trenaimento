package exec9;
/* Classe criada para Faxineira 
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe Trim esse daqui tira os espa�os da linha 
public class Trim {

	public static void main(String[] args) {
		String um ="Ol� ";
		String dois= "Mundo ";
		System.out.println("Antes do Trim "+um+dois+".");
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois do Trim:"+um+dois+".");
	}
	
	

	
}
