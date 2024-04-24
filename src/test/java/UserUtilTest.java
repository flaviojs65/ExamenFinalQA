import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProjectFinal.Test.UserUtil;

public class UserUtilTest {

    private UserUtil flavio;
    private UserUtil vivi;

    @BeforeEach
    void setUp() {
        flavio = new UserUtil();
        vivi = new UserUtil();
    }

    // Test Reussi

    @Test
    @DisplayName("Ajoute Chanson")
    void testAjouterChanson() {
        flavio.ajouterSong("Billy Jean");
        assertTrue(flavio.getSongList().contains("Billy Jean"), "Erreur , Chanson n'existe pas");
    }

    @Test
    void testSetListeChansons() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("Billy Jean");
        songList.add("Despacito");
        flavio.setSongList(songList);
        assertEquals(songList, flavio.getSongList(), "Erreur de liste de chansons");
    }

    @Test
    @DisplayName("Suprimer Chanson")
    void testSupprimerChanson() {
        flavio.ajouterSong("Despacito");
        flavio.removeSong("Despacito");
        assertEquals(0, flavio.getSongList().size(), "Erreur de suppression de chanson");
    }

    @Test
    @DisplayName("Contient Chanson")
    void contientChanson() {
        flavio.ajouterSong("Back");
        assertTrue(flavio.getSongList().contains("Back"), "Erreur , Chanson n'existe pas");

    }

    @Test
    @DisplayName("Check Size List")
    void testGetSongListSize() {
        flavio.ajouterSong("Sharks");
        flavio.ajouterSong("Believer");
        flavio.ajouterSong("Enemy");
        assertEquals(3, flavio.songListSize(), "Erreur de taille de liste de chansons");
    }

    // Erreur attendue
    @Test
    @DisplayName("Test assertEquals avec Echec")
    void testAssertEquals() {
        flavio.ajouterSong("Lala");
        flavio.ajouterSong("Sharks");
        vivi.ajouterSong("Despacito");
        assertEquals(flavio.getSongList(), vivi.getSongList(),
                "Erreur de liste de chansons différente, Erreur attendue");

    }

}
