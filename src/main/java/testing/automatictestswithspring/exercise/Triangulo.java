package testing.automatictestswithspring.exercise;

public class Triangulo {
    public boolean ehValido(double a, double b, double c)
}
//Regras:
//
//Lados devem ser maiores que zero, senão lança IllegalArgumentException
//O triângulo é válido se a soma de quaisquer dois lados for maior que o terceiro
//
//Testes sugeridos:
//
//3, 4, 5 → válido (assertTrue)
//1, 2, 10 → inválido (assertFalse)
//1, 2, 3 → inválido (assertFalse), caso limite
//0, 4, 5 → lança exceção (assertThrows)
//-1, 4, 5 → lança exceção (assertThrows)