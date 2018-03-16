/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import nme.nmeassessment.domain.Track;

/**
 *
 * @author Jordan Bolton
 */
@Stateless
public class NmeRepositoryJPA implements NmeRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Track> findTracksOnAlbum(int albumID) {
        TypedQuery<Track> query = em.createQuery("SELECT t from Track as t WHERE t.albumID =:albumID", Track.class);
        query.setParameter("albumID", albumID);
        return query.getResultList();
    }
    
    
    
}
