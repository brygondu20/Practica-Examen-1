/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {

    public SongDAO(){
        
    }
    
    public Song getSong(){
        
        Song song = new Song();
        
        ArrayList<Verse> verse = new ArrayList();
        
            verse.add(new Verse("Hola", 5000));
            verse.add(new Verse("Adios", 5000));
        
            song.setVerse(verse);
        
        return song;
    }
}
