/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Pessoa {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        int id;
        String nome;
        
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date datanasc;

    public Pessoa(String nome, String datanasc) {
        this.nome = nome;
        try {
                this.datanasc = new SimpleDateFormat("dd/MM/yyyy").parse(datanasc);
            } catch (ParseException ex) {
                Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    public Pessoa() {
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

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
        
             
}
