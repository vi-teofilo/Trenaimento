package exec12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
	
//		criar um objeto arrar list 
		List<String> arrayList = new ArrayList<String>();
//adicionar elementos ao final da lista, usamos o metodo add		
		arrayList.add("Elemento N°1");
		arrayList.add("Elemento N°2");
		arrayList.add("Elemento N°3");
		
//		exibir as informações	
		System.out.println("Posição 1 contem:"+arrayList.get(0));
		System.out.println("Posição 2 contem:"+arrayList.get(1));
		System.out.println("Posição 3 contem:"+arrayList.get(2));
		
		for (String s: arrayList) {
			System.out.println(s);
		}
//	tambem podemos add adicionar um elemento numa posição qualquer 	
		arrayList.add(1,"Elemento N°1,5");
		System.out.println("\nApós adicionar o elemento 1,5:\n");
		for (String s: arrayList) {
			System.out.println(s);
		}
//	obter o tamanho da lista 
		System.out.println("\nO tamanho da lista é:"+arrayList.size()+"\n");

//		podemos ver um determinado valor na lista 
		if (arrayList.contains("Elemento N°1,5")) {
			System.out.println("Elemento 1,5 existe");
		}else {
			System.out.println("Elemento 1,5 não existe");
		}
		int indice = arrayList.indexOf("Elemnto N°1,5");
		System.out.println("\nO indice do Elemento N°1,5 é:"+indice);
		
//		removendo um elemento da lista 
		System.out.println("\nRemovendo Elemento N°1,5\n");
		arrayList.remove("Elemento N°1,5");
		System.out.println("Lista Atualizada");
		
		for (String s: arrayList) {
			System.out.println(s);
		}
		
//		remover com base no indice - remover ultimo registro
		System.out.println("Removendo o ultimo elemento:");
		arrayList.remove(arrayList.size()-1);
		System.out.println("Lista Atualizada");
		for (String s: arrayList) {
			System.out.println(s);
		}
		
//		adicionando elementos na lista 
		System.out.println("Adcionando elementos na lista");
		arrayList.add("Elemento N°5");
		arrayList.add("Elemento N°9");
		arrayList.add("Elemento N°4");
		arrayList.add("Elemento N°0");
		arrayList.add("Elemento N°8");
		System.out.println("\nLista com elementos adicionados!");
		for (String s: arrayList) {
			System.out.println(s);
		}
		
		
//		ordenando array list 
		Collections.sort(arrayList);
		System.out.println("\nOrdenar lista");
		for (String s: arrayList) {
			System.out.println(s);
		}
		
//		criando uma lista de objeto - Filme
		List<Filme> arrrayListFilme = new ArrayList<Filme>();
		
//		criando 3 filmes 
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo de Conduta");
		
		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Era do Gelo");
		
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Matrix");
		if (filme1.equals(filme2)) {
			System.out.println("\nFilmes Iguais\n");
		}else {
			System.out.println("\nFilme Diferentes\n");
		}
		
//		adicionar na Lista os filmes instanciados 
		arrrayListFilme.add(filme1);
		arrrayListFilme.add(filme2);
		arrrayListFilme.add(filme3);

//		exibindo a lista de Filme 
		for (Filme f : arrrayListFilme) {
			System.out.println(f);
		}
		
////		ordenar uma lista 
//		System.out.println("Lista Ordenada");
//		Collections.sort(list);
		  
		
		
	}//fim do main
	
	
}
