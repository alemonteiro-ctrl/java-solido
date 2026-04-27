/*
Cria a seguinte hierarquia:
Classe pai Funcionario:
Atributos privados: nome, salario
Construtor, getters
Método exibirInfo() — imprime nome e salário
Classe filha Gerente extends Funcionario:
Atributo extra: departamento
Construtor que usa super
Sobrescreve exibirInfo() pra incluir o departamento
Classe filha Estagiario extends Funcionario:
Atributo extra: bolsa (double)
Construtor que usa super
Sobrescreve exibirInfo() pra incluir a bolsa
No main cria um Gerente e um Estagiario e chama exibirInfo() em cada um.
+polimorfismo
Cria um ArrayList<Funcionario> e adiciona pelo menos 2 gerentes e 2 estagiários
Percorre a lista e chama exibirInfo() em cada um
Percorre a lista novamente e usando instanceof, conta quantos gerentes e quantos estagiários existem e imprime o resultado
*/


public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 5000.0, "Vendas");
        Estagiario estagiario = new Estagiario("Bob", 1500.0, 500.0);

        System.out.println("Informações do Gerente:");
        gerente.exibirInfo();

        System.out.println("\nInformações do Estagiário:");
        estagiario.exibirInfo();

        java.util.ArrayList<Funcionario> funcionarios = new java.util.ArrayList<>();
        funcionarios.add(new Gerente("Carlos", 6000.0, "Marketing"));
        funcionarios.add(new Gerente("Diana", 5500.0, "Financeiro"));
        funcionarios.add(new Estagiario("Eve", 1200.0, 400.0));
        funcionarios.add(new Estagiario("Frank", 1300.0, 450.0));

        System.out.println("\nInformações de todos os funcionários:");
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
            System.out.println();
        }
        int countGerentes = 0;
        int countEstagiarios = 0;
        for (Funcionario f : funcionarios) {
            if (f instanceof Gerente) {
                countGerentes++;
            } else if (f instanceof Estagiario) {
                countEstagiarios++;
            }
        }
        System.out.println("Número de Gerentes: " + countGerentes);
        System.out.println("Número de Estagiários: " + countEstagiarios);

    }
}

class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Departamento: " + departamento);
    }
}

class Estagiario extends Funcionario {
    private double bolsa;

    public Estagiario(String nome, double salario, double bolsa) {
        super(nome, salario);
        this.bolsa = bolsa;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Bolsa: " + bolsa);
    }
}