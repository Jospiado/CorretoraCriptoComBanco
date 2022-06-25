/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Helper;

import Model.Moeda;
import Model.Servico;
import View.Depositar;
import javax.swing.JOptionPane;



public class DepositarHelper implements Helper{
       private Depositar view;
    public DepositarHelper(Depositar view){
        this.view = view;
    }

  
       
      public Servico obterdeposito(float valor , String data){
        float valorthis = valor;
        float quantia = valor;
        float precototal = valor;
        float precototalbtc = valor/242000;
        String datathis = data;
        Moeda moeda = new Moeda("BRL", "Real", 1);
        
        Servico deposito = new Servico(moeda.getCod(),moeda.getNome(),"Depósito", datathis ,moeda , quantia, precototal, precototalbtc, moeda.getPreco_unidade());
        
        return deposito;                                     
    }     
    //Sobrescrita de métodos

    @Override
    public void limpartela() {
     }

    @Override
    public Object obtermodelo() {
           return null;
    }

    @Override
    public void exibirmensagem() {
 
     }
    public void exibirmensagem(String mensagem) {
            JOptionPane.showMessageDialog(null, mensagem);
     }
}
