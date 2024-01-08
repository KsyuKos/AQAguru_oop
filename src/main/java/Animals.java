import Enums.Gender;
import Enums.Type;

public abstract class Animals{
    protected Gender gender;
    protected int age;
    protected String nickname;
    protected Type type;
    protected boolean isPet;
    protected String countryBorn;
    protected String areaLiving;
    protected String sizing;

    public Animals(Gender gender, int age, String nickname, Type type, boolean isPet, String countryBorn, String areaLiving, String sizing) {
        this.gender = gender;
        this.age = age;
        this.nickname = nickname;
        this.type = type;
        this.isPet = isPet;
        this.countryBorn = countryBorn;
        this.areaLiving = areaLiving;
        this.sizing = sizing;
    }

    public void setAreaLiving(String areaLiving) {
        this.areaLiving = areaLiving;
    }

    public boolean isPet() {
        return this.isPet;
    }

    public abstract void makeVoice();


}
