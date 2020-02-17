package exec9;

public class Matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10, y=20.5, z=-30;
//valor absoluto 
		double abs= Math.abs(z);
		System.out.println(abs);
//arredonda para o maior valor interio		
		double ceil=Math.ceil(y);
		System.out.println("Retorna menor valor inteiro: "+ceil);
//arredonda para o menor valor interio		
		double floor=Math.floor(y);
		System.out.println("Retorna valor : "+floor);
//calcula o logaritmo		
		double log=Math.log(x);
		System.out.println("Retorna valor : "+log);
//	retorna o maior valor 		
		double max=Math.max(x,y);
		System.out.println("Retorna valor : "+max);
// retorna o menor valor declarado 		
		double min=Math.min(x,y);
		System.out.println("Retorna valor : "+min);
//calcula a potencia 		
		double pow=Math.pow(x,2);
		System.out.println("Retorna valor : "+pow);
//calcula raiz quadrada		
		double sqrt=Math.sqrt(x);
		System.out.println("Retorna valor : "+sqrt);
//calcula coseno		
		double cos=Math.cos(x);
		System.out.println("Retorna valor : "+cos);
//	calcula seno	
		double sin=Math.sin(x);
		System.out.println("Retorna valor : "+sin);
//	calcula tangente 	
		double tan=Math.tan(x);
		System.out.println("Retorna valor : "+tan);
		
		
	}

}
