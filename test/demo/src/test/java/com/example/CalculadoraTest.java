package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test para calculadora.
 */
public class CalculadoraTest {

    /**
     *
     */
    private static final int OCHO = 8;
    /**
     *
     */
    private static final int CUATRO = 4;
    /**
     *
     */
    private static final int DOS = 2;
    /**
     *
     */
    private static final int SEIS = 6;

    @Test
    public void testSuma() {
        assertEquals(SEIS, Calculadora.sumar(DOS, CUATRO));
    }

    @Test
    public void testProducto() {
        assertEquals(OCHO, Calculadora.producto(DOS, CUATRO));
    }

} // fin clase
