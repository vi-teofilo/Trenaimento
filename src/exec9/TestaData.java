package exec9;

import model.Data;

public class TestaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
//		d1.dia(10);- a informação é privada na classe data ta private
		d1.setDia(10);
		d1.getDia();
		
	}

}
