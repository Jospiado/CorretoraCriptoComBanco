package DAO;

import Model.Servico;
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

/**
 *
 * @author 
 */
public class ServicoDAO {
    
    private final EntityManager em;

    public ServicoDAO(EntityManager em) {
        this.em = em;
    }
    
    
    public Servico insert(Servico servico){
       em.getTransaction().begin();
       em.persist(servico);
       em.getTransaction().commit();
       return servico;
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public Servico update(Servico servico){
        em.merge(servico);
        em.persist(servico);
        return servico;
    }
    
    public Servico insertOrUpdate(Servico servico){
        if(servico.getId() > 0){
            return this.update(servico);
        }
            return insert(servico);
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public void deleteporId(int id){
        
        em.getTransaction().begin();
        
            String jpql= "delete from Servico"
                    + " where id  = :ParametroId";
            Query query = em.createQuery(jpql);
            query.setParameter("ParametroId", id);
            query.executeUpdate();
            
        em.getTransaction().commit();
    }
    public Servico selectporId(Servico servico){
        return em.find(Servico.class, servico);
    }
    
    public List<Servico> selectAll(){
           String jpql = "select u from Servico as u";
           Query query = em.createQuery(jpql);
           
           return retornarListaComBaseNaConsulta(query);
    }

    private List<Servico> retornarListaComBaseNaConsulta(Query query) {
        List<Servico> servicos ;
        try{
            servicos = query.getResultList();
        }catch(NoResultException e){
            servicos =  new  ArrayList<Servico>();
        }
        return servicos;
    }
}