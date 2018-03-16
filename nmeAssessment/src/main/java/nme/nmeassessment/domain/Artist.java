/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.domain;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Chris
 */
public class Artist {
    
    @Id
    @Column(name = "artistId")
    private int artistID;
    private String artistName;
    private String genre;
    private int sales;
    
    public Artist() {
        
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Artist{" + "artistID=" + artistID + ", artistName=" + artistName + ", genre=" + genre + ", sales=" + sales + '}';
    }
    
    
    
}
