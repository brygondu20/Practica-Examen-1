/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.view;

import com.uia.is12.business.SongBusiness;
import com.uia.is12.data.SongDAO;
import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class SongView extends Thread{

    private SongBusiness songBusiness;
    
    public SongView(){
        
        this.songBusiness = new SongBusiness();
        
    }

    public void run(){
        
        try {
            
            
            
            ArrayList<Verse> verse = songBusiness.getSong().getVerse();
            
            
            
             for(Verse v : verse){
                Thread.sleep(5000); 
                System.out.println(v.getParagraph());
            }
            
           
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
