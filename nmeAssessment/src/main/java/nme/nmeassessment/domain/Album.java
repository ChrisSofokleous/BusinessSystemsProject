/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chris
 */

@Entity
public class Album {
    @Id
    @Column(name="albumId")
    private int albumID;
    
    private String albumTitle;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Column(name="artistId")
    private int artistID;
    
    public Album() {
        
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    @Override
    public String toString() {
        return "Album{" + "albumID=" + albumID + ", albumTitle=" + albumTitle + ", releaseDate=" + releaseDate + ", artistID=" + artistID + '}';
    }
    
    
    
    
}
