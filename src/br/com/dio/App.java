package br.com.dio;
import br.com.dio.model.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato();
        Livro livro = new Livro();
        System.out.println(gato);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private String npag;
}
