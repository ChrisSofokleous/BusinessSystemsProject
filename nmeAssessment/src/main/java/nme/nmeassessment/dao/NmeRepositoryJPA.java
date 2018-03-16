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
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import nme.nmeassessment.domain.Album;
import nme.nmeassessment.domain.Artist;
import nme.nmeassessment.domain.Track;

/**
 *
 * @author Jordan Bolton
 */
@Stateless
public class NmeRepositoryJPA implements NmeRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    
    public List<Artist> finsAllArtists() {
        TypedQuery<Artist>query = em.createQuery("SELECT a FROM Artist as a", Artist.class);
        return query.getResultList();
    }
    
    public List<Track> findAllTracks() {
        TypedQuery<Track>query = em.createQuery("SELECT t FROM Track as t", Track.class);
        return query.getResultList();
    }
    
    public List<Album> findAllAlbums() {
        TypedQuery<Album>query = em.createQuery("SELECT a FROM Album as a", Album.class);
        return query.getResultList();
    }
    
    public int artistCount() {
        Query query = em.createQuery("SELECT COUNT(*) from Artist");
        return query.getSingleResult();
    }
    
    
    
}
