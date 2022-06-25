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
import javax.persistence.OneToOne;


@Entity
public class Usuario{
        @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
        int id;
        String usuario;
        String senha;
    @OneToOne
        Pessoa pessoa;
        float saldo;

    public Usuario(String usuario, String senha, Pessoa pessoa, float saldo) {
        this.usuario = usuario;
        this.senha = senha;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public Usuario(String usuario, String senha, float saldo) {
        this.usuario = usuario;
        this.senha = senha;
        this.saldo = saldo;
    }

    public Usuario(int id, String usuario, String senha, float saldo) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.saldo = saldo;
    }

    public Usuario() {
    }

    
        
        
       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

        
}
