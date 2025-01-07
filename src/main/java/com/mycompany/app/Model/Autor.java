package com.mycompany.app.Model;

public class Autor extends Pessoa {
   	private String nacionalidade;

	//Construtor com mome e nacionalidade
	public Autor(String nome, String nacionalidade) {
    	super(nome); // Chama o construtor da classe Pessoa para inicializar o nome
    	this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
    	return nacionalidade;
    }

	public void setNacionalidae(String nacionalidade) {
    	this.nacionalidade = nacionalidade;
	}

	private Livro[] obrasPublicadas;
	
	public Livro[] getObrasPublicas() {
    	return obrasPublicadas;
   	}

	public void setObrasPublicadas(Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }
	
	private Livro[] obrasPublicadasPorGenero;

    public Livro[] getObrasPublicadasPorGenero() {
		return obrasPublicadasPorGenero;
	}

	public void setObrasPublicadasPorGenero(Livro[] obrasPublicadasPorGenero) {
        this.obrasPublicadasPorGenero = obrasPublicadasPorGenero;
    }
}
 