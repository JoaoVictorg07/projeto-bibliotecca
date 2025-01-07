package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main { 
    public static void main(String[] args) {
		//Criando um autor
		Autor autor = new Autor("Jorge","Norueguêsa");

		//Criando um livro
		Livro livro = new Livro("Java For Begginers", autor, "tecnologia", true);
		livro.validarDisponibilidade();

		//Criando um usuario
		Usuario usuario = new Usuario("Jorge",25);

		//Criando um emprestimo
		Emprestimo emprestimo = new Emprestimo((new Date()), (new Date()), livro, usuario); 

		//Exibindo informações
		System.out.println("Livro:" + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor().getNome());
		System.out.println("Gênero: " + livro.getGenero());
		System.out.println("Usuário: " + usuario.getNome());
		System.out.println("Idade: " + usuario.getIdade());
		System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
		System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
	}
}