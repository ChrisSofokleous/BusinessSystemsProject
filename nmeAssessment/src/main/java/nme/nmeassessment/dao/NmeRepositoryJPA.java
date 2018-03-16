/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jordan Bolton
 */
@Stateless
public class NmeRepositoryJPA implements NmeRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    
    
}
