package exec9;

import javax.swing.JOptionPane;

public class SeperaDominio {
// esse metodo registra o @ e as informações de email do usuario 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = JOptionPane.showInputDialog(null, "Informe o email:", "Validador de email", 3);
//		String email = JOptionPane.showInputDialog("Informe o email:");
		int cont = email.indexOf("@");
		if (cont > 0) {
			System.out.println("Posição do @: " + cont);
			String dominio = email.substring(cont + 1);
			System.out.println("Dominio do email: " + dominio);
			String usuario = email.substring(0,cont);
			System.out.println("Usuario de email: "+usuario);
		}
	}

}
