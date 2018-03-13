package com.kevinmcr.shoestore;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void prueba1(){
        // Hombre, Zapatilla, nike , cantidad : 1
        boolean esHombre = true;
        int cantidad = 1, tipoZapato = 0, tipoMarca = 0;
        double resultado = Metodos.calcular(cantidad,esHombre,tipoZapato,tipoMarca);
        assertEquals(120000,resultado,0);
    }

    @Test
    public void prueba2(){
        // Mujer, Zapatilla, adidas , cantidad : 2
        boolean esHombre = false;
        int cantidad = 2, tipoZapato = 0, tipoMarca = 1;
        double resultado = Metodos.calcular(cantidad,esHombre,tipoZapato,tipoMarca);
        assertEquals(260000,resultado,0);
    }

    @Test
    public void prueba3(){
        // hombre, clasico, puma , cantidad : 5
        boolean esHombre = true;
        int cantidad = 5, tipoZapato = 1, tipoMarca = 2;
        double resultado = Metodos.calcular(cantidad,esHombre,tipoZapato,tipoMarca);
        assertEquals(500000,resultado,0);
    }

}