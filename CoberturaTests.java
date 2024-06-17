

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", cobertura.fizzBuzz(15));
        assertEquals("Fizz", cobertura.fizzBuzz(3));
        assertEquals("Buzz", cobertura.fizzBuzz(5));
    }

    @Test
    void testNumeroCombinatorio() {
        assertEquals(1, cobertura.numeroCombinatorio(5,0));
        assertEquals(1, cobertura.numeroCombinatorio(5,5));
        assertEquals(0, cobertura.numeroCombinatorio(5,6));
        assertEquals(21, cobertura.numeroCombinatorio(7,5));
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertEquals(3, cobertura.repeticionesConsecutivas(new int[]{1, 1, 1, 2, 2, 1, 3, 1, 1}));
        assertEquals(4, cobertura.repeticionesConsecutivas(new int[]{1, 2, 1, 1, 2, 2, 1, 1, 1, 1}));
        assertEquals(1, cobertura.repeticionesConsecutivas(new int[]{1, 2, 3, 4, 5}));
        
    
    }
}
