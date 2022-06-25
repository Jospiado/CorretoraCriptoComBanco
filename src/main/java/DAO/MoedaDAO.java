package DAO;

import Model.Moeda;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class MoedaDAO {
    
   private final EntityManager em;

    public MoedaDAO(EntityManager em) {
        this.em = em;
    }
    
    
    public Moeda insert(Moeda moeda){
       em.getTransaction().begin();
       em.persist(moeda);
       em.getTransaction().commit();
       em.close();
       return moeda;
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param moeda
     * @return 
     */
    public Moeda update(Moeda moeda){
        em.merge(moeda);
        em.persist(moeda);
        return moeda;
    }
    
    public Moeda insertOrUpdate(Moeda moeda){
        if(moeda.getCod() != null){
            return this.update(moeda);
        }
            return insert(moeda);
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do moeda passado
     * @param moeda 
     */
    public void delete(Moeda moeda){
        em.getTransaction().begin();
        em.merge(moeda);
        em.remove(moeda);
        em.getTransaction().commit();
        em.close();
    }
    public Moeda selectporId(Moeda moeda){
        return em.find(Moeda.class, moeda);
    }
    
    public List<Moeda> selectAll(){
           String jpql = "select u from Moeda as u";
           Query query = em.createQuery(jpql);
           
           return retornarListaComBaseNaConsulta(query);
    }

    private List<Moeda> retornarListaComBaseNaConsulta(Query query) {
        List<Moeda> moedas ;
        try{
            moedas = query.getResultList();
        }catch(NoResultException e){
            moedas =  new  ArrayList<Moeda>();
        }
        return moedas;
    }
    public boolean existeNoBancoPorMoeda(Moeda moedaNovo){
            String jpql= "select m from Moeda as m "
                    + "where m.cod = :pMoeda";
            Query query = em.createQuery(jpql);
            query.setParameter("pMoeda", moedaNovo.getCod());
            
           return !retornarListaComBaseNaConsulta(query).isEmpty();
    }
}