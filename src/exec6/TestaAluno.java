package exec6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 

/* Classe criada para Aluno  
 * @author vfurtado
 * @since 12/02/2020
 * @version 0.1
 */
public class TestaAluno {

	public static void main(String[] args) {
//		// TODO Auto-generated method stu
//		Aluno a1 = new Aluno("Vitória", 1999, "TI", "Santana","20/08/1999");
//		a1.exibirTudo();
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de Nascimento: ");
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
	    String dataA[] = dateFormat.format(date).split("/");
		int anoAtual = Integer.parseInt(dataA[2]);
		int mesAtual = Integer.parseInt(dataA[1]);
		int diaAtual = Integer.parseInt(dataA[0]);
		
		DateTime dataInicial = new DateTime (ano,mes,dia,0,0);
		DateTime dataFinal = new DateTime (anoAtual,mesAtual,diaAtual,0,0);
		
		int dias = Days.daysBetween(dataInicial,dataFinal).getDays();
		System.out.println(dias);
	}

}
