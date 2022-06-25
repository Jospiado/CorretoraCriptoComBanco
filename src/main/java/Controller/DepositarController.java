/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Helper.DepositarHelper;
import DAO.JPAUTIL;
import DAO.ServicoDAO;
import Model.Servico;
import View.Depositar;
import View.MenuPrincipal;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class DepositarController {
        EntityManager em = new JPAUTIL().getEntityManager();
       private final Depositar view;
       private final DepositarHelper helper;
       //private float valor;
       //private String data;

    public DepositarController(Depositar view) {
        this.view = view;
        this.helper = new DepositarHelper(view);
    }

    /*public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    */
   
       
    public void deposito(){
                float valor = Float.parseFloat(view.getValorRS().getText());
                String data = view.getData().getText();
        
                Servico deposito = new Servico("BRL", "Real", "Depósito", data, valor,  valor, valor/240000, 1);
                
                    
                
                ServicoDAO sDAO= new ServicoDAO(em);
                sDAO.insert(deposito);
                MenuPrincipal menu = new MenuPrincipal();
                
                helper.exibirmensagem("Depósito realizado com sucesso!");
                view.dispose();
    
                menu.setVisible(true);
                
              
    }
        
        
 }   
