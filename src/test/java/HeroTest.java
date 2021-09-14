import org.junit.Test;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
//    @After
//    public void Delete(){
//        Hero.clearAllHeroes();
//    }

    @Test
        public void Hero_instantiates_correctly() throws Exception{
        Hero hero = new Hero("aron", 12, "power", "weakness", 1);
        assertEquals(true, hero instanceof Hero);
    }
    @Test
    public void NewHeroObjectGetCorrectlyCreated() {
        Hero hero = new Hero("name", 8, "power", "weakness", 9);
        Hero hero2 = new Hero ("superman", 9, "sniffing","love", 8);
        assertEquals(2, Hero.getAll());
    }

    @Test
    public void AllHeroReturnsAllObjrcts() {
        Hero hero = new Hero("superman", 9, "sniffing","love" ,4);
        Hero hero2 = new Hero ("superman", 9, "sniffing","love",4 );
        assertTrue(Hero.getAll().contains(hero));
        assertTrue(Hero.getAll().contains(hero2));
    }

}

