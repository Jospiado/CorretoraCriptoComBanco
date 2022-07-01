/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Helper.MenuPrincipalHelper;
import DAO.JPAUTIL;
import DAO.MoedaDAO;
import DAO.ServicoDAO;
import Model.Moeda;
import Model.Servico;
import View.CadastrarMoeda;
import View.Depositar;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;



public class MenuPrincipalController {
    EntityManager em = new JPAUTIL().getEntityManager();
    private final MenuPrincipal view;
    private final MenuPrincipalHelper helper;
    
    
    
    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
        this.helper = new MenuPrincipalHelper(view);
    }
    
    public void setarvalorPatrimonio(){
        float saldo = helper.obterSALDO();
        float saldobtc = helper.obterSALDOBTC();
        
        view.getValorreal().setText(saldo+"");
        view.getValorbtc().setText(saldobtc+"");
    }
    public void setarmoedas(){
        MoedaDAO moedabd = new MoedaDAO(em);
        ArrayList<Moeda> moedas = (ArrayList<Moeda>) moedabd.selectAll();
        
        helper.preenchermoedas(moedas);
    }
    public void setaremcarteira(){
        
        Moeda moeda= (Moeda) view.getCombomoedas().getSelectedItem();
        
       if(moeda != null){
        view.getTextemcarteira().setText(moeda.getPreco_unidade()+"");
       }
    }
    public void setarpreco(){
         Moeda moeda= (Moeda) view.getCombomoedas().getSelectedItem();
         
        float quantia = Float.parseFloat(view.getQuantia().getText());
         
        float preco = moeda.getPreco_unidade()*quantia;
                     
        view.getPreco().setText(preco+"");

    }
    public void atualizartabelacompra(){
        //buscar lista com as compras no banco de dados
        ServicoDAO CompraDAO = new ServicoDAO(em);
        ArrayList<Servico> compras = (ArrayList<Servico>) CompraDAO.selectAll();
        //exibir lista na view
        helper.preenchertabela(compras);
    }
    public void atualizartabelavenda(){      
        //buscar lista com as vendas no banco de dados
        ServicoDAO VendaDAO = new ServicoDAO(em);
        ArrayList<Servico> vendas = (ArrayList<Servico>) VendaDAO.selectAll();
        
        //exibir lista na view
        helper.preenchertabela(vendas);
    }
    public void atualizartabeladeposito(){
        //buscar lista com os depositos no banco de dados
        ServicoDAO DepositoDAO = new ServicoDAO(em);
        ArrayList<Servico> depositos = (ArrayList<Servico>) DepositoDAO.selectAll();
        
        //exibir lista na view
        helper.preenchertabela(depositos);
    }
    public void compra(){
        Moeda moeda= (Moeda) view.getCombomoedas().getSelectedItem();
        float valorsaldo = Float.parseFloat(view.getValorreal().getText());
        float preco = Float.parseFloat(view.getPreco().getText());
        float quantidade = Float.parseFloat(view.getQuantia().getText());
        
        if(valorsaldo>=preco){
        
        //buscar objeto servico compra da tela
        Servico compra = helper.obtercompra();
        
        //salvar no bd
        new ServicoDAO(em).insert(compra);
            
        atualizartabelacompra();      
        // mudar os valores da tela
        
        view.getValorreal().setText(valorsaldo-preco+"");
        float valorbtc = (valorsaldo)/242000;
        view.getValorbtc().setText(valorbtc+"");
        
        //MoedaDAO moedas = new MoedaDAO(em);
        
        //Moeda moedadeagora = moedas.selectporId(moeda);
        //moedadeagora.setPreco_unidade(moedadeagora.getPreco_unidade()+quantidade);
            
        JOptionPane.showMessageDialog(null,"Compra Realizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
        helper.limpartela();
    }
        public void venda(){  
        
        Moeda moeda= (Moeda) view.getCombomoedas().getSelectedItem();
        float valorsaldo = Float.parseFloat(view.getValorreal().getText());
        float preco = Float.parseFloat(view.getPreco().getText())*1.05f;
        float quantidade = Float.parseFloat(view.getQuantia().getText());
        
        if(quantidade*moeda.getPreco_unidade() >=Float.parseFloat(view.getValorreal().getText())){
            JOptionPane.showMessageDialog(null, "Moedas em carteira, insuficientes!");
        }else{
            
            //buscar objeto servico venda da tela
            Servico venda = helper.obtervenda();
            
            //salvar no bd
            new ServicoDAO(em).insert(venda);
            
            atualizartabelavenda();
            // mudar os valores da tela
            view.getValorreal().setText(valorsaldo+preco+"");
            float valorbtc = Float.parseFloat(view.getValorreal().getText())/242000;
            view.getValorbtc().setText(valorbtc+"");
            //MoedaDAO moedas = new MoedaDAO(em);
            
            //Moeda moedadeagora = moedas.selectporId(moeda);
            //moedadeagora.setPreco_unidade(moedadeagora.getPreco_unidade()-quantidade);
            
            JOptionPane.showMessageDialog(null,"Venda Realizada com sucesso!");
        }
        helper.limpartela();
        }
        
        
        public void navegarparadeposito(){
            Depositar d = new Depositar();
            d.setVisible(true);
            view.dispose();
        }

    public void navegarparacadastrar() {
            new CadastrarMoeda().setVisible(true);
            view.dispose();
    }
    public void excluirServico(){
            
            int id =Integer.parseInt(view.getjTextField1().getText());
            ServicoDAO dao = new ServicoDAO(em);
            dao.deleteporId(id);
            view.preenchertabelaConstrutor();
            JOptionPane.showMessageDialog(null,"Registro excluido com sucesso!");
    }

    public void removerMoeda() {
         Moeda moeda = (Moeda) view.getCombomoedas1().getSelectedItem();
         int id = moeda.getId();
        
         MoedaDAO dao = new MoedaDAO(em);
         
         dao.deleteporId(id);
         
        DefaultComboBoxModel setarmodelos = (DefaultComboBoxModel) view.getCombomoedas().getModel();
        DefaultComboBoxModel setarmodelos2=  (DefaultComboBoxModel) view.getCombomoedas1().getModel();
        
        setarmodelos.removeAllElements();
        setarmodelos2.removeAllElements();
        
        
        setarmoedas();
         JOptionPane.showMessageDialog(null,"Moeda excluida com sucesso!");
    }
 }
 
    
