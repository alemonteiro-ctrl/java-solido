/*
Cria uma classe ContaBancaria com:
Atributos privados: titular (String), saldo (double)
Construtor que recebe titular e saldo inicial
Getter pra titular e saldo
Setter só pra titular
Método depositar(double valor) — adiciona ao saldo, mas rejeita valores negativos
Método sacar(double valor) — subtrai do saldo, mas rejeita se valor for maior que o saldo ou negativo
Método exibirExtrato() — imprime titular e saldo atual
No main cria uma conta, faz depósitos, saques e tenta operações inválidas pra testar as validações.
*/

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido. Deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
        else if (valor <= 0) {
            System.out.println("Valor de saque inválido. Deve ser positivo.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("maria", 1000.0);
        conta.exibirExtrato();

        conta.depositar(500.0);
        conta.exibirExtrato();

        conta.sacar(200.0);
        conta.exibirExtrato();

        conta.depositar(-50.0); 
        conta.sacar(2000.0);
    }
}
