import static org.junit.jupiter.api.Assertions.*;

import com.ProjectFinal.Test.Calculatrice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }

    @Test
    @DisplayName("Test assertions groupées")
    void testGroupées() {
        assertAll("Test",
                () -> assertEquals(4, calculatrice.addition(2, 2),"Erreur Addition" ),
                () -> assertEquals(5  ,calculatrice.division(10, 2), "Erreur Division"),
                () -> assertEquals(4 , calculatrice.multiplication(2, 2), "Erreur Multiplication"),
                () -> assertEquals(0 , calculatrice.soustraction(2, 2), "Erreur Soustraction"));

        assertAll("Echec Test",
                () -> assertEquals(3, calculatrice.soustraction(5, 3), "Erreur Soustraction"),
                () -> assertEquals(3, calculatrice.multiplication(5, 3), "Erreur Multiplication"),
                () -> assertEquals(3, calculatrice.division(5, 3), "Erreur Division") ,
                () -> assertEquals(3, calculatrice.addition(5, 3), "Erreur Addition"));


    }

    @Test
    @DisplayName("Test Addition assertTrue ")
    void testAddition() {
        assertTrue(6 == this.calculatrice.addition( 5, 4), "Erreur expexted");
    }

    @Test
    @DisplayName("Test Soustraction ")
    void testSoustraction() {
        assertFalse(6 == this.calculatrice.soustraction( 5, 3), "False expected Soustraction");

    }

    @Test
    @DisplayName("Test Multiplication ")
    void testMultiplication() {
        assertTrue(15 == calculatrice.multiplication(3, 5));
    }

    @Test
    @DisplayName("Test Division ")
    void testDivision() {
        assertEquals(2, calculatrice.division(10, 5));
        assertThrows(IllegalArgumentException.class, () -> calculatrice.division(10, 0));
    }


    @DisplayName("Test Double avec Param")
    @ParameterizedTest
    @ValueSource(ints = { 2 , -1 , 0 })
    void testAvecParam(int n) {
        int t = n * 2 ;
        assertEquals( t, calculatrice.addition( n , n ) ,"Erreur Addition");
    }










}
