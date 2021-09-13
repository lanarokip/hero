import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String strength;
    private String weakness;
    private int id;
    private int sId;

    private static List<Hero> mInstances = new ArrayList<>();



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getSpecialPower(){
        return strength;
    }
    public String getWeakness(){
        return weakness;
    }
    public static List<Hero> getAll(){
        return mInstances;
    }
//to delete the hero

    public static void clearAllHeroes(){
        mInstances.clear();
    }
    public Hero(String name ,int age,String strength, int sId, String weakness){
        this.name=name;
        this.age=age;
        this.weakness=weakness;
        this.strength=strength;
        this.sId=sId;
        HeroSquad heroSquad= HeroSquad.find(sId);
        heroSquad.addHero(this);
        mInstances.add(this);
        this.id=mInstances.size();

    }
    public static void clearAll(){
        mInstances.clear();
    }

    public int getId() {
        return id;
    }

    public int getsId() {
        return sId;
    }

}
