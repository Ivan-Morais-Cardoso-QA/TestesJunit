package com.mycompany.app.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprenderCucumber {
    private int num1;
    private int num2;
    private int resultado;

    @Given("que eu tenho dois números {int} e {int}")
    public void que_eu_tenho_dois_numeros_e(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        // Lógica para armazenar os números
    }
    @When("eu somo eles")
    public void eu_somo_eles() {
        this.resultado = this.num1 + this.num2;
        // Lógica para somar os números
    }
    @Then("o resultado deve ser {int}")
    public void o_resultado_deve_ser(int resultadoEsperado) {
        // Lógica para verificar o resultado
        assertEquals(resultadoEsperado, this.resultado);
    }

}
