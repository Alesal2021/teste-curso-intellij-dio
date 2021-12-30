package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);




       /* int a = 5;
        int  b = 6;
        System.out.println("hello world " + (a+b));*/
    }
}
class livro{
    private String nome;
    private Integer numpagina;

    public livro(String nome, Integer numpagina) {
        this.nome = nome;
        this.numpagina = numpagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpagina() {
        return numpagina;
    }

    public void setNumpagina(Integer numpagina) {
        this.numpagina = numpagina;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numpagina=" + numpagina +
                '}';
    }
}