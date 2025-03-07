package com.example.demo.service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculadoraServiceTest {
 private CalculadoraService calculadoraService = new CalculadoraService();
 @BeforeEach
    void setUp() {
     calculadoraService = new CalculadoraService();
     System.out.println("Preparando pruebas");
 }
//Prueba Suma
    @Test
    @DisplayName ("Suma: 2+3 = 5")
            void test(){
     int resultado = calculadoraService.sumar(2,3);
     assertEquals(5,resultado,"La suma de 2+3 debe ser 5");
    }
//Prueba Resta
@Test
    @DisplayName ("Resta: 5-2 = 3")
            void test2(){
     int resultado = calculadoraService.restar(5,2);
     assertEquals(3,resultado,"La resta de 5-2 debe ser 3");
    }
    // ❌ Prueba deshabilitada temporalmente
    @Test
    @Disabled("🚧 En desarrollo")
    void testMultiplicar() {
        fail("Esta prueba está deshabilitada y no debe ejecutarse.");
    }

 //Se ejecuta para indicar que las pruebas han finalizado
 @AfterEach
    void tearDown() {
     System.out.println("Limpiando pruebas, prueba finalizada");
 }
}
