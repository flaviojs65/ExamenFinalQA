import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ProjectFinal.Test.Song;
import com.ProjectFinal.Test.User;

public class UserTest {

    private User flavio;

    @BeforeEach
    void setUp() {
        flavio = new User();
    }

    @Test
    @DisplayName("Test Ajouter Song ")
    void testAddSong() {
        Song Believer = new Song("Believer", "Imagine Dragons", 3, 15);
        flavio.addSong(Believer);
    }

    @Test
    @DisplayName("Compare user ListeSong")
    void testCompareUserListeSong() {
        Song Believer = new Song("Believer", "Imagine Dragons", 3, 15);
        Song Believer2 = new Song("Believer", "Imagine Dragons", 3, 15);

        flavio.addSong(Believer);
        flavio.addSong(Believer2);

        ArrayList<Song> Vivi = new ArrayList<>();
        Vivi.add(Believer);
        Vivi.add(Believer2);

        assertEquals(Vivi, flavio.getSongList(), "Erreur comparaison de liste de chansons");
    }

    @Test
    @DisplayName("Test Comparation Chansons")
    void testCompareSongs() {

        Song Believer = new Song("Believer", "Imagine Dragons", 3, 15);
        Song Believer2 = new Song("Believer", "Imagine Dragons", 3, 15);

        assertTrue(Believer.compareSong(Believer2), "Erreur comparaison de chansons");
    }

    @Test
    @DisplayName("Test comparation different  Chansons")
    void testCompareDiffSongs() {

        Song Believer = new Song("Believer", "Imagine Dragons", 3, 15);
        Song ChildrenOfTheSky = new Song("Children Of The Sky", "Imagine Dragons", 2, 15);

        assertTrue(Believer.compareSong(ChildrenOfTheSky), "Erreur comparaison de chansons");
    }
}
