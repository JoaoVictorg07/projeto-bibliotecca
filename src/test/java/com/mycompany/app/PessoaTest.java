package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void testGetNome() {
        // Cria uma intancia de classe Pessoa
        Pessoa pessoa = new Pessoa();
        // Atribuir um nome para Pessoa
        pessoa.setNome("Jorge");
        //Verificar se o nome retornado é o mesmo que foi setado
        assertEquals("Jorge", pessoa.getNome());
    }
    @Test
    public void testSetNome() {
        //Cria uma instancia da classe Pessoa
        Pessoa pessoa = new Pessoa("Jorge");

        //Define um nome para pessoa
        pessoa.setNome("Jorge");

        //Verificar se o nome retornado é o mesmo que foi setado
        assertEquals("Jorge", pessoa.getNome());
    }
    @Test
    public void testGetLivros() {
        //Cria uma instancia da classe Pessoa e da classe autor
        Pessoa pessoa = new Pessoa("Jorge");
        Autor autor = new Autor("Jorge", "Norueguês");

        //Define uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro(“Java Basico”, “Jessica Felix”, “tecnologia”, true);
        livros[1] = new Livro(“Java Avançado”, “Jessica Félix”,“tecnologia”, true);
        pessoa.setLivros(livros);

        //Verificar se a lista de livros retornado é a mesmo que foi setada
        assertEquals(livros, pessoa.getNome());
    }

}

//getNome
//retorna o nome da pessoa
//comparar com o nome que passei no setNome

//setNome
//atribuir um valor para a propriedade nome
//comparar se o valor do getNome e o mesmo valor que passamos no serNome

//getLivros
// atribuir uma lista de livros para uma pessoa
//comparar se a lista retornada é a mesma lista que passamos para o setLivros

//setLivros
//atribuir uma lista de livros para uma pessoa
//comparar se o valor do getLivros e o mesmo valor que passamos no setLivros
