package Application;

import entities.Filme;

public class filmes {

	public static void main(String[] args) {
		 Filme marvel = new Filme();
    	 marvel.setId(1);
    	 marvel.setFilme("Dr. Estranho");
    	 marvel.setCategoria("Aventura");
    	 marvel.setTempo("3h");
    	 System.out.println("=====================");
    	 System.out.println("ID: "+marvel.getId());
    	 System.out.println("FILME: "+marvel.getFilme());
    	 System.out.println("CATEGORIA: "+marvel.getCategoria());
    	 System.out.println("TEMPO: "+marvel.getTempo());
    	 
    	 System.out.println("=====================");
    	 Filme dc = new Filme(2,"Mulher Maravilha 1960", "Ação", "2h");
    	 System.out.println("ID: " + dc.getId());
    	 System.out.println("FILME: "+dc.getFilme());
    	 System.out.println("CATEGORIA: "+dc.getCategoria());
    	 System.out.println("TEMPO: "+dc.getTempo());
    	 System.out.println("=====================");
    }
	}

