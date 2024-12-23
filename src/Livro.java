public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public Livro (Autor autor) {
        this.autor = autor;
        this.isbn ="000-00-00000-00-0";
        this.impresso = true;
    }


    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome );
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
    }



    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem >0.3){
            return false;

        }

        this.valor -= this.valor *porcentagem;
        return true;


    }
}
