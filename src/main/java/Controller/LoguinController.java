/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Helper.LoguinHelper;
import DAO.JPAUTIL;
import DAO.UsuarioDAO;
import Model.Usuario;
import View.Cadastrar;
import View.Loguin;
import View.MenuPrincipal;
import javax.persistence.EntityManager;




public class LoguinController {
    EntityManager em = new JPAUTIL().getEntityManager();
    private final Loguin view;
    private final LoguinHelper helper;

    public LoguinController(Loguin view) {
        this.view = view;
        this.helper= new LoguinHelper(view);
    }
    
    
    public void entrarnomenu(){
        //pegar usuario da view
        Usuario usuario = helper.obtermodelo();
        //buscar no banco de dados
        UsuarioDAO usuariodao= new UsuarioDAO(em);
        boolean usuarioautenticado = usuariodao.existeNoBancoPorUsuarioeSenha(usuario);
        
         //se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco, direcionar para menu
        //senao mostrar uma mensagem ao usuario "Usuario e senha invalidos"
        if(usuarioautenticado == true){
            //navegar para menuprincipal
            MenuPrincipal m = new MenuPrincipal();
            m.setVisible(true);
            this.view.dispose();
        }else{
            helper.limpartela();
            helper.exibirmensagem("Usuário ou senha invalidos");
        }
    
    }
    public void irCadastro(){
            Cadastrar c = new Cadastrar();
            c.setVisible(true);
            this.view.dispose();
    }
}
