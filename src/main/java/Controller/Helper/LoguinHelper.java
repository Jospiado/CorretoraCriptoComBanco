/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Helper;

import Model.Usuario;
import View.Loguin;
import javax.swing.JOptionPane;




public class LoguinHelper implements Helper{
    
    private final Loguin view;
    
    
    
    public LoguinHelper(Loguin view) {
        this.view=view;
    }

    //Sobrescrita de métodos
                
    @Override
    public Usuario obtermodelo() {
            String nome = view.getjTextUser().getText();
            String senha = view.getJTextSenha().getText();
            
            Usuario u = new Usuario(nome, senha, 2000);
            return u;
    }

    @Override
    public void limpartela() {
        view.getjTextUser().setText("");
        view.getJTextSenha().setText("");
    }
    //Sobrecarga de métodos
    @Override
    public void exibirmensagem(){
        JOptionPane.showMessageDialog(null, "Erro no Sistema");
    }
    
    public void exibirmensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    

}
