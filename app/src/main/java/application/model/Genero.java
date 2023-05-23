package application.model;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

import java.util.Set;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity

@Table(name="genero")

public class Genero {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String nome;

    @OneToMany(mappedBy = "genero")
    
    private Set<Livro> livros;

    public Set<Livro> getLivros() {

        return livros;

    }

    public void setLivros(Set<Livro> livros) {

        this.livros = livros;
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
