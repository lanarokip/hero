import java.util.ArrayList;
import java.util.List;

public class HeroSquad {
    private String leader;
    private String name;
    private int size;
    private int id;
    private String mission;
    private static ArrayList<HeroSquad> mInstances = new ArrayList<>();
    private List<Hero> heroes = new ArrayList<>();

    public HeroSquad(String leader, String name, int size, String mission){
        this.name=name;
        this.leader=leader;
        this.size= size;
        this.mission=mission;
        mInstances.add(this);
        this.id= mInstances.size();

    }

//    public HeroSquad(String name, int age, String strength, String weakness) {
//    }

    public String getLeader(){
        return leader;
    }
    public  String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public String getMission(){
        return mission;
    }
    public int getId(){
        return id;
    }

    public List<Hero> getHeroes(){
        return heroes;
    }
    public void addHero(Hero hero){
        if (heroes.size()<this.getSize()){
            heroes.add(hero);
        }
    }
    public static ArrayList<HeroSquad> getmInstances(){
        return mInstances;
    }
    public static void clearSquad(){
        mInstances.clear();
    }

    public static HeroSquad find(int n) {
        return mInstances.get(n-1);
    }
    public void heroTerminate(Hero hero){
        heroes.remove(hero);
    }

}
