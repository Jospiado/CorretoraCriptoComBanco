/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Helper.CadastrarHelper;
import DAO.JPAUTIL;
import DAO.UsuarioDAO;
import Model.Usuario;
import View.Cadastrar;
import View.Loguin;
import javax.persistence.EntityManager;


public class CadastrarController {
        EntityManager em = new JPAUTIL().getEntityManager();
        private final Cadastrar view;
        private final CadastrarHelper helper;

    public CadastrarController(Cadastrar view) {
        this.view = view;
        this.helper= new CadastrarHelper(view);
    }
        
    public void cadastrarusuario(){
        
        Usuario u = helper.obtermodelo();
        
        UsuarioDAO udao = new UsuarioDAO(em);
        
        if(udao.existeNoBancoPorUsuario(u)){
            this.helper.exibirmensagem("Usuário já existe no banco!");
            this.view.dispose();
            new Loguin().setVisible(true);
        }else{
        em.getTransaction().begin();
        udao.insert(u);
        em.getTransaction().commit();
        em.close();
        this.helper.exibirmensagem("Usuário cadastrado com Sucesso!");
        this.view.dispose();
        new Loguin().setVisible(true);
        }
    }
    public void cancelar(){
        this.view.dispose();
        new Loguin().setVisible(true);
    }
}
