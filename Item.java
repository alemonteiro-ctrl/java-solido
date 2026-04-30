/*
Sistema de Gerenciamento de Biblioteca
construir um sistema que usa tudo:
Classes:
abstract class Item — base de tudo:
Atributos: titulo, anoPublicacao
Construtor e getters
Método abstrato exibirDetalhes()
interface Emprestavel:
emprestar(String nomeUsuario)
devolver()
class Livro extends Item implements Emprestavel:
Atributos extras: autor, numeroPaginas
Atributo de controle: emprestado (boolean), usuarioAtual (String)
Implementa exibirDetalhes() e os métodos da interface
emprestar() só funciona se o livro não estiver emprestado
devolver() só funciona se estiver emprestado
class Revista extends Item:
Atributo extra: edicao (int)
Implementa exibirDetalhes()
Revista não é emprestável
No main:
Cria um ArrayList<Item> com pelo menos 2 livros e 2 revistas
Percorre e chama exibirDetalhes() em todos
Tenta emprestar um livro duas vezes seguidas pra testar a validação
Devolve o livro e empresta de novo
*/

public abstract class Item {

    private String titulo;
    private int anoPublicado;

    public Item(String titulo, int anoPublicado) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public abstract void exibirDetalhes();
    
}

interface Emprestavel {

    void emprestar(String nomeUsuario);
    void devolver();

}

class Livro extends Item implements Emprestavel {

    private String autor;
    private int numeroPaginas;
    private boolean emprestado;
    private String usuarioAtual;

    public Livro(String titulo, int anoPublicado, String autor, int numeroPaginas) {
        super(titulo, anoPublicado);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
        this.usuarioAtual = null;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicado());
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Emprestado: " + emprestado);
        if (emprestado) {
            System.out.println("Usuário Atual: " + usuarioAtual);
        }        
    }

    @Override
    public void emprestar(String nomeUsuario) {
        if (!emprestado) {
            emprestado = true;
            usuarioAtual = nomeUsuario;
            System.out.println("Livro emprestado para " + nomeUsuario);
        } else {
            System.out.println("Livro já está emprestado para " + usuarioAtual);
        }        
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido por " + usuarioAtual);
            usuarioAtual = null;
        } else {
            System.out.println("Livro não está emprestado");
        }        
    }
}
