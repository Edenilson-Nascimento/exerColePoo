package br.com.generation.exerColecoes;


import java.util.ArrayList;
import java.util.Scanner;


public class testarProduto {


	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos();
		Produtos p2 = new Produtos();
		Produtos p3 = new Produtos();
		
		p1.setNomeProduto("Caderno");
		p2.setNomeProduto("Caneta");
	    p3.setNomeProduto("Lápis");
	    
	    
	    ArrayList<String> produtos = new ArrayList<>();
	    
	    produtos.add(p1.getNomeProduto());
	    produtos.add(p2.getNomeProduto());
	    produtos.add(p3.getNomeProduto());
	    
	  
	    
	    System.out.println("Lista de produtos cadastrados:");
	    for (int i = 0; i < produtos.size();i++) { 		      
	    	System.out.println((i+1)+". "+produtos.get(i)); 		
	      }
	    
	    System.out.println();
	    System.out.println("Voce deseja adicionar ou remover um produto?"
	    		+ "\nDigite [1] para adicionar, [2] para remover e [0] para sair.");
	    int num = leia.nextInt();
	    System.out.println();
	    
	    if(num == 1){
	        System.out.println("Digite o nome do produto: ");
	        String lerProduto = leia.next();
	    	produtos.add(lerProduto);
	    	System.out.println(lerProduto + " adicionado com sucesso!");
	    	System.out.println();
	    }
	    else if(num == 2){
	        System.out.println("Qual produto você gostaria de remover:");
	        
		    for (int i = 0; i < produtos.size();i++) { 		      
		    	System.out.println((i+1)+". "+produtos.get(i)); 		
		    	}
		    
		    System.out.println("Digite o número correspondente ao produto: ");
	        int numProduto = leia.nextInt();
	        System.out.println(produtos.get(numProduto - 1) + " removido com sucesso!");
	        produtos.remove(numProduto - 1);
	        System.out.println();
	    }
	    else if(num == 0) {
	    	System.exit(num);
	    }
	    else {
	    	System.out.println("Opção inválida.");
	    }
	    
	    System.out.println("Lista de produtos cadastrados:");
	    for (int i = 0; i < produtos.size();i++) { 		      
	    	System.out.println((i+1)+". "+produtos.get(i)); 		
	      }
	    leia.close();
	}
}