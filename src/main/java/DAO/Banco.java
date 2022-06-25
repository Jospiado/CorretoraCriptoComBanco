package DAO;


import Model.Moeda;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jp
 */
public class Banco {
    
    public static ArrayList<Servico> servico;
    public static ArrayList<Moeda> moeda;
    public static ArrayList<Usuario> usuario;
   
    
    
    public static void inicia(){
    
        //Instancia os Objetos        
        servico= new ArrayList<Servico>();
        moeda= new ArrayList<Moeda>();
        usuario = new ArrayList<Usuario>();
        //criando elementos
        Usuario usuario1 = new Usuario("joao", "joao", 2000);
        Usuario usuario2= new Usuario("professor", "professor", 2000);
        
       
        
        Moeda moeda1 = new Moeda("BTC","Bitcoin",242000f);
        Moeda moeda2 = new Moeda("ETH","Etherium", 16000.00f);
        Moeda moeda3 = new Moeda("ADA","Cardano", 10.90f);  
        Moeda moeda4 = new Moeda("BNB","BinanceCoin", 2213f);
        Moeda moeda5 = new Moeda("DOGE","DogeCoin", 1.70f);
        Moeda moeda6 = new Moeda("SOL","SOLANA", 337f);
        Moeda moeda7 = new Moeda("XVG","VERGE", 0.18f);
        Moeda moeda8 = new Moeda("LTC","LITCOIN", 950f);
        Moeda moeda9 = new Moeda("DOT","POLKADOT", 129f);
        
        
        
       
        
        
        
        //Adiciona Elementos na lista
        
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        
        moeda.add(moeda1);
        moeda.add(moeda2);
        moeda.add(moeda3);
        moeda.add(moeda4);
        moeda.add(moeda5);
        moeda.add(moeda6);
        moeda.add(moeda7);
        moeda.add(moeda8);
        moeda.add(moeda9);
                
     
                
        
        
        

        
       
    }
    
}
