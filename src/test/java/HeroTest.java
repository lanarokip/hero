import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Before
    public void Delete(){
        Hero.clearAllHeroes();
    }
    @Test
    public void NewHeroObjectGetCorrectlyCreated() {
        Hero hero = new Hero("name", 4 , "kill", "run", 4 );
        Hero hero2 = new Hero ("name", 4 , "kill", "run", 4  );
        assertEquals(2, Hero.getAll().size());
    }

    @Test
    public void AllHeroReturnsAllObjects() {
        Hero hero = new Hero("name", 4 , "kill", "run", 4  );
        Hero hero2 = new Hero ("name", 4 , "kill", "run", 4  );
        assertTrue(Hero.getAll().contains(hero));
        assertTrue(Hero.getAll().contains(hero2));
    }


}

