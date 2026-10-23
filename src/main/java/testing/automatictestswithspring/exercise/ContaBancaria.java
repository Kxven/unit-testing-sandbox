package testing.automatictestswithspring.exercise;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

//Escreva testes para:
//
//Criar conta com saldo -100 lança IllegalArgumentException
//Sacar 0 lança IllegalArgumentException
//Sacar -50 lança IllegalArgumentException
//Sacar 500 de uma conta com 100 lança IllegalStateException
//Bônus: sacar 50 de uma conta com 100 não lança exceção e o saldo final é 50 (use assertDoesNotThrow e assertEquals)