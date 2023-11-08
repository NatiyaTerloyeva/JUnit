import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat c;


   @BeforeEach
   void setUp() {
       c=new Cat("Kitty", 'F', 4.5);

   }

    @Test
    void getName() {
       assertNotNull(c.getName());
       assertFalse(c.getName().equals(""));

    }

    @Test
    void getGender() {
       assertTrue(c.getGender() == 'M'|| c.getGender()=='F');


    }

    @Test
    void getWeightInKg() {
       assertTrue(c.getWeighhtInKg()> 0 && c.getWeighhtInKg()<=10);
    }
}