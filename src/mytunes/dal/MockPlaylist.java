/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.dal;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunes.be.Playlist;
import mytunes.be.Song;

/**
 *
 * @author mega_
 */
public class MockPlaylist {

    

    List<Playlist> playlists = new ArrayList();
    

    public MockPlaylist() {
        
         Playlist playlist = new Playlist(0, "Chilli");
    Song songToAdd1 = new Song(0, "NadiasSong", "ChiliBAnds", "Pop", 0, "Belshazzar.mp3");
    Song songToAdd2 = new Song(0, "AlansSong", "ChiliBand", "Country", 0, "Belshazzar.mp3");

    playlist.addSongToList (songToAdd1);

    playlist.addSongToList (songToAdd2);

    }
     public List<Playlist> getAllPlaylists(){
     
     return playlists;
         
     }

   public void savePlaylist(Playlist playlist) {

        playlists.add(playlist);

    }

}
