/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class PessoaDAO {

private final EntityManager em;

    public PessoaDAO(EntityManager em) {
        this.em = em;
    }
    
    
    public Pessoa insert(Pessoa pessoa){
       em.persist(pessoa);
       return pessoa;
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pessoa
     * @return 
     */
    public Pessoa update(Pessoa pessoa){
        em.merge(pessoa);
        em.persist(pessoa);
        return pessoa;
    }
    
    public Pessoa insertOrUpdate(Pessoa pessoa){
        if(pessoa.getId() > 0){
            return this.update(pessoa);
        }
            return insert(pessoa);
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do pessoa passado
     * @param pessoa
     * @return 
     */
    public void delete(Pessoa pessoa){
        em.merge(pessoa);
        em.remove(pessoa);
    }
    public Pessoa selectporId(Pessoa pessoa){
        return em.find(Pessoa.class, pessoa);
    }
    
    public List<Pessoa> selectAll(){
           String jpql = "select u from Pessoa as u";
           Query query = em.createQuery(jpql);
           
           return retornarListaComBaseNaConsulta(query);
    }

    private List<Pessoa> retornarListaComBaseNaConsulta(Query query) {
        List<Pessoa> pessoas ;
        try{
            pessoas = query.getResultList();
        }catch(NoResultException e){
            pessoas =  new  ArrayList<Pessoa>();
        }
        return pessoas;
    }
    
   
    
    
}