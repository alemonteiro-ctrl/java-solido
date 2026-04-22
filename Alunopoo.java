/*
Cria uma classe Aluno com:
Atributos: nome, idade, curso
Um construtor que recebe os três atributos
Um método apresentar() que imprime: "Olá, meu nome é [nome], tenho [idade] anos e curso [curso]."
No main (pode ser numa classe separada Main.java ou na mesma):
Cria 3 objetos Aluno com dados diferentes
Chama apresentar() em cada um
*/



public class Alunopoo {

    private String nome;
    private int idade;
    private String curso;

    public Alunopoo(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e curso " + curso + ".");
    }

}


    class Main {
    public static void main(String[] args) {
        Alunopoo aluno1 = new Alunopoo("João", 20, "Engenharia");
        Alunopoo aluno2 = new Alunopoo("Maria", 22, "Medicina");
        Alunopoo aluno3 = new Alunopoo("Pedro", 19, "Direito");

        aluno1.apresentar();
        aluno2.apresentar();
        aluno3.apresentar();
    }
}