/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Moeda;
import Model.Pessoa;
import Model.Usuario;
import javax.persistence.EntityManager;



public class TesteHibernate {
    public static void main(String[] args) {
       
       Moeda moeda = new Moeda("BRL", "Real", 1);        
       /* Moeda moeda1 = new Moeda("BTC","Bitcoin",242000f);
        Moeda moeda2 = new Moeda("ETH","Etherium", 16000.00f);
        Moeda moeda3 = new Moeda("ADA","Cardano", 10.90f);  
       */
        
        EntityManager em = new JPAUTIL().getEntityManager();
        
        
        
        em.getTransaction().begin();
        /*em.persist(p);
        em.persist(p2);
        em.persist(u);
        em.persist(u2);*/
        em.persist(moeda);
        /*em.persist(moeda1);
        em.persist(moeda2);
        em.persist(moeda3);*/
        em.getTransaction().commit();
        em.close();
      
       
    }
    
}
