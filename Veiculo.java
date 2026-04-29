/*
Cria uma classe abstrata Veiculo com:
Atributos: marca, velocidadeMaxima
Construtor e getters
Método abstrato mover()
Método concreto exibirInfo() — imprime marca e velocidade máxima
Cria duas subclasses:
Carro — implementa mover() com "Dirigindo na estrada"
Barco — implementa mover() com "Navegando no mar"
Parte 2 — Interface:
Cria uma interface Abastecivel com método abastecer(double litros)
Faz o Carro implementar Abastecivel além de herdar Veiculo
No main:
Cria um Carro e um Barco, chama mover() e exibirInfo() em cada um
Chama abastecer() no carro
*/

public abstract class Veiculo {
    private String marca;
    private double velocidadeMaxima;

    public Veiculo(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public abstract void mover();

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
    }

}

interface Abastecivel {
    void abastecer(double litros);
}

class Barco extends Veiculo {
    public Barco(String marca, double velocidadeMaxima) {
        super(marca, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("Navegando no mar");
    }
}

class Carro extends Veiculo implements Abastecivel {
    public Carro(String marca, double velocidadeMaxima) {
        super(marca, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("Dirigindo na estrada");
    }

    @Override
    public void abastecer(double litros) {
        System.out.println("Abastecendo o carro com " + litros + " litros");
    }
}

class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 180);
        Barco barco = new Barco("Yamaha", 80);

        carro.mover();
        carro.exibirInfo();
        carro.abastecer(50);

        System.out.println();

        barco.mover();
        barco.exibirInfo();
    }
}
