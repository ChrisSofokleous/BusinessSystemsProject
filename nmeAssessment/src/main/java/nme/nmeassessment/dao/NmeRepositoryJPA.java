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
import nme.nmeassessment.domain.Album;
import nme.nmeassessment.domain.Artist;
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
    
    
    public List<Artist> finsAllArtists() {
        TypedQuery<Artist>query = em.createQuery("SELECT a FROM Artist as a", Artist.class);
        return query.getResultList();
    }
    
    @Override
    public List<Track> findAllTracks() {
        TypedQuery<Track>query = em.createQuery("SELECT t FROM Track as t", Track.class);
        return query.getResultList();
    }
    
    @Override
    public List<Album> findAllAlbums() {
        TypedQuery<Album>query = em.createQuery("SELECT a FROM Album as a", Album.class);
        return query.getResultList();
    }
    
<<<<<<< HEAD
    @Override
=======
    /*
>>>>>>> 01b87dcbfb92d8803a1c6f67f7763a3e8cc83c01
    public int artistCount() {
        TypedQuery<Integer> query = em.createQuery("SELECT a FROM Album as a", Integer.class);
        return query.getSingleResult();
    }
    */
    
    
}
