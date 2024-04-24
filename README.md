
TEST UNITAIRES CALCULATRICE


Structure 

- Calculatrice.java -> Classe Calculatrice contenant des méthodes pour l'addition, la soustraction, la multiplication et la division.

- CalculatriceTest
    
   * @BeforeEach pour initializer la calculatrice avant chaque test 
  
   * J'ai utilisé testGroupées pour séparer deux groupes et l'utilisation de assertAll pour regrouper les assertions dans une seule méthode.
    Premier groupe -> Utilisation de assertEquals pour vérifier les données avec les méthodes de la classe Calculatrice.
    Deuxième groupe -> Tests qui doivent échouer pour tester les méthodes de la Calculatrice.
   
   *  testAddition / testSoustraction / testMultiplication /testDivision avec assertFalse , assertTrue
     assertFalse pour m'assurer qu'une  condition n'est pas vrai et assertTrue pour vérifier si l'addition de deux nombres donne le résultat attendu.

  *  Avec @ParameterizedTest, je peux effectuer des tests paramétrés, je teste une méthode avec différentes données en entrée. 
      L'annotation @ValueSource fournir les donnes, par exemple {2, -1, 0} , les valeurs sont utilise pour tester la méthode calculatrice.addition(n, n) avec différents n.


