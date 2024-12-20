public class Main {
    public static void main(String[] args) {
        Autor novoAutor = new Autor();
        novoAutor.setNome("Rodrigo Turini");
        novoAutor.setEmail("rodrigo.turini@caelum.com.br");
        novoAutor.setCpf("123.456.789.10");

        Livro livro = new Livro(novoAutor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.mostrarDetalhes();

        if(!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto do livro não pode ser maior que 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }


        Ebook ebook = new Ebook(novoAutor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        }else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}