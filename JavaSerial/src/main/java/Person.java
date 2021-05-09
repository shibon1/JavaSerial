
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String pais;
    private int id;
    private int ano;
    private String nome;
    private int altura;

    public Person(String pais, int id, int ano, String nome, int height) {
        this.pais = pais;
        this.ano = ano;
        this.nome = nome;
        this.altura = height;
        this.id = id;
    }

    Person() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "================================= \n ID do Aluno=" + id + " || Nome do Aluno=" + nome + "\n";
    } 
        
    

}
