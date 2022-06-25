/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Helper;

import DAO.JPAUTIL;
import DAO.PessoaDAO;
import Model.Pessoa;
import Model.Usuario;
import View.Cadastrar;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class CadastrarHelper implements Helper {
    EntityManager em = new JPAUTIL().getEntityManager();
    private final Cadastrar view;

    public CadastrarHelper(Cadastrar view) {
        this.view = view;
    }
     
    @Override
    public void limpartela() {
          
    }

    @Override
    public Usuario obtermodelo() {
            String nome = view.getTextnome().getText();
            String data = view.getTextdata().getText();
            String usuario = view.getUsertext().getText();
            String senha = view.getSenhatext().getText();
            
            PessoaDAO pdao = new PessoaDAO(em);
            Pessoa p = new Pessoa(nome, data);
            em.getTransaction().begin();
            pdao.insert(p);
            em.getTransaction().commit();
            em.close();
            Usuario u = new Usuario(usuario, senha, p, 2000);
            return u;
    }

    public void exibirmensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void exibirmensagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
