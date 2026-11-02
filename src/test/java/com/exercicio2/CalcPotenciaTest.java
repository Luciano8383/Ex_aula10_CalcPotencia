package com.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    public void testarPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double resultado = calc.calcularPotencia(127, 20);

        assertEquals(1270, resultado, 0.01);
    }
}
