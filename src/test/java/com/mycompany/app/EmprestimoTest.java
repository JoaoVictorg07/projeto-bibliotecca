package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmprestimoTest {

    @Test
    public void testGetEmpretimo () {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
    }