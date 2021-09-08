package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjo.arranjo;

public class ArranjoTest {

	@Test
	void test() {
		
		int[] b = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
        arranjo a = new arranjo();
        
        assertEquals(510, a.menor(b), "O Menor deve ser 510");
        
        assertEquals(940, a.maior(b), "O maior é 940");
        
        assertEquals(7540, a.soma(b), "A soma é 7540");
        
        assertEquals(0, a.repitacaoArray(b,3), "3 aparece 0 vezes");
        
        assertEquals(1, a.repitacaoArray(b,790), "790 aparece 1 vezes");
        
        assertEquals(2, a.repitacaoArray(b,940), "940 aparece 2 vezes");
	}

}

