/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Helper;

import DAO.JPAUTIL;
import Model.Moeda;
import View.CadastrarMoeda;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class CadastrarMoedaHelper implements Helper {
    EntityManager em = new JPAUTIL().getEntityManager();
    private final CadastrarMoeda view;

    public CadastrarMoedaHelper(CadastrarMoeda view) {
        this.view = view;
    }
     
    @Override
    public void limpartela() {
          
    }

    @Override
    public Moeda obtermodelo() {
            String cod = view.getCodigoMoeda().getText();
            String nome = view.getNomeMoeda().getText();
            float valor = Float.parseFloat(view.getValorMoeda().getText());

            Moeda m = new Moeda(cod, nome, valor);
            return m;
    }

    public void exibirmensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void exibirmensagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
