/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.senai.biblio.service;

import com.senai.biblio.entity.Estudante;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anna_pacheco
 */
public class EstudanteServiceTest {
    
    public EstudanteServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of incluirEstudante method, of class EstudanteService.
     */
    @Test
    public void testIncluirEstudante() {
        System.out.println("incluirEstudante");
        Estudante estudante = null;
        EstudanteService instance = new EstudanteService();
        Long expResult = null;
        Long result = instance.incluirEstudante(estudante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarEstudante method, of class EstudanteService.
     */
    @Test
    public void testAlterarEstudante() {
        System.out.println("alterarEstudante");
        Estudante estudante = null;
        EstudanteService instance = new EstudanteService();
        boolean expResult = false;
        boolean result = instance.alterarEstudante(estudante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirEstudantePorId method, of class EstudanteService.
     */
    @Test
    public void testExcluirEstudantePorId() {
        System.out.println("excluirEstudantePorId");
        Long IdEstudante = null;
        EstudanteService instance = new EstudanteService();
        boolean expResult = false;
        boolean result = instance.excluirEstudantePorId(IdEstudante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirEstudantePorMatricula method, of class EstudanteService.
     */
    @Test
    public void testExcluirEstudantePorMatricula() {
        System.out.println("excluirEstudantePorMatricula");
        Long matricula = null;
        EstudanteService instance = new EstudanteService();
        boolean expResult = false;
        boolean result = instance.excluirEstudantePorMatricula(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaEstudantePorId method, of class EstudanteService.
     */
    @Test
    public void testConsultaEstudantePorId() {
        System.out.println("consultaEstudantePorId");
        Long IdEstudante = null;
        EstudanteService instance = new EstudanteService();
        Estudante expResult = null;
        Estudante result = instance.consultaEstudantePorId(IdEstudante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaEstudantePorMatricula method, of class EstudanteService.
     */
    @Test
    public void testConsultaEstudantePorMatricula() {
        System.out.println("consultaEstudantePorMatricula");
        Long matricula = null;
        EstudanteService instance = new EstudanteService();
        Estudante expResult = null;
        Estudante result = instance.consultaEstudantePorMatricula(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaEstudantePorNome method, of class EstudanteService.
     */
    @Test
    public void testConsultaEstudantePorNome() {
        System.out.println("consultaEstudantePorNome");
        String nome = "";
        EstudanteService instance = new EstudanteService();
        List<Estudante> expResult = null;
        List<Estudante> result = instance.consultaEstudantePorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEstudante method, of class EstudanteService.
     */
    @Test
    public void testListarEstudante() {
        System.out.println("listarEstudante");
        Integer pagina = null;
        EstudanteService instance = new EstudanteService();
        List<Estudante> expResult = null;
        List<Estudante> result = instance.listarEstudante(pagina);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaEstudantePorEmail method, of class EstudanteService.
     */
    @Test
    public void testConsultaEstudantePorEmail() {
        System.out.println("consultaEstudantePorEmail");
        String email = "";
        EstudanteService instance = new EstudanteService();
        Estudante expResult = null;
        Estudante result = instance.consultaEstudantePorEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginEstudante method, of class EstudanteService.
     */
    @Test
    public void testLoginEstudante() {
        System.out.println("loginEstudante");
        Long matricula = null;
        String senha = "";
        EstudanteService instance = new EstudanteService();
        Estudante expResult = null;
        Estudante result = instance.loginEstudante(matricula, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
