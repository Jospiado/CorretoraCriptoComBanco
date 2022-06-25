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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Servico {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        int id;
        private String cod_moeda;
        private String nome_moeda;
        private float valorunico_moeda;
        private String descricao;
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date data;
        @OneToOne
        private Moeda moeda;
        private float quantidade_operacao;
        private float valor_operacao;
        private float valor_operacaoBTC;

    public Servico(String cod_moeda,String nome_moeda,String descricao, String data, Moeda moeda, float quantidade_operacao, float valor_operacao, float valor_operacaoBTC,float valorunico_moeda) {
        this.descricao = descricao;
            try {
                this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            } catch (ParseException ex) {
                Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.moeda = moeda;
        this.quantidade_operacao = quantidade_operacao;
        this.valor_operacao = valor_operacao;
        this.valor_operacaoBTC = valor_operacaoBTC;
        this.valorunico_moeda=valorunico_moeda;
        this.nome_moeda=nome_moeda;
        this.cod_moeda=cod_moeda;
    }

    public Servico(String cod_moeda,String nome_moeda,String descricao, String data,float quantidade_operacao, float valor_operacao, float valor_operacaoBTC,float valorunico_moeda) {
        this.descricao = descricao;
            try {
                this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            } catch (ParseException ex) {
                Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.quantidade_operacao = quantidade_operacao;
        this.valor_operacao = valor_operacao;
        this.valor_operacaoBTC = valor_operacaoBTC;
        this.valorunico_moeda=valorunico_moeda;
        this.nome_moeda=nome_moeda;
        this.cod_moeda=cod_moeda;
    }

    public Servico() {
    }

        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() { 
            return new SimpleDateFormat("dd/MM/yyyy").format(data);         
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public String getCod_moeda() {
        return cod_moeda;
    }

    public void setCod_moeda(String cod_moeda) {
        this.cod_moeda = cod_moeda;
    }

    public String getNome_moeda() {
        return nome_moeda;
    }

    public void setNome_moeda(String nome_moeda) {
        this.nome_moeda = nome_moeda;
    }

    public float getValorunico_moeda() {
        return valorunico_moeda;
    }

    public void setValorunico_moeda(float valorunico_moeda) {
        this.valorunico_moeda = valorunico_moeda;
    }
    public float getQuantidade_operacao() {
        return quantidade_operacao;
    }

    public void setQuantidade_operacao(float quantidade_operacao) {
        this.quantidade_operacao = quantidade_operacao;
    }

    public float getValor_operacao() {
        return valor_operacao;
    }

    public void setValor_operacao(float valor_operacao) {
        this.valor_operacao = valor_operacao;
    }

    public float getValor_operacaoBTC() {
        return valor_operacaoBTC;
    }

    public void setValor_operacaoBTC(float valor_operacaoBTC) {
        this.valor_operacaoBTC = valor_operacaoBTC;
    }
        

}
