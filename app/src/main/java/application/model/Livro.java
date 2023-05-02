package application.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name="livros")
public class Livro {

    private int id;

    private String titulo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
