/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"cod"})})
public class Moeda{
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int id;
        private String cod;
        private String nome;
        private float preco_unidade;

    public Moeda() {
    }

    public Moeda(String cod) {
        this.cod = cod;
    }
    

    
    public Moeda(String cod, String nome, float preco_unidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco_unidade = preco_unidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco_unidade() {
        return preco_unidade;
    }

    public void setPreco_unidade(float preco_unidade) {
        this.preco_unidade = preco_unidade;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
        
}
