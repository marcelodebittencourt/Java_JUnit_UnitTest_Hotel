package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //testeNovoQuarto
    void testNewRoom(){
        //E - Entrada de dados - massa
        int numeroDoQuarto = 200;
        String nomeDoQuarto = "Suíte Luxo";
        double valorDiaria = 500;

        //T - Teste - Execução do teste
        Room quartoLuxo = new Room(numeroDoQuarto, nomeDoQuarto, valorDiaria);

        //R - Resultado - Validação de REsultados
        assertEquals(numeroDoQuarto, quartoLuxo.getId());
        assertEquals(nomeDoQuarto, quartoLuxo.getName() );
        assertEquals(valorDiaria, quartoLuxo.getPricePerDay() );
        //assertEquals(550, quartoLuxo.getPricePerDay() );

    }
    
}
