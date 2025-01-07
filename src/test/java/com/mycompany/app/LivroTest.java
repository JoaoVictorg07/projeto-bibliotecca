package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmprestimoTest {

    @Test
    public void testGetLivro () {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }