/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Helper.CadastrarMoedaHelper;
import DAO.JPAUTIL;
import DAO.MoedaDAO;
import Model.Moeda;
import View.CadastrarMoeda;
import View.MenuPrincipal;
import javax.persistence.EntityManager;


public class CadastrarMoedaController {
        EntityManager em = new JPAUTIL().getEntityManager();
        private final CadastrarMoeda view;
        private final CadastrarMoedaHelper helper;

    public CadastrarMoedaController(CadastrarMoeda view) {
        this.view = view;
        this.helper= new CadastrarMoedaHelper(view);
    }
        
    public void cadastrarmoeda(){
        
        Moeda m = helper.obtermodelo();
        
        MoedaDAO mdao = new MoedaDAO(em);
        
        if(mdao.existeNoBancoPorMoeda(m)){
            this.helper.exibirmensagem("Moeda já existe no banco!");
            this.view.dispose();
            new MenuPrincipal().setVisible(true);
        }else{
        mdao.insert(m);
        this.helper.exibirmensagem("Moeda cadastrada com Sucesso!");
        this.view.dispose();
        new MenuPrincipal().setVisible(true);
        }
    }
    public void cancelar(){
        this.view.dispose();
        new MenuPrincipal().setVisible(true);
    }
}
